import numpy as np
import cv2

cap = cv2.VideoCapture(0)
contadorBalada = 0

while(True):
    existeFrame, frame = cap.read()

    altura, largura, _= frame.shape#vetor que contem altura e largura
    imagemVazia = np.zeros((altura,largura), dtype="uint8")#cada canal deve ter 8 bits

    (B, G, R) = cv2.split(frame)
    R = cv2.merge([imagemVazia, imagemVazia, R])
    G = cv2.merge([imagemVazia, G, imagemVazia])
    B = cv2.merge([B, imagemVazia, imagemVazia])

    imagemVazia = np.zeros((altura, largura, 3), dtype="uint8")
    contadorBalada = contadorBalada % 4 #mod4

    if(contadorBalada == 0):
        imagemBalada = frame
    elif(contadorBalada == 1):
        imagemBalada = R
    elif(contadorBalada == 2):
        imagemBalada = G
    elif(contadorBalada == 3):
        imagemBalada = B

    contadorBalada += 1

    cv2.imshow("webcam",imagemBalada)
    if(cv2.waitKey(1) & 0xFF == ord('q')):
        break

cap.release()
cv2.destroyWindow()
