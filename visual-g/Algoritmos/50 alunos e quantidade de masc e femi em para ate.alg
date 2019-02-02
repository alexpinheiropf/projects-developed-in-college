algoritmo "semnome"
// Função :
// Autor :
// Data : 24/09/2014
// Seção de Declarações 
var
    x, sexo, idade, n,i,masc,femi : inteiro
    aluno : caracter
inicio

   para x de 0 ate 4 passo 1 faca
         escreval("digite o nome do aluno: ")
         leia (aluno)
         escreval("digite idade de: ", aluno)
         leia(idade)
         escreval("digite sexo do(a): ", aluno,"para masculino 1 e para feminino 2")
         leia (sexo)
     
     se (sexo = 1) entao
       escreval("Sexo masculino")
     senao
       se (sexo = 2) entao
         escreval("Sexo Feminino")
         senao
          escreval("Opção Inválida")
       fimse
     fimse
     
    se (idade > 18) entao
      idade <- i
    fimse
    masc <- 1
    femi <- 2

   fimpara
   escreval("Maiores de 18 são: ",i)
   escreval("Sexo Masculino são: ",masc)
   escreval("Sexo Feminino são: ",femi)
fimalgoritmo
