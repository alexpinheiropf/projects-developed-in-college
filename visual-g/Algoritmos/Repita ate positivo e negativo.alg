algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 24/09/2014
// Se��o de Declara��es
var
x, n, teste : inteiro
inicio
x <- 10
repita
   escreval("digite um numero: ")
   leia(n)
   se n >= 0 entao
      escreval("Positivo")
   senao
      escreval("Negativo")
   fimse
   escreval("Deseja testar novamente? ")
   leia(teste)
   
   ate (teste <> 1)

fimalgoritmo
