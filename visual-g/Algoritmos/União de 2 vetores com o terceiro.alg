algoritmo "semnome"
// Função :
// Autor :
// Data : 08/10/2014
// Seção de Declarações

var
vet1,2 : vetor[0..4] de real
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
   se (x < 5 ) entao
      vet3[x] <- vet1[x]
   senao
      vet3[x] <- vet2[x]
   fimse
fimpara

para x de 0 ate 9 passo 1 faca
   escreval(vet3[x])
fimpara

fimalgoritmo
