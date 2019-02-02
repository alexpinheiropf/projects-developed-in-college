import cv2
import numpy as np
from matplotlib import pyplot as plt

img = cv2.imread("soccer.jpg")
color = ('b', 'g', 'r')

for i, col in enumerate(color):
    #print (i,col) printar os valores recebidos em b, g, r
    histr = cv2.calcHist([img],[i], None, [256], [0,256])
    plt.plot(histr, color = col)#plotar qual histograma vai aparecer
    plt.xlim([0,256])

cv2.imshow("Imagem Original", img) #passar a imagem carregada para Imagem Original
plt.show()

cv2.waitKey(0) #Para o programa não fechar rápido
cv2.destroyAllWindows() #Para limpar todas as telas quando precionado alguma tecla
