algoritmo "O valor de um quadrante"
// Fun��o :
// Autor :
// Data : 23/09/2014
// Se��o de Declara��es
var
x, y, q : inteiro
inicio
// Se��o de Comandos
Escreval("Digite o Valor de X: ")
Leia(x)
Escreval("Digite o valor de y: ")
leia(y)
q <- 0
se (x = q) e (y = q) entao
   Escreval("O quadrante esta na origem")
senao
   se (x > y) e (y = q) entao
      Escreval("O quadrante est� no eixo x")
   senao
      se (y > x) e (x = 0) entao
         escreval("O quadrante est� no eixo y")
      senao
         se (x > q) e (y > q) entao
            escreval("O quandrante esta em Q1 ")
         senao
            se (x < q ) e (y > q) entao
               escreval("O quadrante esta em Q2 ")
            senao
               se (x < q) e (y < q) entao
                  escreval("O quadrante esta em Q3 ")
               senao
                  se (x > q) e (y < q) entao
                     Escreval("O quadrante esta em Q4")
                  fimse
               fimse
            fimse
         fimse
      fimse
   fimse
fimse

fimalgoritmo
