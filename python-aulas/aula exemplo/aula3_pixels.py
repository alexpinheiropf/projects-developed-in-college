import cv2
import numpy as np

imagemJogador = cv2.imread("soccer.jpg")
print (imagemJogador.shape)
print (imagemJogador.item(0, 0, 2))
