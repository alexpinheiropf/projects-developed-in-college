5# -*- coding: utf-8 -*-
# Alex Pinheiro, Daniel Favero
import pygame, sys
from pygame.locals import *
from random import randint

class Snake:
        #Cores
        PRETO = (0,0,0) #cores pegas do padrão RGB utilizado em corel
        AZUL = (0,0,255)

        #Tamanho da janela
        COMPRIMENTOJANELA=440 #largura em frame Eixo X
        ALTURAJANELA=510 #Altura em frame Eixo Y

        #Direccoes
        CIMA = 8
        BAIXO = 2
        ESQUERDA= 4
        DIREITA=6
        

        #Tamanho do bloco por unidade da cobra
        bloco=[20,20]

        #Quadrado
        #funcao rect(X, Y, largura, altura)
        #Snake
        snake = [[30,120],[10,120]]

        cabeca = [30,120] 

        x=randint(0,10)
        y=randint(0,19)

        comida = 0
        while True:
            x1=randint(0,20)
            y1=randint(0,17)
            comidaXY=[int(x1*20)+10,int(y1*20)+120]
            if snake.count(comidaXY)==0:
                comida=1
                break

        #A cobra inicia indo para baixo
        direccao = BAIXO
        #variavel de controle a cobra se tiver em 1 estiver morta senao
        #se a variavel morto estiver em zero esta viva.
        morto = 0
        #criando variavel dos pontos iniciando em zero
        pontos=0

        #Cria o objecto BACKGROUND
        fundoJanela=pygame.display.set_mode((COMPRIMENTOJANELA,ALTURAJANELA),0,32)

        #Caption da janela
        pygame.display.set_caption('Snake')

        #set up
        pygame.init()
        mainClock=pygame.time.Clock()
        #Enquanto a cobra não estiver morta faça
        while not morto:
            #Vemos se o evento QUIT ocorreu
            for event in pygame.event.get():
                if event.type == QUIT:
                    pygame.quit()
                    sys.exit()

                if event.type == KEYDOWN:
                #Verifica as mudanças de direcçao validas
                    if ((event.key == K_LEFT)):
                            direccao=ESQUERDA #verifica evento para esquerda
                    elif ((event.key == K_RIGHT)):
                            direccao=DIREITA #verifica evento para direita
                    elif ((event.key == K_UP)):
                            direccao=CIMA #verifica evento para cima
                    elif ((event.key == K_DOWN)):
                            direccao=BAIXO #verifica evento para baixo

                #<ESC> para sair do jogo
                if event.type == KEYUP:
                    if event.key == K_ESCAPE:
                        pygame.quit()
                        sys.exit()

            #Calcular o movimento da cabeca
            if direccao==DIREITA:
                cabeca[0]+=20
                if cabeca[0] > COMPRIMENTOJANELA-20:
                    morto=1
            elif direccao==ESQUERDA:
                cabeca[0]-=20
                if cabeca[0] < 10:
                    morto=1
            elif direccao==CIMA:
                cabeca[1]-=20
                if cabeca[1] < 110:
                    morto=1
            elif direccao==BAIXO:
                cabeca[1]+=20
                if cabeca[1] > ALTURAJANELA-30:
                    morto=1

            #Se estamos a comer alguma parte do corpo morremos
            if snake.count(cabeca)> 0:
                 morto=1 #variavel de controle de morte inicializada antes em zero

            #Cria nova maca fora do corpo da serpente
            if comida==0:
                while True:
                    x1=randint(0,20)# randomiza a posição da comida no jogo
                    y1=randint(0,19)# randomiza a posição da comida no jogo
                    comidaXY=[int(x1*20)+10,int(y1*20)+120] #Gerar comida no jogo
                    if snake.count(comidaXY)==0: 
                        comida=1
                        break

            #Insere a cabeca na cobra
            snake.insert(0,list(cabeca)) #metodo lista para inserir o bloco

            #Se a cabeca tiver as mesmas coordenadas que a comida entao...
            if cabeca[0]==comidaXY[0] and cabeca[1]==comidaXY[1]:
                comida=0
                pontos+=5 #soma 5 pontos na tabela 
            else:
                #remove a cauda
                snake.pop()

            #Preenche fundo preto para os pontos
            fundoJanela.fill(PRETO)

            #Borda Azul dos pontos onde define o limite ate onde a cobra tem q ir
            pygame.draw.rect(fundoJanela,AZUL,Rect([10,10],[420,100]),1)

            #Texto
            font = pygame.font.Font(None, 36)# Importa fonte e o tamanho para palavra Pontos
            text = font.render("Pontos: " + str(pontos), 1, (200, 200, 200)) #Cor em RGB da Palavra Pontos
            textpos = text.get_rect()
            textpos.left = 75 #Localização da palavra Pontos
            textpos.top = 45 #Localização da palavra Pontos
            fundoJanela.blit(text, textpos)
            
            #Borda Azul dos pontos onde define o limite ate onde a cobra tem q ir
            pygame.draw.rect(fundoJanela,AZUL,Rect([10,120],[420,380]),1)

            #desenha a serpente
            for x in snake: 
                pygame.draw.rect(fundoJanela,AZUL, Rect(x,bloco)) #biblioteca pega da internet para desenhar o snake em forma de bloco
            
            #desenha a comida
            pygame.draw.rect(fundoJanela,(100,100,100),Rect(comidaXY,bloco))

            #desenha os objectos no ecra
            pygame.display.update()
            mainClock.tick(5) #Velocidade da cobra no jogo

