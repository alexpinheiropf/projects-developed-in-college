import cv2
import numpy as np
image = cv2.imread("pretoebranco.png")
print("Pixel 10x10:",image[0,0])
eixox = 224
eixoy = 139
print("Pixel 224x139:",image[eixoy,eixox])
cv2.imshow("Imagem original", image)
cv2.waitKey(0)
cv2.destroyAllWindows()
