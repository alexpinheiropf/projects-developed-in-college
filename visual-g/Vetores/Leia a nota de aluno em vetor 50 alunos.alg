algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 01/10/2014
// Se��o de Declara��es
var
vetmedia : vetor[0..49] de real
x : inteiro
n1, n2 : real

inicio
para x de 0 ate 49 passo 1 faca
   escreval("Digite a primeira nota: ",x)
   leia(n1)
   escreval("Digite a segunda nota: ",x)
   leia(n2)

   vetmedia[x] <- (n1 + n2)/2)
   limpatela
fimpara

para x de 0 ate 49 passo 1 faca
   escreval("A m�dia do aluno ", x,  "  �: ", vetmedia[x])
fimpara

fimalgoritmo
