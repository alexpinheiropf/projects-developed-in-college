algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 24/09/2014
// Se��o de Declara��es
var
x, num   : inteiro
mai, men : real
inicio

mai <- num
men <- num
para x de 0 ate 9 passo 1 faca
   escreval("Digite um numero")
   leia (num)
   se num > mai  entao
      mai <- num
   fimse
   se num < men entao
      men <- num
   fimse
fimpara
escreval("Esse numero � maior",mai)
escreval("Esse numero � menor",men)
fimalgoritmo
