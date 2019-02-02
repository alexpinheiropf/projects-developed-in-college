import cv2
print (cv2.__version__)

image = cv2.imread("clouds.jpg")
gray_image = cv2.cvtColor(image, cv2.COLOR_BGR2GRAY)
cv2.imshow("Acima das nuvens", image)
cv2.imshow("Acima das nuvens - Cinza", gray_image)
cv2.waitKey(0)
cv2.destroyAllWindows()
