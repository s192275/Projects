#!/usr/bin/env python
# coding: utf-8

# In[12]:


#Soru 1
x_1, y_1 = map(float,input("Lütfen birinci koordinatı giriniz: ").split())
x_2, y_2 = map(float,input("Lütfen ikinci koordinatı giriniz: ").split())
x_3, y_3 = map(float,input("Lütfen üçüncü koordinatı giriniz:").split())
x_4, y_4 = map(float,input("Lütfen aramak istediğiniz noktanın koordinatını giriniz:").split())
bx = x_2-x_1     #Noktanın içinde olma formulü (Matematiksel olarak).Verilen örnekte 
by = y_2-y_1     #nokta üçgenin üzerindedir. O yüzden buna göre else çalışır.
cx = x_3-x_1
cy = y_3-y_1
x = x_4-x_1
y = y_4-y_1
d = bx*cy-cx*by
WA = (x*(by-cy)+y*(cx-bx)+bx*cy-cx*by)/d
WB = (x*cy-y*cx)/d
WC = (y*bx-x*by)/d

if((0< WA < 1) and (0< WB < 1) and (0< WC < 1)):
    print("Girilen nokta üçgen alanının içindedir.")
else:
    print("Girilen nokta üçgen alanının dışındadır ya da üçgenin üzerindedir.")


# In[3]:


#Soru 2
sayi = int(input("Lütfen bir sayı giriniz: "))
print("Girilen sayının çarpanları:")
for i in range(1,(sayi+1)):
    if(sayi % i == 0):
        print(i )


# In[1]:


#Soru 3
def insertionSort(dizi):
    for i in range(1,len(dizi)):
        key = dizi[i]
        j = i -1
        while (j>=0) and (dizi[j] > key):
            dizi[j+1] = dizi[j]
            j-=1
        dizi[j+1] = key
    
    for i in range(0,len(dizi)):
        print(dizi[i])

def selectionSort(dizi):
    for i in range(0,len(dizi)):
        key = i
        for j in range(i+1,len(dizi)):
            if dizi[j] < dizi[key]:
                key = j
        temp = dizi[i]
        dizi[i] = dizi[key]
        dizi[key] = temp
    for i in range(0,len(dizi)):
        print(dizi[i])

def bubbleSort(dizi):
    n = len(dizi)
    for i in range(n-1):
        for j in range(0, n-i-1):
            if dizi[j] > dizi[j + 1]:
                dizi[j], dizi[j + 1] = dizi[j + 1], dizi[j]
         
    for i in range(n):
        print(dizi[i])

def merge(dizi1, dizi2):
    firstPointer = 0
    secondPointer = 0
    mergedList = []
    while firstPointer < len(dizi1) and secondPointer < len(dizi2):
        if dizi1[firstPointer] < dizi2[secondPointer]:
            mergedList.append(dizi1[firstPointer])
            firstPointer += 1
        if dizi2[secondPointer] < dizi1[firstPointer]:
            mergedList.append(dizi2[secondPointer])
            secondPointer +=1
    while  firstPointer < len(dizi1):
        mergedList.append(dizi1[firstPointer])
        firstPointer +=1
    while secondPointer < len(dizi2):
        mergedList.append(dizi2[secondPointer])
        secondPointer +=1
    return mergedList

def mergeSort(dizi):
    if len(dizi) == 1:
        return dizi
    mid = int(len(dizi)/2)
    right = dizi[mid:]
    left = dizi[:mid]
    return merge(mergeSort(left), mergeSort(right))
def pivot(dizi, pivotIndex, endIndex):
        swapIndex = pivotIndex
        for i in range(pivotIndex+1, endIndex+1):
            if dizi[i] < dizi[pivotIndex]:
                swapIndex += 1
                dizi[swapIndex], dizi[i] = dizi[i], dizi[swapIndex]
        dizi[pivotIndex], dizi[swapIndex] = dizi[swapIndex], dizi[pivotIndex]
        return swapIndex

def quickSort(dizi, leftPointer = 0, rightPointer=None):
    if rightPointer == None:
        rightPointer = len(dizi) - 1
    if leftPointer < rightPointer:
        pivotIndex = pivot(dizi, leftPointer, rightPointer)
        quickSort(dizi, leftPointer, pivotIndex-1)  
        quickSort(dizi, pivotIndex+1, rightPointer)       
    return dizi
while True:
    boyut = int(input("Lütfen sıralamak istediğiniz dizinin boyutunu girin:"))
    dizi=list(map(float,input("Diziyi girin: ").strip().split()))
    print("1.Insertion Sort")
    print("2.Selection Sort")
    print("3.Bubble Sort")
    print("4.Merge Sort")
    print("5.Quick Sort")
    islem = int(input("Lütfen işlemi seçin:"))
    if islem == 1:
        insertionSort(dizi)
    if islem == 2:
        selectionSort(dizi)
    if islem == 3:
        bubbleSort(dizi)
    if islem == 4:
        print(mergeSort(dizi))
    if islem == 5:
        print(quickSort(dizi))
    


# In[2]:


#Soru 4:
metin = input("Lütfen bir metin giriniz:");
kelime = input("Lütfen aranacak kelimeyi giriniz: ")
if kelime in metin:
    print("Kelime bulundu")
else:
    print("Kelime bulunamadı.")


# In[ ]:


#Soru 5
#Bu sorunun geçilmesi istendi...


# In[1]:


#Soru 6:
fact = int(input("Lütfen faktöriyeli alınacak sayıyı giriniz:"))
def factorial(fact):
    if fact == 0 or fact == 1:
        return 1
    else:
        return fact * factorial(fact-1)
factorial(fact)    


# In[ ]:


#Soru 7
#Ne demek istenildiğini anlamadım...


# In[6]:


#Soru 8
import cv2
import numpy as np
img = cv2.imread('C:/Users/s7522/Desktop/resim.jpeg')
red = [0,0,255]
X,Y = np.where(np.all(img==red, axis=1))
zipped = np.column_stack((X,Y))
print(zipped)


# In[1]:


#Soru 9 
from tkinter import *
pencere = Tk()
pencere.title("Kullanıcı Girişi")
pencere.geometry("300x200")

def popup():
    isim = str(ad.get())
    pencere2 = Tk()
    pencere2.title("Merhaba")
    label2 = Label(pencere2,text = "Merhaba "+isim)
    label2.pack()
    pencere2.geometry("300x200")
    pencere.destroy()

def giris():
    global kul_ad,ad,buton
    kul_ad = Label(text = "Lütfen adınızı giriniz:")
    kul_ad.grid(row=0, column=0)
    ad = Entry()
    ad.grid(row=0, column=1)
    buton = Button(pencere,text = "OK", width = 15,command = popup)
    buton.grid(row=1,column=1)

giris()
mainloop()


# In[ ]:


#Soru 10
import matplotlib.pyplot as plt
boy = list(map(float,input("Boyları girin : ").strip().split()))
kilo = list(map(float,input("Kiloları girin: ").strip().split()))
plt.xlabel("Boy")
plt.ylabel("Kilo")
plt.plot(boy,kilo)
plt.show()

