algoritmo "semnome"
// Função :
// Autor :
// Data : 03/09/2014
// Seção de Declarações 
var
   media, nota1, nota2, nota3 :  real
   aluno : caracter
inicio
    Escreval("Digite o nome do Aluno: ")
    leia(aluno)
    Escreval("Digite a nota 1: ")
    leia(nota1)
    Escreval("Digite a nota 2: ")
    leia(nota2)
    Escreval("Digite a nota 3: ")
    leia(nota3)
    
    media <- nota1 + nota2 + nota3 / 3
     se media >= 7 entao
     escreval(aluno, " está Aprovado com média: ",media)
     fimse
     se media <= 5 entao
     escreva(aluno, " está Reprovado com média: ",media)
     fimse

fimalgoritmo
