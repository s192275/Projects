#include <string.h>
#include <stdio.h>
int main(){
    char kullanicigirisi[20];
    int sorgu=1,i=0,karakter_sayisi;
    puts("Lütfen palindrom olup olmama bakimindan sorgulanacak metni giriniz:");
    gets(kullanicigirisi);
    karakter_sayisi=strlen(kullanicigirisi);
    for(i=0;i<=karakter_sayisi/2;i++){
        if(kullanicigirisi[i]==kullanicigirisi[karakter_sayisi-i-1]){
            sorgu=1;
            break;
        }
        else{
            sorgu=0;
            break;
        }
    }
    if(sorgu==1){
        printf("Girilen metin palindromdur.");
    }
    else{
        printf("Girilen metin palindrom degildir.");
    }
}
