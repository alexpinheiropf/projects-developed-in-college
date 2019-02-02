import cv2 as cv
import numpy as np
img = cv.imread("batman.png")
rows,cols = img.shape [:2]
M = np.float32([[1,0,10],[1,1,50]])
dst = cv.warpAffine(img,M,(cols,rows))
cv.imshow('img',dst)
cv.waitKey(0)
cv.destroyAllWindows()
