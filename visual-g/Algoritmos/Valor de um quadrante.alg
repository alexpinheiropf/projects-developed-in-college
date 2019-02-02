algoritmo "O valor de um quadrante"
// Função :
// Autor :
// Data : 23/09/2014
// Seção de Declarações
var
x, y, q : inteiro
inicio
// Seção de Comandos
Escreval("Digite o Valor de X: ")
Leia(x)
Escreval("Digite o valor de y: ")
leia(y)
q <- 0
se (x = q) e (y = q) entao
   Escreval("O quadrante esta na origem")
senao
   se (x > y) e (y = q) entao
      Escreval("O quadrante está no eixo x")
   senao
      se (y > x) e (x = 0) entao
         escreval("O quadrante está no eixo y")
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
