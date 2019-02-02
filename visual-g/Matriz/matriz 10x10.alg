algoritmo "semnome"
// Função :
// Autor :
// Data : 08/10/2014
// Seção de Declarações 
var
   matrizinteira : vetor[0..9,0..9] de inteiro
   x,y : inteiro
inicio
   para x de 0 ate 9 passo 1 faca
     para y de 0 ate 9 passo 1 faca
       matrizinteira[x,y] <- randi(100)
     fimpara
   fimpara
     para x de 0 ate 9 passo 1 faca
       escreval("Os numeros da diagonal são: ",matrizinteira[x,x])
     fimpara
fimalgoritmo
