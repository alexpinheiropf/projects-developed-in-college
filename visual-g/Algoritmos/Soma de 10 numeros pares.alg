algoritmo "10 numeros pares"
// Função :
// Autor :
// Data : 24/09/2014
// Seção de Declarações
var
soma, cont, num : inteiro
inicio

cont <- 0
enquanto cont < 10 faca
   cont <- cont + 1
   escreva("Digite um número par: ")
   leia (num)
   se num mod 2 = 0  entao
      soma <- soma + num
   senao
      escreval("Erro!!! Não é Par")
   fimse
fimenquanto
escreval(" A soma dos numeros pares são: ", soma,".")

fimalgoritmo

