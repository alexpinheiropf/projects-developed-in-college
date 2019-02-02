algoritmo "Calculo de Notas para Alunos"
// Função :
// Autor :
// Data : 26/08/2014
// Seção de Declarações
var
A, B, C, media : real
Aluno : caracter

inicio
     escreval("Digite o Nome do Aluno: ")
     Leia(Aluno)
     escreval("digite nota 1º Semestre: ")
     leia(A)
     escreval("digite nota 2º Semestre: ")
     leia (B)
     escreval("digite nota 3º Semestre: ")
     leia(C)

//Linha de comando para resolução das notas

      media <- (A + B + C)/3
      se media >= 70 entao
      escreval(Aluno ," está Aprovado. A média foi: ", media)
      fimse
         se media < 40 entao
         escreval(Aluno, " está Reprovado. A média foi: ",media)
         fimse
             se (media >= 40) e (media < 70) entao
             escreval(Aluno," está em exame. A média foi: ",media)
             fimse


fimalgoritmo
