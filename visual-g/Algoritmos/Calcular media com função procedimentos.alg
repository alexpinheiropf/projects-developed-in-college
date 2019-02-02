algoritmo "semnome"
// Função :
// Autor :
// Data : 27/08/2014
// Seção de Declarações
 procedimento tomarDano()
 var

 inicio
   vida <- (vida - dano)
    se(vida <= 0) entao
    escreval("Você morreu")
    senao
      escreval("Sua vida é: ",vida)
      tomarDano()
    fimse

fimprocedimento

var
 vida, dano : REAL
inicio
    vida <- 100
 escreval("Digite o dano: ")
 leia(dano)

 tomarDano ()
fimalgoritmo
