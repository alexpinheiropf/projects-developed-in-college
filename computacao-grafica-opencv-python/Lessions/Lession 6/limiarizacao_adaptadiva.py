import cv2
import numpy as np

img = cv2.imread("moedas.jpg",0)

# parecido com a função de limiarização (255)
# O próximo parametro verifica se vc quer a limiaização Adaptativa Media ou Ganciana
#   ADAPTIVE_THRESH_MEAN_C = imagina que sua imagem é divida em varias janelas e é calculada a média dos tons
#       e baseado na média de tons é escolhido um limiar, será divida a imagem em segmentos e calcular o limiar
#       para cada segmento baseado na vizinhança
#   A flag THRESH_BINARY irá determinar a configuração desse limiar, da mesma forma que a binarização
#   O proximo parametro irá indicar o tamanho dessa vizinhança que será calculado esse limiar(tem que ser numeros impares)
#       Quanto maior essa vizinhança, mais informação de uma janela ampla sera utilizado como base para calcular o limiar
#       se escolher o limiar pequeno o calculo de limiar será local demais!!!
#   Ultimo parametro é uma constante C
#       Esse valor vc subtrai a média que você calcula quando realizado o procedimento de janelas (normalmente valor positivo)
#
adp1 = cv2.adaptiveThreshold(img, 255, cv2.ADAPTIVE_THRESH_MEAN_C, cv2.THRESH_BINARY, 11, 2)
adp2 = cv2.adaptiveThreshold(img, 255, cv2.ADAPTIVE_THRESH_GAUSSIAN_C, cv2.THRESH_BINARY, 11, 2)

cv2.imshow("original", img)
cv2.imshow("limiaizacao media", adp1)
cv2.imshow("limiaizacao gaussiana", adp2)

cv2.waitKey(0)
cv2.destroyAllWindows()
