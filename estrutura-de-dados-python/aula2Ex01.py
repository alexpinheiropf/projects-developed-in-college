# Exercicio 1 - Lista de Nomes
''''
{'Alex':{
    'nome': 'Fahad Kalil',
    'Idade':28
    }
5 }

 '''

lista ={}# cria um dicion�rio vazio
lista['Alex']={
    'Alex':{
    'nome': 'Fahad Kalil',
    'Idade':28
    }
}
#Imprimi todo o dicionario
print lista.get('Alex')

#Imprime todas as chaves
for item in lista.iterkeys():
    print item

#adicionar novos elementos
lista['item2']={
    'nome': 'Esse � o item 2',
    'idade':99
    }
print lista['item2']['nome']
print lista['item2']['idade']
print lista['item2']['nome']

#Passa por todas as chaves da lista imprimindo apenas
#o valor presente e 'nome'

for chave in lista:
    print lista[chave],['nome']
    
#Substituir valor existente
lista['item2']['nome'] = 'novo nome'

##la�o iniciando em zero

for i in range(3):
    print type(i), i
print '------'

 
##la�o iniciando em 5 at� 9

for i in range(5,10):
     print type(i), i

matriz = [[1,2,3],
          [4,5,6] ]

for i in range( len(matriz) ):
    for j in range (3):
        print '[',i, ']', '[',j, ']', '=', matriz [i][j]


abc = 'texto'
print abc[0:3]

# list comprehension
numeros = [x for x in range(5)]
numeros.append(6) #insere no fim
numeros.append(7) #insere no fim
print numeros
