algoritmo "semnome"
// Função :
// Autor :
// Data : 01/10/2014
// Seção de Declarações
var
vetmedia : vetor[0..2] de real
x : inteiro
n1, n2 : real

inicio
para x de 0 ate 2 passo 1 faca
   escreval("Digite a primeira nota: ",x)
   leia(n1)
   escreval("Digite a segunda nota: ",x)
   leia(n2)
   
   vetmedia[x] <- (n1 + n2)/2)
fimpara

   para x de 0 ate 2 passo 1 faca
    escreval("A média do aluno ", x,  " é: ", vetmedia[x])
   fimpara
   
fimalgoritmo
