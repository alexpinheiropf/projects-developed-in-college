algoritmo "Distinção de Triângulos"
// Função : Distinguir os triangulos
// Autor : Alex Pinheiro
// Data : 25/08/2014
// Seção de Declarações
var
A, B, C : REAl

inicio
Escreval("Digite o valor A: ")
Leia(A)
Escreval("Digite o Valor de B: ")
Leia(B)
Escreval("Digite o valor de C: ")
Leia(C)
//Perguntas ao usuário

// Linhas de comando
se ((A+B >= C) e (B+C >= A) e (C+A >= B)) entao
 se((A =B) e (B = C)) entao
 escreval("Triangulo equilatero")
  senao
   se(((A = B)e (A <> C)) ou ((B = C)e (B <> A)) ou ((A = C) e (C <> B))) entao
    escreval("Triangulo Isosceles")
   senao
    escreval("Triangulo Escaleno")
   fimse
  fimse
 fimse
senao
 escreval("Os lados informados não formam um triangulo")
fimse

fimalgoritmo
