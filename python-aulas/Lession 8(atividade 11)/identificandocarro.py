#!/usr/bin/env python
import numpy as np
import cv2
if __name__ == '__main__':
    import sys, getopt
    print(__doc__)
    car_cascade = cv2.CascadeClassifier("cascade_dir/cascade.xml")
    cap = cv2.VideoCapture('project_video.mp4')

    paused = False
    step = True

    while True:
        if not paused or step:
            flag, img = cap.read()
            if img.any() == None: break
            height, width, c = img.shape
            gray = cv2.cvtColor(img, cv2.COLOR_BGR2GRAY)
            cars = car_cascade.detectMultiScale(gray, 1.2, 5)
            for (x,y,w,h) in cars:
                cv2.rectangle(img,(x,y),(x+w,y+h),(0,0,255),2)
            cv2.imshow('edge', img)
        step = False
        ch = cv2.waitKey(5)
        if ch == 13:
            step = True
        if ch == 32:
            paused = not paused
        if ch == 27:
            break
    cv2.destroyAllWindows()
