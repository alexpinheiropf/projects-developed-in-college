import cv2
import numpy as np
image = cv2.imread("batman.png")
h,w,bpp = np.shape(image)
print("Altura:", h) #Altura
print("Largura:", w) #Largura
print("Profundidade:", bpp) #profundidade da cor
preto = np.array([0,0,0])
azul = np.array([127,84,38])
for i in range(0,h):
    for j in range(0,w):
        if np.array_equal(image[i,j],preto):
            image[i,j] = azul
cv2.imshow("Imagem original", image)
cv2.waitKey(0)
cv2.destroyAllWindows()
