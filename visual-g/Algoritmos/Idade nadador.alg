algoritmo "semnome"
// Função :
// Autor :
// Data : 08/09/2014
// Seção de Declarações
var
nadador : caracter
idade : real

inicio
escreva("Digite o nome do nadador: ")
leia(nadador)
escreva("Digite a Idade do ",nadador,"? ")
leia(idade)

se (idade <= 5) e (idade <= 7) entao
   escreva("Categoria Infantil A")
senao
   se (idade >= 8) e (idade <= 10) entao
      escreva("Categoria Infantil B")
   senao
      se (idade >= 11) e (idade <= 13) entao
         escreva("Categoria Juvenil A")
      senao
         se (idade >= 14) e (idade <= 17) entao
            escreva("Categoria Juvenil B")
         senao
            escreva("Categoria Adulta")
         fimse
      fimse
   fimse
fimse

fimalgoritmo
