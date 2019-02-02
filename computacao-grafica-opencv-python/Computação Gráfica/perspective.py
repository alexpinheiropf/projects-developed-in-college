import cv2 as cv
import numpy as np
img = cv.imread("images/batman.png")
rows,cols,ch = img.shape
pts1 = np.float32([[56,65],[368,52],[28,387],[389,390]])
pts2 = np.float32([[0,0],[300,0],[0,300],[300,300]])
M = cv.getPerspectiveTransform(pts1,pts2)
dst = cv.warpPerspective(img,M,(300,300))
cv.imshow("Perspective", dst)
cv.waitKey(0)
