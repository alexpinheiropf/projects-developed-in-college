algoritmo "FUAQ que leia 3 notas de um aluno e calcule a m�dia. Sabendo que a m�dia � 70, informe se este aluno est� aprovado ou reprovado"
// Fun��o :
// Autor :
// Data : 10/02/2015
// Se��o de Declara��es
var
aluno : caracter
media, nota1, nota2 : real

inicio
escreval("As seguinte Notas que vir�o a m�dia ser� de 7 para passar e abaixo disso estar� em exame")
escreval("Digite o nome do Aluno: ")
leia(aluno)
escreval("Digite a nota 1: ")
leia(nota1)
escreval("Digite a nota 2: ")
leia(nota2)
media <- (nota1 + nota2) /2

      se media >= 7 entao
        escreval("Aluno ",aluno," aprovado, recebeu a media com a nota: ",media)
          senao
             se media < 7 entao
               escreval("Aluno",aluno," reprovado, recebeu a media com a nota: ",media)
             fimse
      fimse

fimalgoritmo
