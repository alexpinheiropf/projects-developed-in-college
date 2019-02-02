from whoosh.filedb.filestore import FileStorage
from whoosh.qparser import QueryParser
import whoosh.index as index
import glob, os, codecs, sys
from whoosh.fields import Schema, TEXT, KEYWORD, ID, STORED

indexdir = "C:\\indexdir"

## CONTROLA SEQUENCIA DE IDS
seq_file = ".sequence"
def nextId():
    next_id = 100
    if (os.path.isfile(seq_file)): # se ja existir o arquivo
        file = open(seq_file, 'r')
        next_id = int(file.read()) + 1
        file.close()
        
        file = open(seq_file, 'w')
        file.write(str(next_id))
        file.close()
        
    else: # se nao existir o arquivo
        file = open(seq_file, 'w')        
        file.write('100')
        file.close()
        
    return next_id

# Verifica se existe a pasta que armazenara o indice
if (os.path.exists(indexdir) is False):
    os.mkdir(indexdir)
    os.chmod(indexdir, 777)

# Indica onde fica o indice
storage = FileStorage(indexdir)

# Cria schema
schema = Schema(
    id=ID(stored=True, unique=True),
    titulo=TEXT(stored=True),
    conteudo=TEXT(stored=True),
    tags=KEYWORD
    )

# Verifica se existe o indice chamado docs na pasta indexdir
usages_exists = index.exists_in(indexdir, indexname="docs2")
if (usages_exists is True):
    # Abre o indice gerado
    ix = storage.open_index(indexname="docs2")
else:
    # Cria novo indice
    ix = storage.create_index(schema, indexname="docs2")

def carregarTxt():
    # Passar por todos os arquivos txt da pasta docs
    writer = ix.writer()

    for num,arq in enumerate(glob.glob("docs/*.txt")):
        # Abrir arquivo
        try:
            f = codecs.open(arq, "r", "UTF-8")
        except Exception:
            print 'Falha na leitura do arquivo: ', arq
        linhas = f.readlines()
        titulo = ""
        conteudo = ""

        # le cada linha do arquivo, que possui como formato:
        # primeira linha sendo o titulo
        # demais linhas conteudo
        for i, linha in enumerate(linhas):
            if (i == 0):
                titulo = linha
            if (i == 1):
                conteudo = linha

        writer.update_document(id=unicode(num), titulo=titulo, conteudo=conteudo)
    writer.commit()

def adicionar():
    print nextId()
    titulo = raw_input("Digite o titulo do documento").decode(sys.stdin.encoding)   

    

def buscar():
    # QueryParser ... define campo padrao e schema
    qp = QueryParser("conteudo", schema)

    #
    # o usuario pode definir se ira buscar no Titulo ou Conteudo
    #

    titulo = raw_input("Busca no campo Titulo: ")
    q = qp.parse("titulo:" + titulo)

    with ix.searcher() as s:
        results = s.search(q)
        docnum = s.documents()
        print "Total de ocorrencias", results.scored_length()
        print
        for result in results:
            print '%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%'
            print 'Doc. Num: ', result.docnum
            print 'Conteudo: ', result['conteudo']
            print '%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%'

def atualizar():
    id = str(raw_input("id do documento a ser atualizado: "))
    cont = str(raw_input("novo conteudo: "))
    writer = ix.writer()
    if (ix.searcher().document(id=unicode(id)) is not None):
        writer.update_document(id=unicode(id), conteudo=unicode(cont))
        try:
            writer.commit()
        except:
            pass

def deletar():
    id = raw_input("id do documento a ser removido: ")
    writer = ix.writer()    
    writer.delete_document(long(id))
    try:
        writer.commit()
    except:
        pass

def listar():
    print '====== LISTANDO DOCUMENTOS ======'
    for i,campos in enumerate(ix.searcher().documents()):
        #print "Total de ocorrencias", stored_fields.scored_length()
        print '=============', str(i) ,'==============='

        if ("id" in campos):
            print 'id: ', campos["id"]

        if ("titulo" in campos):
            print 'titulo: ', campos["titulo"]

        if ("conteudo" in campos):
            print 'conteudo: ', campos["conteudo"]
            
    print '====== FIM LISTANDO DOCUMENTOS ======'

def main():
    while True:
        print '==== Mecanismo de Busca ===='
        print '1. Adicionar Documento'
        print '2. Realizar Busca'
        print '3. Atualizar Documento'
        print '4. Deletar Documento'
        print '5. Listar Documentos Indexados'
        print '6. Indexar documentos da pasta docs/'
        print '----------------------------'
        print '0. Sair'
        print '============================'

        opcao = int(raw_input('Escolha uma opcao: '))
        
        if (opcao == 1):
            adicionar()

        elif (opcao == 2):
            buscar()

        elif (opcao == 3):
            atualizar()

        elif (opcao == 4):
            deletar()

        elif (opcao == 5):
            listar()

        elif (opcao == 6):
            carregarTxt()

        elif (opcao == 0):
            exit()
        
        else:
            print '>> Opcao Inválida! <<'

## Chama o metodo main
if __name__ == "__main__":
    main()
