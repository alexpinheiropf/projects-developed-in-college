import cv2
import time
def main(args):
    camera_port = 0 #indica o número da Camera
    nFrames = 30
    camera = cv2.VideoCapture(camera_port)
    file = "imagenTeste.png"

    print ("Digite <ESC> para sair / <s> para Salvar")
    emLoop= True
    while(emLoop):

        retval, img = camera.read()
        cv2.imshow('Foto',img)
        k = cv2.waitKey(100) #le o teclado a cada 100 milissegundos
        if k == 27: #se for a tecla ESC sai do loop
            emLoop= False

        elif k == ord('s'):
            cv2.imwrite(file,img)
            emLoop= False
    cv2.destroyAllWindows()
    camera.release() #libera o objeto câmera
    return 0

if __name__ == '__main__':
    import sys
    sys.exit(main(sys.argv))
