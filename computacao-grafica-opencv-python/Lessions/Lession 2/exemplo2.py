import cv2

imagemCarregada = cv2.imread("exemplo1.png", 0)

cv2.imshow("imagemCarregada", imagemCarregada)
cv2.waitKey(0)
cv2.destroyWindow()

cv2.imwrite("imagemSalva.png", imagemCarregada)
