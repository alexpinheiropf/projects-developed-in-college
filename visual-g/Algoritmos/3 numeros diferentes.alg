algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 27/08/2014
// Se��o de Declara��es 
var
 A,B,C : inteiro
inicio
   escreval("Digite 1� numero: ")
   leia (A)
   escreval("Digite 2� numero: ")
   leia (B)
   escreval("Digite 3� numero: ")
   leia (C)
   
   se (A > B) e (B > C) e (A > C) entao
   escreval(A, B, C)
   senao
      se (A > B) e (A < C) e (B < C) entao
      escreval(C, A, B)
      senao
         se (A < B) e (A < C) e (B > C) entao
         escreval (B, C, A)
         senao
           se (A = B) ou (B = C) ou (A = C) entao
           escreval("O programa n�o aceita isso")
           fimse
         fimse
      fimse
   fimse
fimalgoritmo

