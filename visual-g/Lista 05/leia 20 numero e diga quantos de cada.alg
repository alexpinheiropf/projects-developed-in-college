algoritmo "semnome"
// Função :
// Autor :
// Data : 30/09/2014
// Seção de Declarações
var
x,y,z,g,p : inteiro
inicio

para x de 0 ate 10 passo 1 faca
   escreval("Digite um numero: ")
   leia(x)
   se x mod 2 = 0 entao
      escreval("é Par")
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
escreval("Total de pares são: ",(y))
escreval("Total de positivos são: ",(z))
escreval("Total de negativos são: ",(p))
escreval("Total de impares são: ",(g))
fimalgoritmo
