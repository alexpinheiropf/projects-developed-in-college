algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 27/08/2014
// Se��o de Declara��es

procedimento lernotas()

var
nome : caracter
notas1, notas2,media : real

inicio

se (aux < qtd) entao
   escreval("Digite o nome do aluno: ")
   leia(nome)
   escreval("Digite �1 nota: ",nome)
   leia (notas1)
   escreval("Digite 2� nota: ",nome)
   leia (notas2)
   
   media <- (notas1 + notas2) / 2
   escreval("A m�dia do Aluno �: ",nome," �", media)

   aux <- aux + 1
   lernotas()
fimse

fimprocedimento

var
aux,qtd : inteiro
inicio
aux <- 0
escreval("De quantos Alunos deseja calcular a m�dia ")
leia(qtd)
lernotas()

fimalgoritmo
