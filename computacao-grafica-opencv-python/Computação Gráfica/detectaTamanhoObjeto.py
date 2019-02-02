import cv2
import numpy as np

cap=cv2.VideoCapture(0)
D = []
max_samples = 10000
while(1):
    d=0.1
    centers=[]
    _, img = cap.read()
    hsv=cv2.cvtColor(img,cv2.COLOR_BGR2HSV)
    #range de cores para o azul
    blue_lower=np.array([95,150,100],np.uint8)
    blue_upper=np.array([150,255,255],np.uint8)
    #Criando uma máscara para objetos somente azuis.
    blue=cv2.inRange(hsv,blue_lower,blue_upper)
    #Cria uma matriz de 5x5 sobreposta sobre o vídeo
    kernel = np.ones((5 ,5), "uint8")
    #https://docs.opencv.org/3.0-beta/doc/py_tutorials/py_imgproc/py_morphological_ops/py_morphological_ops.html
    # Aumenta
    blue = cv2.morphologyEx(blue,cv2.MORPH_OPEN,kernel)
    blue = cv2.morphologyEx(blue,cv2.MORPH_CLOSE,kernel)
    cv2.imshow("Blue:",blue)
    blue=cv2.erode(blue,kernel, iterations=1)
    res1=cv2.bitwise_and(img, img, mask = blue)
    #Comando para encotrar o contorno dos objetos na cena
    (_,contours,hierarchy)=cv2.findContours(blue,cv2.RETR_TREE,cv2.CHAIN_APPROX_SIMPLE)
    for pic, contour in enumerate(contours):
        #Com os contornos é definido a área
        area = cv2.contourArea(contour)
        mayor_contorno = max(contours, key = cv2.contourArea)
        if(area>2000):
            #Encontra a coordenada dos contornos.
            x,y,w,h = cv2.boundingRect(contour)
            img = cv2.rectangle(img,(x,y),(x+w,y+h),(255,0,0),2)
            cv2.putText(img,"Marcador",(x,y),cv2.FONT_HERSHEY_SIMPLEX, 0.7, (255,0,0))
            #Encontra o centro do objeto
            M = cv2.moments(contour)
            cx = int(M['m10'] /M['m00'])
            cy = int(M['m01'] /M['m00'])
            #Adiciona na lista de centros encontrados
            centers.append([cx,cy])
            #inclui um circulo branco no centro
            cv2.circle(img, (cx, cy), 7, (255, 255, 255), -1)
        if len(centers)==2:
            #Se houver dois centros, calcula a distancia dos pontos
            D = (np.linalg.norm(cx-cy))
            print(D)
    cv2.imshow("Color Tracking",img)
    if cv2.waitKey(10) & 0xFF == ord('q'):
        cap.release()
        cv2.destroyAllWindows()
        break
