algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 08/10/2014
// Se��o de Declara��es

var
vet1,vet2 : vetor[0..4] de real
vet3 : vetor[0..9] de real
x : inteiro
inicio

para x de 0 ate 4 passo 1 faca
   escreval("digite um numero do vet1: ")
   leia(vet1[x])

   escreval("digite um numero do vet2: ")
   leia(vet2[x])
fimpara

para x de 0 ate 9 passo 1 faca
   vet3[x] <- vet1[x]
   vet3[x + 1 ]<- vet2[x]
fimpara

para x de 0 ate 9 passo 1 faca
   escreval(vet3[x])
fimpara

fimalgoritmo
