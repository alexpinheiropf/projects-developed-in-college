algoritmo "semnome"
// Função :
// Autor :
// Data : 03/09/2014


funcao teste (num : real) : caracter
var
intervalo : caracter
inicio
   se ((num >= 0) e (num <= 25)) entao
   intervalo <- "[0,25]"
   senao
     se ((num >= 26 ) e (num <= 50)) entao
     intervalo <- "[26,50]"
     senao
       se((num >=51) e (num <= 75)) entao
       intervalo <- "[51,76]"
       senao
        se((num >=76) e (num <=100)) entao
        intervalo <- "[76,100]"
        senao
          escreval("Não esta no intervalo")
         fimse
      fimse
     fimse
    fimse
    retorne intervalo
fimfuncao
var
  numero : real
inicio
   escreval("digite um numero: ")
   leia(numero)
   
   escreval("O valor é: ",teste(numero))


 fimalgoritmo
