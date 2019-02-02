algoritmo "nota aluno em matriz"
// Função :
// Autor :
// Data : 08/10/2014
// Seção de Declarações
var

media, nota1, nota2 : real
matrizmedia : vetor[0..2,0..1] de caracter
x : inteiro
inicio

para x de 0 ate 2 passo 1 faca

   escreval("digite nome do aluno: ")
   leia(matrizmedia[x,0])
   escreval("digite nota 1 do aluno ",matrizmedia[x,0])
   leia(nota1)
   escreval("digite nota 2 do aluno ",matrizmedia[x,0])
   leia(nota2)

   media <- ((nota1 + nota2)/2)

   matrizmedia[x,1] <- numpcarac(media)

fimpara

para x de 0 ate 2 passo 1 faca
   escreval("O aluno ",matrizmedia[x,0]," obteve media: ",matrizmedia[x,1])
fimpara
fimalgoritmo
