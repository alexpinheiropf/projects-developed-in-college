algoritmo "semnome"
// Função :
// Autor :
// Data : 24/09/2014
// Seção de Declarações
var
num, numMaior : real
inicio
numMaior <- 0
repita
   escreval("Digite um numero")
   leia(num)
      se (num<>0) e (num > numMaior) ou (numMaior = 0) entao
      numMaior <- num
       fimse
ate(num = 0)
escreval("O numero Maior é: ",numMaior)

fimalgoritmo
