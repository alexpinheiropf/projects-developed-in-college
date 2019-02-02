algoritmo "semnome"
// Função :
// Autor :
// Data : 17/09/2014
// Seção de Declarações 
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
    escreval("Valor Inválido")
    fimse
    fimenquanto
    
    escreval("O total é: ",total)

fimalgoritmo
