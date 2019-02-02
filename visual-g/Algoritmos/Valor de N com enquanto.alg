algoritmo "semnome"
// Função :
// Autor :
// Data : 17/09/2014
// Seção de Declarações 
var
    n, x : inteiro
inicio
   enquanto ((n < 2) ou (n > 1000)) faca
     escreval("Digite o valor de N: ")
     leia(n)
   fimenquanto
     x <- 1
     enquanto (x < 11) faca
        escreval(n," x ",x," = ",( n * x))
        x <- x + 1
     fimenquanto

fimalgoritmo
