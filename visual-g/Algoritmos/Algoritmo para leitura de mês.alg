algoritmo "semnome"
// Função :
// Autor :
// Data : 27/08/2014
// Seção de Declarações 
var
 mes : inteiro
 
inicio
    escreval("Digite o mês")
    Leia(mes)

    se mes = 1 entao
    escreval("Janeiro")
    fimse
      se mes = 2 entao
      escreval("Fevereiro")
      fimse
        se mes = 3 entao
        escreval("Março")
        fimse
           se mes = 4 entao
           escreval("Abril")
           fimse
             se mes = 5 entao
             escreval("Maio")
             fimse
                se mes = 6 entao
                escreval("Junho")
                fimse
                    se mes = 7 entao
                    escreval("Julho")
                    fimse
                        se mes = 8 entao
                        escreval("Agosto")
                        fimse
                           se mes = 9 entao
                           escreval("Setembro")
                           fimse
                             se mes = 10 entao
                             escreval("Outubro")
                             fimse
                                se mes = 11 entao
                                escreval("Novembro")
                                fimse
                                   se mes = 12 entao
                                   escreval("Dezembro")
                                   fimse
                                     se (mes <> 12) e (mes <> 11) e (mes <> 10) e (mes <> 9) e (mes <> 8) e (mes <> 7) e (mes <> 6) e (mes <> 5) e (mes <> 4) e (mes <> 3) e (mes <> 2) e (mes <> 1) entao
                                     escreval("Não existe nehum mês com esse numero")
                                     fimse
fimalgoritmo
