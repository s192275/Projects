#include <stdio.h>
#include <string.h>
void bosluk_sayisi_hesapla(int *kullanicigirisi,int bosluk_sayisi){
       char *ptr=kullanicigirisi;
    while(*ptr!='\0'){
            if(*ptr==' '){
               bosluk_sayisi++;
            }
        ptr++;
    }
    printf("Girilen metinde bosluk sayisi %d olarak bulundu.",bosluk_sayisi);
}
void tersini_yaz(int *kullanicigirisi){
    int karakter_sayisi=strlen(kullanicigirisi);
    char *ptr=karakter_sayisi+kullanicigirisi-1;
    while(ptr>=karakter_sayisi){
        printf("%c",*ptr);
        ptr--;
    }
}
int main(){
    int bosluk_sayisi=0;
    char kullanicigirisi[100];
    puts("Lutfen karakter girisinizi yapiniz:");
    gets(kullanicigirisi);
    bosluk_sayisi_hesapla(kullanicigirisi,bosluk_sayisi);
    tersini_yaz(kullanicigirisi);
    return 0;
}
