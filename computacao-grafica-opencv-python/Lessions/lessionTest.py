import cv2
import numpy as np
verde = (0, 255, 0)
canvas = np.ones((300, 400, 3)) * 255 #imagem 400x300, com fundo branco e 3 canais para as cores
cv2.imshow("Canvas", canvas)
cv2.rectangle(canvas, (10, 70), (90, 190), verde)
cv2.imshow("Canvas", canvas)

#desenha o retângulo todo vermelho
vermelho = (0, 0, 255)
cv2.rectangle(canvas, (250, 50), (300, 125), vermelho, -1)
cv2.imshow("Canvas", canvas)
cv2.waitKey(0)
