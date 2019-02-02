import cv2
import numpy as np

imagemJogador = cv2.imread("soccer.jpg")

#informa canal de cores 3D
print(imagemJogador.shape)

# 0 = Azul, 2 = Vermelho, 1 = Verde
print (imagemJogador.item(0, 0, 2)), (imagemJogador.item(0, 0, 1)), (imagemJogador.item(0, 0, 0))

imagemJogador.itemset((0, 0, 2), 255)
imagemJogador.itemset((0, 0, 1), 0)
imagemJogador.itemset((0, 0, 0), 0)

cv2.imwrite("soccer2.jpg", imagemJogador)

bola = imagemJogador[180:250, 250:315]
cv2.imwrite("bola.jpg",bola)
