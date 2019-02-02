algoritmo "semnome"
// Função :
// Autor :
// Data : 01/10/2014
// Seção de Declarações
var
vetnum1, vetnum2,vetnum3: vetor[0..4] de real
x : inteiro
num : real
inicio
para x de 0 ate 9 faca
   escreval(x," : Digite um numero: ")
   leia(num)

   se (x < 5) entao
      vetnum1[x] <- num
   senao
      vetnum2[x - 5] <- num
   fimse
   limpatela
fimpara

para x de 0 ate 4 passo 1 faca
   vetnum3[x] <- (vetnum1[x] + vetnum2[x])
   escreval("vetor 3 [", x, "]: ", vetnum3[x])
fimpara


fimalgoritmo
