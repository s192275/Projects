#include <stdio.h>
#include <string.h>
int main(){
    char metin[30],gecici[30];
    int i,karakter_sayisi;
    puts("Lutfen bir string girisi yapiniz:");
    gets(metin);
    karakter_sayisi=strlen(metin);
    for(i=0;i<karakter_sayisi/2;i++){
        gecici[i]=metin[i];
        metin[i]=metin[karakter_sayisi-i-1];
        metin[karakter_sayisi-i-1]=gecici[i];
    }
    puts(metin);
    return 0;
}
