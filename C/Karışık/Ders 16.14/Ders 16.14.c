#include <stdio.h>
void sayidegistir(int,int);
void sayidegistirpointer(int*,int*);
int main()
{
    int a=5,b=12;
    printf("a sayisinin degeri %d b sayisinin degeri %d dir.\n",a,b);
    sayidegistir(a,b);//Call By Value (Deðerini çaðýrdýk.Deðerle gösterilirse hiçbir þekilde deðiþmez.)
    printf("a sayisinin degeri %d b sayisinin degeri %d dir.\n",a,b);
    sayidegistirpointer(&a,&b);//Call By Referance (Adresi üzerinde iþlemler yapacaðýmýz için kalýcý olur.)
    printf("a sayisinin degeri %d b sayisinin degeri %d dir.\n",a,b);
    return 0;
}
void sayidegistir(int a,int b){
    int temp;
    temp=a;
    a=b;
    b=temp;
    printf("Fonksiyon icinde a nin degeri %d b nin degeri %d dir.\n",a,b);//Fonksiyondan çýkýldýðý an deðerler kaybolur.
}
void sayidegistirpointer(int *a,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}

