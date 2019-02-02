import shlex
import uuid
from datetime import datetime as datahora
# Desafio 2 - TaskList

class Task:
    def __init__(self, titulo, completada=False, descricao=None, prazo=None, prioridade=1, status='Pausada'):
        self.titulo = titulo
        self.completada = completada
        self.id = uuid.uuid4()
        self.data_modificacao = datahora.now().strftime('%d/%m/%Y %H:%M:%S')
        self.descricao = descricao
        self.prazo = prazo # prazo deve ser uma data. ex.: 10/01/2016
        self.prioridade = prioridade # prioridade pode ser 1, 2 ou 3
        self.status = status # status pode ser: 'Pausada' ou 'Em Execução'

    def __str__(self):
        return '[Tarefa id: ', self.id, ' titulo: ', self.titulo, ' completada: ', self.completada, ']'

# Definicao de um Nodo com 2 ponteiros
class DNodo:
    # construtor
    def __init__(self, valor=None, prev=None, next=None):
        self.valor = valor
        self.prev  = prev
        self.next  = next

    # mostra o valor quando damos print
    def __str__(self):
        return str(self.valor)
    
# Definicao da Lista
class TaskList:    
    header  = DNodo()
    trailer = DNodo()

    def isEmpty(self): # retorna se a lista esta' vazia
        return (self.header.next is None and self.trailer.prev is None)

    def inserirInicio(self, item):        
        # Lista Vazia
        if self.isEmpty():
            self.header.next = item
            item.prev = self.header            
            item.next = self.trailer
            self.trailer.prev = item
        else:
            # Lista tem 1 ou + itens
            antigo = self.header.next
            self.header.next = item
            item.prev = self.header
            item.next = antigo
            antigo.prev = item

    def inserirFim(self, item):
        # Lista Vazia
        if self.isEmpty():
            raise NotImplementedError('E\' seu dever terminar o metodo ' + self.inserirFim.__name__ + ' :)')            
        else:
            raise NotImplementedError('E\' seu dever terminar o metodo ' + self.inserirFim.__name__ + ' :)')

    def removerInicio(self):
        # Lista Vazia
        if self.isEmpty():
            return 'Lista Vazia!'
        else:
            aux = self.header.next
            self.header.next = aux.next
            (aux.next).prev = self.header
            return aux
     
    def removerFim(self):
        # Lista Vazia
        if self.isEmpty():
            return 'Lista Vazia!'
        else:
            item = self.trailer.prev
            self.trailer.prev = item.prev
            (item.prev).next = self.header
            return item
        
    def buscaPorId(self, id):
        if self.isEmpty():
            return None        
        item = self.header.next
        while (item is not self.trailer):            
            tarefa = item.valor            
            if (id == str(tarefa.id)):
                return tarefa
            
            item = item.next
        
    def imprimir(self, reverso=False):
        if self.isEmpty():
            return 'Lista Vazia!'
            
        # Header ate' o Trailer
        if (reverso is not True):
           item = self.header.next
           while (item is not self.trailer):
               # item.valor : objeto da classe Task
               tarefa = item.valor
               print '============='
               print 'Tarefa id : ' ,tarefa.id
               print 'Título    : ' ,tarefa.titulo
               print 'Descrição : ' ,tarefa.descricao
               print 'Data Mod. : ' ,tarefa.data_modificacao
               print 'Prazo     : ' ,tarefa.prazo
               print 'Prioridade: ' ,tarefa.prioridade
               print 'Status    : ' ,tarefa.status
               print '============='
               
               item = item.next
               
        # Trailer ate' o Header
        else:
            item = self.trailer.prev
            while (item is not self.header):
               print item,
               item = item.prev
#------------------------------------------------------------------------------
    def imprimirId(self, reverso=False):
        if self.isEmpty():
            return 'Lista Vazia!'
            
        # Header ate' o Trailer
        
        if (reverso is not True):
           item = self.header.next
           while (item is not self.trailer):
               # item.valor : objeto da classe Task
               tarefa = item.valor
               print '============='
               print 'Tarefa id : ' ,tarefa.id
               print 'Descrição : ' ,tarefa.descricao
               print '============='
               
               item = item.next
               
        # Trailer ate' o Header
        else:
            item = self.trailer.prev
            while (item is not self.header):
               print item,
               item = item.prev
#------------------------------------------------------------------------------
               
class Console:
    def __init__(self, tasklist):
        self.tasklist = tasklist
    
    def prefix(self):
        return 'task> '

    def waitCommand(self):        
        comm = raw_input(self.prefix())
        comm = comm.strip()
        return comm
    
    def navegar(self):
            if (not self.isEmpty()):
                prim_iteracao = True
                cursor = self.header
                tecla = None
                selecionado = None
                while True:                                
                    if (tecla == '.' or prim_iteracao is True):
                        prim_iteracao = False
                        if (cursor is not None):
                            if (cursor.next is not self.trailer):                            
                                cursor = cursor.next
                                print 'Cursor atual: [',cursor,']'
                            else:
                                print '[Final da lista]'
                                
                    if (tecla == ','):                    
                        if (cursor.prev is not None):                        
                            print 'Cursor atual: [',cursor,']'
                            cursor = cursor.prev                                                                                
                        else:
                            print '[Inicio da lista]'

                    if (tecla == chr(32)):                                            
                        print 'Selecionou: ', cursor
                        selecionado = cursor

                    tecla = raw_input('(Navegue usando as teclas , ou . e selecione usando espaço+enter) -> ')
        
    def start(self):
        print '== App de Tarefas :) == LOKÃO!!!!'
        print '.. Console de comando inicializado ...'
        print ' * VAI COMEÇAR A ZUEIRA * '
           
    def parseCommand(self, comm):
        if comm.startswith(('help','?', '--help')):
            print '\n::.. Lista de comandos / Usando o app ..::'
            comandos = [
                '  help ou --help ou ?      - Esta tela de ajuda!',
                '  exit ou quit ou sair     - Finaliza o aplicativo',
                '  add <titulo entre aspas> - Adiciona nova tarefa ',
                '  done                     - Finaliza Tarefa ',
                '  list                     - Lista todas as Tarefas',
                '  status                   - Alterar Status Tarefa',
                '  pri	                    - Altera a Prioridade da Tarefa',
                '  edit                     - Edita Titulo ou Decrição da Tarefa',
                '  id                       - Faz buscas por ids',
                '  del                      - Deleta toda a Tarefa',
                '  prazo                    - Altera o Prazo da Tarefa'
            ]
            
            for item in comandos:
                print item
#------------------------------------------------------------------------------            
        elif comm.startswith('add'):            
            # verifica os demais argumentos, separados por espaço
            try:
                args = shlex.split(comm)
                if len(args) < 2:
                    print '[Aviso] Verifique a sintaxe com comando: help'
                else:
                    # Cria tarefa
                    descricao = str(raw_input('Digite a descricao da tarefa: '))                    
                    tarefa = Task(titulo=args[1], descricao=descricao)
                    
                    self.tasklist.inserirInicio( DNodo(tarefa) )
                    print '[Info] Tarefa criada com sucesso!'
                    
            except ValueError, v:
                if str(v) == 'No closing quotation':
                    print '[Aviso] Verifique as aspas duplas'
#------------------------------------------------------------------------------
                    
        elif comm.startswith('list'):
            self.tasklist.imprimir()
            
#------------------------------------------------------------------------------
        
        elif comm.startswith('id'):
            self.tasklist.imprimirId()
            #self.navegar()
#------------------------------------------------------------------------------
            
        elif comm.startswith('done'):
            id = str(raw_input('Qual o id da tarefa a ser finalizada? '))            
            tarefa = self.tasklist.buscaPorId(id)
            if (tarefa is not None):                
                tarefa.completada = True
                tarefa.status = 'completada'
                print 'Tarefa ', tarefa.id, ' completada!'                
            else:
                print 'Tarefa não encontrada'
                
             #    - Pede pro usuario o id da tarefa, usando raw_input
             #    - Com esse id, varre a estrutura retornando o objeto Task que possui este id
             #    - self.tasklist
#------------------------------------------------------------------------------
        elif comm.startswith('status'):
            id = str(raw_input('Qual o id da tarefa a ser trocado status? '))            
            tarefa = self.tasklist.buscaPorId(id)
            if (tarefa is not None):
                escolha = None
                while ((escolha is not '1') or (escolha is not '2') or (escolha is not '3') ):
                    escolha = str(raw_input("""Deseja alterar para: 
(1) Em execução
(2) Pausada
(3) Completada
::::::  """))
                
                    if (escolha == '1'):
                        tarefa.status = 'Em execução'
                        break
                    if (escolha == '2'):
                        tarefa.status = 'Pausada'
                        break
                    if (escolha == '3'):
                        tarefa.status = 'Completada'
                        break
                    else:
                        print """status inválido!!! Digite Novamente: """
                    
                print 'Tarefa ', tarefa.id, ' trocada status para ', tarefa.status                
            else:
                print 'Tarefa não encontrada'
#------------------------------------------------------------------------------
        elif comm.startswith('pri'):
            id = str(raw_input('Qual o id da tarefa a ser alterada a Prioridade? '))            
            tarefa = self.tasklist.buscaPorId(id)
            if (tarefa is not None):
                escolha = None
                while ((escolha is not '1') or (escolha is not '2') or (escolha is not '3') ):
                    escolha = str(raw_input('Deseja alterar para Prioridade 1, 2 ou 3? '))
                
                    if (escolha == '1'):
                        tarefa.prioridade = '1'
                        break
                    if (escolha == '2'):
                        tarefa.prioridade = '2'
                        break
                    if (escolha == '3'):
                        tarefa.prioridade = '3'
                        break
                    else:
                        print """status inválido!!! Digite Novamente: """
                    
                print 'Tarefa ', tarefa.id, ' trocada prioridade para ', tarefa.prioridade                
            else:
                print 'Tarefa não encontrada'
#------------------------------------------------------------------------------
        elif comm.startswith('edit'):
            id = str(raw_input('Digite o id da tarefa a ser Editado Titulo ou descrição? '))            
            tarefa = self.tasklist.buscaPorId(id)
            if (tarefa is not None):
                escolha = None
                while ((escolha is not '1') or (escolha is not '2')):
                    escolha = str(raw_input("""Deseja alterar para: 
(1) Titulo
(2) Descrição
::::::  """))
                
                    if (escolha == '1'):
                        novoTitulo = str(raw_input('Insira um novo titulo: '))
                        tarefa.titulo = novoTitulo
                        print 'Tarefa ', tarefa.id, ' foi trocado o titulo para ',tarefa.titulo
                        break
                    if (escolha == '2'):
                        novaDescricao = str(raw_input('Insira uma nova Descricao: '))                        
                        if (len(novaDescricao) == 0):
                            print 'Você não escreveu nada!!!! Digite novamente: '
                        else:
                            tarefa.descricao = novaDescricao
                        print 'Tarefa ', tarefa.id, ' foi trocado a Descrição para ',tarefa.descricao
                        break
                    else:
                        print """Numero inválido!!! Digite Novamente: """
                                   
            else:
                print 'Tarefa não encontrada'
                
#------------------------------------------------------------------------------
        elif comm.startswith('del'):
            id = str(raw_input('Qual o id da tarefa a ser Deletada? '))            
            tarefa = self.tasklist.buscaPorId(id)
            if (tarefa is not None):
                tarefa = self.tasklist.removerInicio()
                print 'Tarefa Deletada com Sucesso!'                
            else:
                print 'Tarefa não encontrada'
#------------------------------------------------------------------------------
        elif comm.startswith('prazo'):
            id = str(raw_input('Qual o id da tarefa a ser adicionado um prazo nesses módulos 00/00/0000? '))            
            tarefa = self.tasklist.buscaPorId(id)
            if (tarefa is not None): 
                 prazo = str(raw_input('Insira um Prazo válido nos moldes: '))
                 tarefa.prazo = prazo
                 print 'Tarefa ', tarefa.id, ' foi trocado o prazo para: ', tarefa.prazo
                 
            else:
                print 'Tarefa não encontrada'
                
#------------------------------------------------------------------------------                
        
        elif comm.startswith(('exit','sair')):
            exit(0)
#------------------------------------------------------------------------------
        else:
            print 'Não entendi... Melhor digitar: help'
#------------------------------------------------------------------------------    
# Método main, a execucao inicia por aqui !! #
def main():
    console = Console( TaskList() )# Criar Objeto TaskList da Classe TaskList
    console.start() #inicia a lista
    while True:
        comm = console.waitCommand()
        console.parseCommand(comm)
    
if __name__ == '__main__': # método Main
    main()
