import cv2
import numpy as np
image = cv2.imread("images/batman.png")
h,w,bpp = np.shape(image)
print("Altura:", h) #Altura
print("Largura:", w) #Largura
print("Profundidade:", bpp) #profundidade da cor
#Também é possível criar cores através de diretrizes de array.
# o padrão no CV2 é BGR
preto = np.array([0,0,0])
azul = np.array([127,84,38])
image[100,20] = azul
