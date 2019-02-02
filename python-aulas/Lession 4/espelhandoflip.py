import cv2
image = cv2.imread("clouds.jpg")
flip_horizontal = image[::-1,:] #comando equivalente abaixo
#flip_horizontal = cv2.flip(img, 1)
cv2.imshow("Flip Horizontal", flip_horizontal)
flip_vertical = image[:,::-1] #comando equivalente abaixo #flip_vertical = cv2.flip(img, 0)
cv2.imshow("Flip Vertical", flip_vertical)
flip_hv = image[::-1,::-1] #comando equivalente abaixo
#flip_hv = cv2.flip(img, -1) cv2.imshow("Flip Horizontal e Vertical", flip_hv)
cv2.imshow("Nuvens original", image)
