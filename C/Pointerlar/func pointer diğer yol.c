#include <stdio.h>
void sonuchesapla(int a,int b){
    printf("Sonuc:%d\n",a*2+b*3);
}
void sonuchesapla2(int a,int b){
    printf("Sonuc:%d\n",a+2*b-5);
}
void sonuchesapla3(int a,int b){
    printf("Sonuc:%d\n",a*3+b*2);
}

int main()
{
    void(*funcpointer[3])(int,int);//Function pointer ad�nda Merhaba Dunya fonksiyonunu tutan bir pointer�n tan�m�n� yapt�k.
    funcpointer[0]=sonuchesapla3;//Adresini tuttu�unu g�sterdik.
    funcpointer[1]=sonuchesapla2;
    funcpointer[2]=sonuchesapla;
    (*funcpointer[0])(3,5);//funcpointer � �a��rd�k
    (*funcpointer[1])(2,12);
    (*funcpointer[2])(2,8);
    

    return 0;
}

