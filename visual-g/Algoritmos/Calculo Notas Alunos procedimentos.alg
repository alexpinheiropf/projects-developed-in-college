algoritmo "semnome"
// Função :
// Autor :
// Data : 27/08/2014
// Seção de Declarações

procedimento lernotas()

var
nome : caracter
notas1, notas2,media : real

inicio

se (aux < qtd) entao
   escreval("Digite o nome do aluno: ")
   leia(nome)
   escreval("Digite ª1 nota: ",nome)
   leia (notas1)
   escreval("Digite 2ª nota: ",nome)
   leia (notas2)
   
   media <- (notas1 + notas2) / 2
   escreval("A média do Aluno é: ",nome," é", media)

   aux <- aux + 1
   lernotas()
fimse

fimprocedimento

var
aux,qtd : inteiro
inicio
aux <- 0
escreval("De quantos Alunos deseja calcular a média ")
leia(qtd)
lernotas()

fimalgoritmo
