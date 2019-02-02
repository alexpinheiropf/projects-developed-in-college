algoritmo "semnome"
// Função :
// Autor :
// Data : 17/09/2014
// Seção de Declarações
var
total, valor :  inteiro
inicio

repita

   escreval("Digite o valo do produto: ")
   leia(valor)
   se (valor > 0) entao
      total <- total + valor
   senao
      escreval("O Valor é invalido")
   fimse
ate (valor = 0)

escreval("O valor total é: ", total)


fimalgoritmo
