algoritmo "10 numeros pares"
// Fun��o :
// Autor :
// Data : 24/09/2014
// Se��o de Declara��es
var
soma, cont, num : inteiro
inicio

cont <- 0
enquanto cont < 10 faca
   cont <- cont + 1
   escreva("Digite um n�mero par: ")
   leia (num)
   se num mod 2 = 0  entao
      soma <- soma + num
   senao
      escreval("Erro!!! N�o � Par")
   fimse
fimenquanto
escreval(" A soma dos numeros pares s�o: ", soma,".")

fimalgoritmo

