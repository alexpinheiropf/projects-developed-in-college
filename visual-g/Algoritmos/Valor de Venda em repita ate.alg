algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 17/09/2014
// Se��o de Declara��es
var
total, valor :  inteiro
inicio

repita

   escreval("Digite o valo do produto: ")
   leia(valor)
   se (valor > 0) entao
      total <- total + valor
   senao
      escreval("O Valor � invalido")
   fimse
ate (valor = 0)

escreval("O valor total �: ", total)


fimalgoritmo
