algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 24/09/2014
// Se��o de Declara��es
var
x , n, rep : inteiro
inicio
x <- 0
escreval("Digite quantas vezes queira fazer o teste? ")
leia(rep)
enquanto (x < rep) faca
   escreval("Digite um valor: ")
   leia(n)
   x<- x + 1
   se (n >= 0) entao
      escreval("Positivo")
   senao
      escreval("Negativo")
   fimse
fimenquanto

fimalgoritmo
