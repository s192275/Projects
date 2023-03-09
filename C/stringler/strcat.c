#include <string.h>
#include <stdio.h>

int main()
{
    char isim[30],soyad[30];
    int i=0,karaktersayisi2;
    puts("Lutfen isminizi giriniz:");
    gets(isim);
    puts("Lutfen soyadinizi giriniz:");
    gets(soyad);
    for(karaktersayisi2=0;isim[karaktersayisi2]!='\0';karaktersayisi2++){
    }
    while(soyad[i]!='\0'){
        isim[karaktersayisi2+i]=soyad[i];
        i++;
    }
    printf("Ad ve soyad  %s tir.",isim);

    return 0;
}

