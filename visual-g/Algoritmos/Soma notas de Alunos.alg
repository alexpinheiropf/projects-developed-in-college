algoritmo "Calculo de Notas para Alunos"
// Fun��o :
// Autor :
// Data : 26/08/2014
// Se��o de Declara��es
var
A, B, C, media : real
Aluno : caracter

inicio
     escreval("Digite o Nome do Aluno: ")
     Leia(Aluno)
     escreval("digite nota 1� Semestre: ")
     leia(A)
     escreval("digite nota 2� Semestre: ")
     leia (B)
     escreval("digite nota 3� Semestre: ")
     leia(C)

//Linha de comando para resolu��o das notas

      media <- (A + B + C)/3
      se media >= 70 entao
      escreval(Aluno ," est� Aprovado. A m�dia foi: ", media)
      fimse
         se media < 40 entao
         escreval(Aluno, " est� Reprovado. A m�dia foi: ",media)
         fimse
             se (media >= 40) e (media < 70) entao
             escreval(Aluno," est� em exame. A m�dia foi: ",media)
             fimse


fimalgoritmo
