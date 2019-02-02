import cv2
from matplotlib import pyplot as plt
import numpy as np
img = cv2.imread("estrada.png")
cv2.imshow("Imagem Colorida", img)
#Separa os canais
canais = cv2.split(img)
cores = ("b", "g", "r")
plt.figure()
plt.title("'Histograma Colorido")
plt.xlabel("Intensidade")
plt.ylabel("Número de Pixels")
corindice = 0
for canal in canais:
#Este loop executa 3 vezes, uma para cada canal
    hist = cv2.calcHist([canal], [0], None, [256], [0, 256])
    plt.plot(hist, cores[corindice])
    corindice = corindice + 1
    plt.xlim([0, 256])
plt.show()
cv2.waitKey(0)
