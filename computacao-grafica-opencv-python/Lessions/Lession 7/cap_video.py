import numpy as np
import cv2

# Paramatro VideoCapture utilizado para abrir a camera no notebook
cap = cv2.VideoCapture(0)
contadorBalada = 0 #variavel de controle
#while para definir critério de parada da gravação da camera
while(True):
    #Função cap.read serve para receber frame de video e guarda na variável "frame"
    #   A variavel existeFrame serve como validação da variavel frame como TRUE e FALSE
    existeFrame, frame = cap.read()

    altura, largura, _ = frame.shape
    imagemVazia = np.zeros((altura, largura), dtype="uint8")#deixando a imagem vazia do mesmo tamanho com cada canal de 0 à 255

    #fatiando a imagem nas três cores primarias
    (B, G, R) = cv2.split(frame)
    R = cv2.merge([imagemVazia, imagemVazia, R]) #criando uma imagem toda vermelha
    G = cv2.merge([imagemVazia, G, imagemVazia]) #criando uma imagem toda verde
    B = cv2.merge([B, imagemVazia, imagemVazia]) #criando uma imagem toda azul

    #criando uma nova imagem porem agora com os tres canais
    imagemBalada = np.zeros((altura, largura, 3), dtype="uint8")

    #criando vaiavel de controle inteira
    contadorBalada = contadorBalada % 4 #mod4 (o que resta do calculo matemático) exemplo o contadorBalada se receber maior q 3 volta a
                                        # zero
    if(contadorBalada == 0):
        imagemBalada = frame
    elif(contadorBalada == 1):
        imagemBalada = R
    elif(contadorBalada == 2):
        imagemBalada = G
    elif(contadorBalada == 3):
        imagemBalada = B

    contadorBalada += 1

    cv2.imshow("webcam", imagemBalada)
    if(cv2.waitKey(1) & 0xFF == ord('q')):#se precionado a letra 'q' do teclado a aplicação para de rodar
        break

cap.release() #interrompe e libera todos os recursos que estão sendo utilizados
cv2.destroyAllWindows()
