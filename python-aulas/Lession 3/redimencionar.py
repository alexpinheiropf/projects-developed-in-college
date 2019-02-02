import cv2
import numpy as np
img = cv2.imread("batman.png")
height, width = img.shape[:2]
res = cv2.resize(img,(2*width, 2*height), interpolation = cv2.INTER_CUBIC)
cv2.imshow("Rezise:", res)
cv2.imshow("Rezise:", img)
cv2.waitKey(0)
