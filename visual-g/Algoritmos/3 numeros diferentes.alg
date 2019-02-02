algoritmo "semnome"
// Função :
// Autor :
// Data : 27/08/2014
// Seção de Declarações 
var
 A,B,C : inteiro
inicio
   escreval("Digite 1º numero: ")
   leia (A)
   escreval("Digite 2º numero: ")
   leia (B)
   escreval("Digite 3º numero: ")
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
           escreval("O programa não aceita isso")
           fimse
         fimse
      fimse
   fimse
fimalgoritmo

