import cv2
import numpy as np
from matplotlib import pyplot as plt

img = cv2.imread("soccer.jpg",0)
plt.hist(img.ravel(), 256, [0,256]) #grafico começa em 0 e vai até 256
cv2.imshow("Imagem Original",img)
plt.show() # mostrar histograma na tela

cv2.waitKey(0)
cv2.destroyWindow()
