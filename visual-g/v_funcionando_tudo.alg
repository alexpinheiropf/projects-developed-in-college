algoritmo "truco"
// Função : Jogo de Truco
// Autor : Alex Pinheiro
// Data : 22/10/2014
// Seção de Declarações

// Procedimento para sortear cartas do Jogador A

procedimento sorteiacartasA()
var
sortnaipe, sortcarta: inteiro  //variavel carta e naipe
inicio

sortcarta <- randi(10)    //sorteia numero aleatorio de 0 a 9
sortnaipe <- randi(4)     //sorteia numero aleatorio de 0 a 3

se matrizbaralho[sortcarta,sortnaipe] = 0 entao   //aqui é feito o controle das cartas sorteadas na rodada,
   maojogadorA[x,0] <- sortcarta                  //todo o baralho começa com "0", que indica que a carta não foi sorteada
   maojogadorA[x,1] <- sortnaipe                  //e "1" é atribuido para uma carta já sorteada.
   matrizbaralho[sortcarta,sortnaipe] <- 1
   x <- x + 1        // variavel de controle usada posteriormente
fimse
fimprocedimento


//Procedimento para sortear cartas do Jogador B, mesma lógica do jogador A.
procedimento sorteiacartasB()
var
sortnaipe, sortcarta: inteiro
inicio

sortcarta <- randi(10)
sortnaipe <- randi(4)

se matrizbaralho[sortcarta,sortnaipe] = 0 entao
   maojogadorB[y,0] <- sortcarta
   maojogadorB[y,1] <- sortnaipe
   matrizbaralho[sortcarta,sortnaipe] <- 1
   y <- y + 1
fimse
fimprocedimento

procedimento jogadoracomeca()
var

inicio
escreval("Jogador 1 - Qual carta deseja jogar?")
leia(opcao)
repita      // laço de repetição para controlar opções válidas de jogada(0,1,2) e se carta já nao foi jogada
   se((utia[0]=opcao)ou(utia[1]=opcao)ou(utia[2]=opcao)ou(opcao<0)ou(opcao>2))entao
      se ((opcao<0)ou(opcao>2)) entao  //caso diferente de 0,1,2, a carta é invalida
         escreval("Opção inválida: carta inválida (selecione 0, 1 ou 2)")
         leia(opcao)
      senao     // caso carta já tenha sido utilizada, também não permite
         escreval("Opção inválida: carta já utilizada")
         leia(opcao)
      fimse
   fimse
ate((utia[0]<>opcao)e(utia[1]<>opcao)e(utia[2]<>opcao)e(opcao>=0)e(opcao<3))

escolha opcao
caso 0 ate 0
   jogadaa <- valora[0]        //variavel jogadaa que será comparada para ver quem ganha a jogada
   utia[0] <- opcao            // recebe o peso da carta
caso 1 ate 1                   // e outra variavel(utia) recebe opção 0,1,2 para jogador não poder repetir carta
   jogadaa <- valora[1]
   utia[1] <- opcao
caso 2 ate 2
   jogadaa <- valora[2]
   utia[2] <- opcao
fimescolha
fimprocedimento

procedimento jogadorbcomeca()
var

inicio
escreval("Jogador 2 - Qual carta deseja jogar?")
leia(opcao)
repita
   se((utib[0]=opcao)ou(utib[1]=opcao)ou(utib[2]=opcao)ou(opcao<0)ou(opcao>2))entao
      se ((opcao<0)ou(opcao>2)) entao
         escreval("Opção inválida: carta inválida (selecione 0, 1 ou 2)")
         leia(opcao)
      senao
         escreval("Opção inválida: carta já utilizada")
         leia(opcao)
      fimse
   fimse
ate((utib[0]<>opcao)e(utib[1]<>opcao)e(utib[2]<>opcao)e(opcao>=0)e(opcao<3))

escolha opcao
caso 0 ate 0
   jogadab <- valorb[0]
   utib[0] <- opcao
caso 1 ate 1
   jogadab <- valorb[1]
   utib[1] <- opcao
caso 2 ate 2
   jogadab <- valorb[2]
   utib[2] <- opcao
fimescolha

fimprocedimento


var
maojogadorA : vetor[0..2,0..1] de inteiro    //cartas do jogador A
maojogadorB : vetor[0..2,0..1] de inteiro    //cartas do jogador B
valorA : vetor[0..2] de inteiro            //recebe o peso de cada carta para comparacao
valorB : vetor[0..2] de inteiro            //recebe o peso de cada carta para comparacao
matrizbaralho : vetor[0..9,0..3] de inteiro  //matriz com todas as cartasnaipes do baralho
opcao: inteiro                               //opcao de jogada (0, 1, 2)
jogadaa,jogadab: inteiro                     //opcao de jogada (0, 1, 2)
contadorjogadora, contadorjogadorb: real      //conta os pontos de cada rodada
pontosa,pontosb : inteiro                    //pontuação do jogo
utia: vetor[0..2] de inteiro                //opções utilizadas durante cada rodada do jogador A
utib: vetor[0..2] de inteiro                //opções utilizadas durante cada rodada do jogador B



//variaveis de controle
x,y,z,w,q,controdada : inteiro

inicio

//naipes: 0 = espada, 1 = paus, 2 = ouro, 3 = copas

//Aqui fica definido qual o valor das cartas conforme numeração sorteada de 0 a 9 e também é definido o valor de cada uma para a comparação
// cartas
// codigo      carta      valor
//   0           1          1 espada: 100     1 paus: 90    1 ouro e copas: 55
//   1           2          60
//   2           3          65
//   3           4          15
//   4           5          20
//   5           6          25
//   6           7          espada: 80   ouro: 70    copas e paus: 30
//   7           10         35
//   8           11         40
//   9           12         45

repita     //laço de repetição ate alguem ganhar

   x <- 0                            //laço para zerar matriz baralho toda vez q inicia uma rodada.
   para x de 0 ate 9 passo 1 faca
      matrizbaralho[x,0] <- 0
      matrizbaralho[x,1] <- 0
   fimpara

   contadorjogadora  <- 0     //contador de pontos da rodada jogador A, zerado toda rodada
   contadorjogadorb  <- 0     //contador de pontos da rodada jogador B, zerado toda rodada
   x  <- 0       //zerar variaveis de controle
   y  <- 0
   z  <- 0
   w  <- 0
   q  <- 0

   utia[0] <-  5 //variavel inicia numero diferente das opcoes, nao pode começar em 0 pois o zero é uma opção de jogada.
   utia[1] <-  5 //variavel inicia numero diferente das opcoes
   utia[2] <-  5 //variavel inicia numero diferente das opcoes

   utib[0] <-  5 //variavel inicia numero diferente das opcoes
   utib[1] <-  5 //variavel inicia numero diferente das opcoes
   utib[2] <-  5 //variavel inicia numero diferente das opcoes

   //Sorteio das cartas
   enquanto (z < 3) faca    //laço de repetição para sortear 3 cartas para cada jogador

      enquanto (x < (1 + z)) faca //enquanto x nao incrementar no procedimento sorteiacartasA, quer dizer que
         sorteiacartasA()         //carta já foi sorteada, então ele vai sortear até sair uma carta não utilizada
      fimenquanto

      enquanto (y < (1 + z)) faca //enquanto y nao incrementar no procedimento sorteiacartasA, quer dizer que
         sorteiacartasB()         //carta já foi sorteada, então ele vai sortear até sair uma carta não utilizada
      fimenquanto

      z <- z + 1         //variavel de controle

   fimenquanto


   //Mostra as cartas sorteadas de cada jogador, conforme tabela definida mais acima:
   escreval("Cartas do Jogador 1")
   escreval("")

   enquanto w < 3 faca
      escolha maojogadora[w,0]            //utilizado opção caso, primeiramente para verificar qual a carta, e então
      caso 0 ate 0                        //dentro do mesmo utilizado outra vez a opção caso, para verificar qual o naipe da carta
         escolha maojogadora[w,1]         //e então é atribuido o peso da carta nas variaveis valorA[] e valorB[] para comparar quem ganha
         caso 0 ate 0
            Escreval(w," -  1 de espada")
            valorA[w] <- 100
         caso 1 ate 1
            Escreval(w," -  1 de paus")
            valorA[w] <- 90
         caso 2 ate 2
            Escreval(w," -  1 de ouro")
            valorA[w] <- 55
         caso 3 ate 3
            Escreval(w," -  1 de copas")
            valorA[w] <- 55
         fimescolha
      caso 1 ate 1
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  2 de espada")
            valorA[w] <- 60
         caso 1 ate 1
            Escreval(w," -  2 de paus")
            valorA[w] <- 60
         caso 2 ate 2
            Escreval(w," -  2 de ouro")
            valorA[w] <- 60
         caso 3 ate 3
            Escreval(w," -  2 de copas")
            valorA[w] <- 60
         fimescolha
      caso 2 ate 2
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  3 de espada")
            valorA[w] <- 65
         caso 1 ate 1
            Escreval(w," -  3 de paus")
            valorA[w] <- 65
         caso 2 ate 2
            Escreval(w," -  3 de ouro")
            valorA[w] <- 65
         caso 3 ate 3
            Escreval(w," -  3 de copas")
            valorA[w] <- 65
         fimescolha
      caso 3 ate 3
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  4 de espada")
            valorA[w] <- 15
         caso 1 ate 1
            Escreval(w," -  4 de paus")
            valorA[w] <- 15
         caso 2 ate 2
            Escreval(w," -  4 de ouro")
            valorA[w] <- 15
         caso 3 ate 3
            Escreval(w," -  4 de copas")
            valorA[w] <- 15
         fimescolha
      caso 4 ate 4
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  5 de espada")
            valorA[w] <- 20
         caso 1 ate 1
            Escreval(w," -  5 de paus")
            valorA[w] <- 20
         caso 2 ate 2
            Escreval(w," -  5 de ouro")
            valorA[w] <- 20
         caso 3 ate 3
            Escreval(w," -  5 de copas")
            valorA[w] <- 20
         fimescolha
      caso 5 ate 5
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  6 de espada")
            valorA[w] <- 25
         caso 1 ate 1
            Escreval(w," -  6 de paus")
            valorA[w] <- 25
         caso 2 ate 2
            Escreval(w," -  6 de ouro")
            valorA[w] <- 25
         caso 3 ate 3
            Escreval(w," -  6 de copas")
            valorA[w] <- 25
         fimescolha
      caso 6 ate 6
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  7 de espada")
            valorA[w] <- 80
         caso 1 ate 1
            Escreval(w," -  7 de paus")
            valorA[w] <- 30
         caso 2 ate 2
            Escreval(w," -  7 de ouro")
            valorA[w] <- 70
         caso 3 ate 3
            Escreval(w," -  7 de copas")
            valorA[w] <- 30
         fimescolha
      caso 7 ate 7
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  10 de espada")
            valorA[w] <- 35
         caso 1 ate 1
            Escreval(w," -  10 de paus")
            valorA[w] <- 35
         caso 2 ate 2
            Escreval(w," -  10 de ouro")
            valorA[w] <- 35
         caso 3 ate 3
            Escreval(w," -  10 de copas")
            valorA[w] <- 35
         fimescolha
      caso 8 ate 8
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  11 de espada")
            valorA[w] <- 40
         caso 1 ate 1
            Escreval(w," -  11 de paus")
            valorA[w] <- 40
         caso 2 ate 2
            Escreval(w," -  11 de ouro")
            valorA[w] <- 40
         caso 3 ate 3
            Escreval(w," -  11 de copas")
            valorA[w] <- 40
         fimescolha
      caso 9 ate 9
         escolha maojogadora[w,1]
         caso 0 ate 0
            Escreval(w," -  12 de espada")
            valorA[w] <- 45
         caso 1 ate 1
            Escreval(w," -  12 de paus")
            valorA[w] <- 45
         caso 2 ate 2
            Escreval(w," -  12 de ouro")
            valorA[w] <- 45
         caso 3 ate 3
            Escreval(w," -  12 de copas")
            valorA[w] <- 45
         fimescolha
      fimescolha
      w <- w + 1
   fimenquanto


   escreval("")
   escreval("Cartas do Jogador 2")
   escreval("")

   enquanto q < 3 faca
      escolha maojogadorb[q,0]
      caso 0 ate 0
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  1 de espada")
            valorB[q] <- 100
         caso 1 ate 1
            Escreval(q," -  1 de paus")
            valorB[q] <- 90
         caso 2 ate 2
            Escreval(q," -  1 de ouro")
            valorB[q] <- 55
         caso 3 ate 3
            Escreval(q," -  1 de copas")
            valorB[q] <- 55
         fimescolha
      caso 1 ate 1
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  2 de espada")
            valorB[q] <- 60
         caso 1 ate 1
            Escreval(q," -  2 de paus")
            valorB[q] <- 60
         caso 2 ate 2
            Escreval(q," -  2 de ouro")
            valorB[q] <- 60
         caso 3 ate 3
            Escreval(q," -  2 de copas")
            valorB[q] <- 60
         fimescolha
      caso 2 ate 2
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  3 de espada")
            valorB[q] <- 65
         caso 1 ate 1
            Escreval(q," -  3 de paus")
            valorB[q] <- 65
         caso 2 ate 2
            Escreval(q," -  3 de ouro")
            valorB[q] <- 65
         caso 3 ate 3
            Escreval(q," -  3 de copas")
            valorB[q] <- 65
         fimescolha
      caso 3 ate 3
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  4 de espada")
            valorB[q] <- 15
         caso 1 ate 1
            Escreval(q," -  4 de paus")
            valorB[q] <- 15
         caso 2 ate 2
            Escreval(q," -  4 de ouro")
            valorB[q] <- 15
         caso 3 ate 3
            Escreval(q," -  4 de copas")
            valorB[q] <- 15
         fimescolha
      caso 4 ate 4
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  5 de espada")
            valorB[q] <- 20
         caso 1 ate 1
            Escreval(q," -  5 de paus")
            valorB[q] <- 20
         caso 2 ate 2
            Escreval(q," -  5 de ouro")
            valorB[q] <- 20
         caso 3 ate 3
            Escreval(q," -  5 de copas")
            valorB[q] <- 20
         fimescolha
      caso 5 ate 5
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  6 de espada")
            valorB[q] <- 25
         caso 1 ate 1
            Escreval(q," -  6 de paus")
            valorB[q] <- 25
         caso 2 ate 2
            Escreval(q," -  6 de ouro")
            valorB[q] <- 25
         caso 3 ate 3
            Escreval(q," -  6 de copas")
            valorB[q] <- 25
         fimescolha
      caso 6 ate 6
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  7 de espada")
            valorB[q] <- 80
         caso 1 ate 1
            Escreval(q," -  7 de paus")
            valorB[q] <- 30
         caso 2 ate 2
            Escreval(q," -  7 de ouro")
            valorB[q] <- 70
         caso 3 ate 3
            Escreval(q," -  7 de copas")
            valorB[q] <- 30
         fimescolha
      caso 7 ate 7
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  10 de espada")
            valorB[q] <- 35
         caso 1 ate 1
            Escreval(q," -  10 de paus")
            valorB[q] <- 35
         caso 2 ate 2
            Escreval(q," -  10 de ouro")
            valorB[q] <- 35
         caso 3 ate 3
            Escreval(q," -  10 de copas")
            valorB[q] <- 35
         fimescolha
      caso 8 ate 8
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  11 de espada")
            valorB[q] <- 40
         caso 1 ate 1
            Escreval(q," -  11 de paus")
            valorB[q] <- 40
         caso 2 ate 2
            Escreval(q," -  11 de ouro")
            valorB[q] <- 40
         caso 3 ate 3
            Escreval(q," -  11 de copas")
            valorB[q] <- 40
         fimescolha
      caso 9 ate 9
         escolha maojogadorb[q,1]
         caso 0 ate 0
            Escreval(q," -  12 de espada")
            valorB[q] <- 45
         caso 1 ate 1
            Escreval(q," -  12 de paus")
            valorB[q] <- 45
         caso 2 ate 2
            Escreval(q," -  12 de ouro")
            valorB[q] <- 45
         caso 3 ate 3
            Escreval(q," -  12 de copas")
            valorB[q] <- 45
         fimescolha
      fimescolha
      q <- q + 1
   fimenquanto

   // Jogadores escolhem as cartas e deve ser feita comparação para ver quem ganha

   x <- 0       //zera variaveis de controle
   y <- 0       //zera variaveis de controle


   escreval("")
   escreval("Rodada ", controdada + 1)
   enquanto x < 3 faca

      se ((controdada + 2) mod 2 = 0) entao        // controle para que altere o jogador que começa durante cada rodada
         jogadoracomeca()                          // pois conforme vai incrementando a variavel controdada
         jogadorbcomeca()                          // satisfaz ou nao condição de resto da divisao
      senao
         jogadorbcomeca()
         jogadoracomeca()
      fimse

      se jogadaa > jogadab entao                   // compara valor das cartas e atribui ponto
         escreval("Jogador 1 ganhou a jogada")
         contadorjogadora <- contadorjogadora + 1
      senao
         se jogadaa < jogadab entao                // compara valor das cartas e atribui ponto
            escreval("Jogador 2 ganhou a jogada")
            contadorjogadorb <- contadorjogadorb + 1
         senao
            escreval("Empate")                         //caso empate os dois ganham 1 ponto
            contadorjogadora <- contadorjogadora + 1
            contadorjogadorb <- contadorjogadorb + 1
            se x = 0 entao                            // se empate na primeira rodada, incrementa x para que proxima jogada seja a ultima
               x <- 1
            fimse
         fimse
      fimse

      se ((contadorjogadora = 2) ou (contadorjogadorb = 2)) entao    // se jogador ganhar duas jogadas na rodada acaba a rodada
         x <- 3
      fimse

      x <- x + 1  //incrementa a rodada
   fimenquanto

   se contadorjogadora > contadorjogadorb entao   //quem faz mais pontos ganha a rodada
      escreval("Jogador 1 ganhou a rodada")
      pontosa <- pontosa + 1

   senao
      se contadorjogadora < contadorjogadorb entao
         escreval("Jogador 2 ganhou a rodada")
         pontosb <- pontosb + 1
      senao
         se ((controdada + 2) mod 2 = 0) entao    //caso de empate: aqui tem um controle pelo numero da rodada,
            escreval("Jogador 1 ganhou a rodada")  //para ver quem é o mão e ganha a rodada
            pontosa <- pontosa + 1
         senao
            escreval("Jogador 2 ganhou a rodada")
            pontosb <- pontosb + 1
         fimse
      fimse
   fimse
   controdada <- controdada + 1
   escreval("Jogador 1: ", pontosa, " Jogador 2: ", pontosb)

   utia[0] <-  5 //variavel inicia numero diferente das opcoes
   utia[1] <-  5 //variavel inicia numero diferente das opcoes
   utia[2] <-  5 //variavel inicia numero diferente das opcoes

   utib[0] <-  5 //variavel inicia numero diferente das opcoes
   utib[1] <-  5 //variavel inicia numero diferente das opcoes
   utib[2] <-  5 //variavel inicia numero diferente das opcoes

ate (pontosa = 2) ou (pontosb = 2)   // ate alguem fazer dois pontos

fimalgoritmo
