### Arvore Binaria em Python

class Nodo:
    """
    Nodo da arvore: filhos da esquerda e direita + dado (que pode ser qualquer objeto)
    """
    def __init__(self, dado):
        self.esq = None
        self.dir = None
        self.dado = dado

    def __str__(self):
        return str(self.dado)

    def inserir(self, dado):
        """
        Insere um novo nodo com dados

        @param dado a ser inserido
        """
        
        ## Insere na sub-arvore da esquerda
        if dado < self.dado:
            if self.esq is None:
                # Cria um novo nodo (que sera a sub-arvore da esquerda)
                self.esq = Nodo(dado)
            else:
                self.esq.inserir(dado)

        ## Insere na sub-arvore da direita
        elif dado > self.dado:
            if self.dir is None:
                # Cria um novo nodo (que sera a sub-arvore da direita)
                self.dir = Nodo(dado)
            else:
                self.dir.inserir(dado)

    def buscar(self, dado, pai=None):
        if dado < self.dado:
            if self.esq is None:
                return None, None
            return self.esq.buscar(dado, self)
        elif dado > self.dado:
            if self.dir is None:
                return None, None
            return self.dir.buscar(dado, self)
        else:
            return self, pai
       
    def hasChild(self, alvo):
        filhos = []

        if alvo.esq is not None:
            filhos.append(alvo.esq)
            
        elif alvo.dir is not None:
            filhos.append(alvo.dir)

        return filhos
    
    def remover(self, pai, alvo):
        filhos = self.hasChild(alvo)
           
        if (len(filhos) == 0):
            if alvo > pai:
                pai.dir = None
            elif alvo < pai:
                pai.esq = None
                
        elif (len(filhos) == 1):
            if alvo > pai:                
                pai.dir = filhos.pop()
            elif alvo < pai:
                pai.esq = filhos.pop()
            
    def imprimirEmOrdem(self):
        """
        Imprime o conteudo da arvore na tela, usando travessia em-ordem (in-order | arv_esq - raiz - arq_dir)
        """
        # Sub-arvore da Esquerda
        if self.esq:            
            self.esq.imprimirEmOrdem()

        # Raiz
        print self.dado,

        # Sub-arvore da Esquerda
        if self.dir:            
            self.dir.imprimirEmOrdem()

    def imprimirPreOrdem(self):        
        # Raiz
        print self.dado,

        # Sub-arvore da Esquerda
        if self.esq:            
            self.esq.imprimirPreOrdem()        

        # Sub-arvore da Direita
        if self.dir:            
            self.dir.imprimirPreOrdem()

    def imprimirPosOrdem(self):
        # Sub-arvore da Esquerda
        if self.esq:            
            self.esq.imprimirPosOrdem()

        # Sub-arvore da Direita
        if self.dir:            
            self.dir.imprimirPosOrdem()

        # Raiz
        print self.dado,

    def impr(self, spaces):
        out = []
        for i in range(spaces):
            out.append('...')
        return ''.join(out)

    def imprimir(self, depth=0):        
        if (self.dado is not None):
            print self.impr(depth), self.dado

            if ((self.esq or self.dir)):
                depth = depth + 1
                if (self.esq is not None):
                    self.esq.imprimir(depth)
                if (self.dir is not None):
                    self.dir.imprimir(depth)        
def main():
    # 10, 4, 3, 5, 9, 12
    
    ## Inserindo...
    raiz = Nodo(10)
    nums = [4, 3, 5, 9, 12]
    for n in nums:
        raiz.inserir(n)
    
    ## Pesquisando...
    '''
    valor = 5
    print 'Existe nodo com valor ', valor    
    achou, pai = raiz.buscar(valor)
    print 'Pai: ', pai
    if (pai is None):
        print 'Nodo com valor', achou, 'encontrado, sendo que este é o nodo raiz'
    else:
        print 'Nodo com valor', achou, 'encontrado, sendo que seu pai possui valor', pai
           
    ## Removendo...
    #print 'Remover nodo com o valor', valor,':'
    #raiz.remover(pai, achou)
    '''
    
    ## Percorrendo...
    print 'Pré Ordem :', raiz.imprimirPreOrdem()
    print 'Em Ordem  :', raiz.imprimirEmOrdem()
    print 'Pós Ordem :', raiz.imprimirPosOrdem()
    
    ## Imprimindo em niveis...
    print raiz.imprimir()
    
if __name__ == "__main__":
    main()
