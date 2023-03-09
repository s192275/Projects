#include <stdio.h>
#include <string.h>
int main(){
    char metin[30];
    int i=0,karakter_sayisi,kelime_sayisi=1;
    puts("Girilecek stringi giriniz:");
    gets(metin);
    karakter_sayisi=strlen(metin);
    for(i=0;i<karakter_sayisi;i++){
        if(metin[i]==' '){
            kelime_sayisi++;
        }
    }
    printf("Girilen metinde kelime sayisi %d karakter sayisi ise %d dir.",kelime_sayisi,karakter_sayisi);

    return 0;
}
