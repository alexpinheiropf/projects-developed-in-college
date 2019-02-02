algoritmo  "Calculo media com função e procedimento"

// Função calcular média
funcao calcMedia(n1,n2,n3 : real) : real

var
media : real
inicio

media <- (n1 + n2 + n3) /3
retorne media
fimfuncao
// Procedimento ler notas
procedimento lernotas()
var
nota1, nota2, nota3, media : real
nome : caracter
inicio

escreval("Dgite o nome do aluno: ")
leia(nome)
escreval("Dgite a nota 1: ")
leia(nota1)
escreval("Dgite a nota 2: ")
leia(nota2)
escreval("Dgite a nota 3: ")
leia(nota3)

media <- calcMedia(nota1, nota2, nota3)

se (media >= 7) entao
   escreval("O aluno ", nome, " foi aprovado: ", media)
senao
   se (media <= 5 ) entao
      escreval("O aluno ", nome," foi reprovado: ", media)
   senao
      escreval("O aluno ", nome, " está em recuperação: ",media)
   fimse
fimse
fimprocedimento

var

inicio

   lernotas()

fimalgoritmo
