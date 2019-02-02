import cv2
vermelho = (0, 0, 255)
verde = (0, 255, 0)
azul = (255, 0, 0)
cv2.line(image, (0, 0), (100, 200), verde)
cv2.line(image, (300, 200), (150, 150), vermelho, 5)
cv2.rectangle(image, (20, 20), (120, 120), azul, 10)
cv2.rectangle(image, (200, 50), (225, 125), verde, -1)
(X, Y) = (image.shape[1] // 2, image.shape[0] // 2)
for raio in range(0, 175, 15):
    cv2.circle(image, (X, Y), raio, vermelho)
