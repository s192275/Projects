import matplotlib.pyplot as plt
import cv2 as cv
web_cam = cv.VideoCapture(0)

while True:
    tf,frame = web_cam.read()
    frame = cv.Canny(image = frame, threshold1=100, threshold2= 50 )
    cv.imshow('Picture',frame)

    if cv.waitKey(20) & 0xFF == ord('q'):
        break


web_cam.relase()
plt.show()
cv.destroyAllWindows()