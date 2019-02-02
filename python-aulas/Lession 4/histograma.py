import cv2

img = cv2.imread("estrada.png")
img = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
#Função calcHist para calcular o hisograma da imagem
h = cv2.calcHist([img], [0], None, [256], [0, 256])
plt.figure()
plt.title("Histograma Preto&Branco")
plt.xlabel("Intensidade")
plt.ylabel("Qtde de Pixels")
plt.plot(h)
plt.xlim([0, 256])
plt.show()
