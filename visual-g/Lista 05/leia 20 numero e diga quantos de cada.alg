algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 30/09/2014
// Se��o de Declara��es
var
x,y,z,g,p : inteiro
inicio

para x de 0 ate 10 passo 1 faca
   escreval("Digite um numero: ")
   leia(x)
   se x mod 2 = 0 entao
      escreval("� Par")
   senao
      se x > 0 entao
         z <- z + x
      senao
         se x < 0  entao
            p <- p + x
         senao
            g <- g + x
         fimse
      fimse
   fimse
fimpara
escreval("Total de pares s�o: ",(y))
escreval("Total de positivos s�o: ",(z))
escreval("Total de negativos s�o: ",(p))
escreval("Total de impares s�o: ",(g))
fimalgoritmo
