algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 27/08/2014
// Se��o de Declara��es
 procedimento tomarDano()
 var

 inicio
   vida <- (vida - dano)
    se(vida <= 0) entao
    escreval("Voc� morreu")
    senao
      escreval("Sua vida �: ",vida)
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
