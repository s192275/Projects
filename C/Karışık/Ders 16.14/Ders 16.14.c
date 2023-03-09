#include <stdio.h>
void sayidegistir(int,int);
void sayidegistirpointer(int*,int*);
int main()
{
    int a=5,b=12;
    printf("a sayisinin degeri %d b sayisinin degeri %d dir.\n",a,b);
    sayidegistir(a,b);//Call By Value (De�erini �a��rd�k.De�erle g�sterilirse hi�bir �ekilde de�i�mez.)
    printf("a sayisinin degeri %d b sayisinin degeri %d dir.\n",a,b);
    sayidegistirpointer(&a,&b);//Call By Referance (Adresi �zerinde i�lemler yapaca��m�z i�in kal�c� olur.)
    printf("a sayisinin degeri %d b sayisinin degeri %d dir.\n",a,b);
    return 0;
}
void sayidegistir(int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
    printf("Fonksiyon icinde a nin degeri %d b nin degeri %d dir.\n",a,b);//Fonksiyondan ��k�ld��� an de�erler kaybolur.
}
void sayidegistirpointer(int *a,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}

