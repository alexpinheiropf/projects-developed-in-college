algoritmo "semnome"
// Função :
// Autor :
// Data : 01/10/2014
// Seção de Declarações 
var
  x : inteiro
  media, nota1, nota2 : real
  vetmedia : vetor[0..50] de inteiro
inicio
     para x de 0 ate 50 passo 1 faca
     
    escreval("Digite a primeira nota: ")
     leia(nota1)
    escreval("Digite a segunda nota: ")
     leia(nota2)
    
    media <- (nota1 + nota2) /2

    vetmedia <- x
    escreval("A média da nota é: ", media)

    fimpara


fimalgoritmo
