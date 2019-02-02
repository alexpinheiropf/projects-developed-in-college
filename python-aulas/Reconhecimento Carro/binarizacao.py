import cv2
import numpy as np
img = cv2.imread("carros_screen.png")
img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
suave = cv2.GaussianBlur(img, (7, 7), 0) # aplica blur
(T, bin) = cv2.threshold(suave, 160, 255, cv2.THRESH_BINARY)
(T, binI) = cv2.threshold(suave, 160, 255, cv2.THRESH_BINARY_INV)
resultado = np.vstack([ np.hstack([suave, bin]), np.hstack([binI,
cv2.bitwise_and(img, img, mask = binI)]) ])
cv2.imshow("Binarização da imagem", resultado)
cv2.waitKey(0)
cv2.destroyAllWindows()
