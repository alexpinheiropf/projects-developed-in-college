algoritmo "semnome"
// Função :
// Autor :
// Data : 24/09/2014
// Seção de Declarações
var
x,idade, qtdMasc, qtdFem, qtdMaiorIdade : inteiro
sexo : caracter
inicio

para x de 0 ate 9 passo 1 faca
   escreval("Digite a idade do Aluno ",(x+1),":")
   leia(idade)
   se (idade > 17)entao
      qtdMaiorIdade <- qtdMaiorIdade +1
   fimse
   '      enquanto((sexo <> "M") e (sexo <> "F")) faca
   escreval("Digite o sexo do Aluno ",(x+1),"(M ou F): ")
   leia(sexo)

   se (sexo = "M") entao
      qtdMasc <- qtdMasc +1
   senao
      se (sexo = "F") entao
         qtdFem <- qtdFem +1
      senao
         escreval("Sexo Inválido!")
      fimse
   fimse
fimenquanto
sexo<- ""
fimpara

escreval("Exitem ", qtdMaiorIdade," alunos maiores de Idade.")
escreval("Existem ",qtdMasc,"alunos do sexo Masculino ",qtdFem, "alunos do sexo Feminino"   )

fimalgoritmo
