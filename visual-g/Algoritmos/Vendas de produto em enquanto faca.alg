algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 17/09/2014
// Se��o de Declara��es 
var
  venda, total : real
inicio
    venda <- 1

    enquanto (venda > 0) faca
    escreval("Digite o valor da venda: ")
    leia (venda)
    se (venda >= 0) entao
    total <- total + venda
    senao
    escreval("Valor Inv�lido")
    fimse
    fimenquanto
    
    escreval("O total �: ",total)

fimalgoritmo
