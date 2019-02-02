import numpy as np
import cv2
img = cv2.imread("images/batman.png")
rows,cols = img.shape[:2]
#M = np.float32([[1,0,5],[0,1,5]])
#dst = cv2.warpAffine(img,M,(cols,rows))
M = cv2.getRotationMatrix2D((cols/2,rows/2),180,1)
dst = cv2.warpAffine(img,M,(cols,rows))
cv2.imshow('img',dst)
cv2.waitKey(0)
cv2.destroyAllWindows()
