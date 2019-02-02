import cv2

img = cv2.imread("limi.jpg",0) #o parametro 0 significa carregar tons de cinza

#função de binarização retorna dos parametros
#1 parametro é limiar (definido pelo usuário)
#2 parametro é a imagem após a binarização - recebe parametros:
#   recebe a imagem que carregada no inicio, linear definido (150),
#   parametro 3 da imagem indica quais cores os pixels acima irão receber (255),
#   ultimo parametro é muma flag(mostra como funciona a binarização)
#   com a flag THRESH_BINARY aparace apenas os valores com as cores definidas
#   A flag THRESH_BINARY_INV funciona da seguinte forma
#       Todos os pixels que estiver abaixo de 150 receberão branco
#       e todos os pixels que estiverem acima de 150 receberão preto
#   Outra flag para utilizar é a THRESH_TRUNC
#       Consiste em todos os pixels que estiverem abaixo de um limear ficão como estão
#       Os pixels que estão acima do limear recebem o valor do limear
#       Como se essa flag fosse como um teto
#   A flag THRESH_TOZERO, consiste em que todos os pixels que estiverem acima do limear
#       irão se manter como estão, porem os pixels que estão abaixo do limear irão zerar
#   E por ultimo a flag THRESH_TOZERO_INV, todos os pixels abaixo do limear permaneceram como estão
#       Porem aqueles que estiver com maior valor que o limear irão ficar preto

limiar, imgLimiar = cv2.threshold(img, 128, 255, cv2.THRESH_TOZERO_INV)

cv2.imshow("Limiar", imgLimiar)
cv2.waitKey(0)
cv2.destroyAllWindows()
