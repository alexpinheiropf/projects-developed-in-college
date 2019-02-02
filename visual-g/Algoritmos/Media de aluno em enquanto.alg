algoritmo "semnome"
// Função :
// Autor :
// Data : 17/09/2014
// Seção de Declarações 
var
  x : inteiro
  nota1, nota2,media : real
  aluno : caracter
inicio
   x <- 0
     enquanto (x < 3) faca
     escreval("Digite o nome do Aluno: ")
     leia (aluno)
     escreval("Digite a nota 1 do Aluno: ")
     leia (nota1)
     escreval("Digite a nota 2 do Aluno: ")
     leia (nota2)

     media <- nota1 + nota2 / 2
     
     escreval("media do ",aluno, " é: ",media)
     x <- x + 1
     fimenquanto
fimalgoritmo
