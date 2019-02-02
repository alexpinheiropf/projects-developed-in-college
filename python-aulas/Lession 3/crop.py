import cv2
img = cv2.imread("batman.png")
crop_img = img[110:250, 0:230]
cv2.imshow("cropped", crop_img)
cv2.waitKey(0)
