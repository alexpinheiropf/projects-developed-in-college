import cv2
import numpy as np
image = cv2.imread("batman.png")
h,w,bpp = np.shape(image)
print("Altura:", h) #Altura
print("Largura:", w) #Largura
print("Profundidade:", bpp) #profundidade da cor
