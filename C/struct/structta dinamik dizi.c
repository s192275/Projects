#include <stdio.h>
#include <stdlib.h>
#include <string.h>
struct Ogrenci{
    char isim[20];
    char soyisim[30];
    float ortalama;
};
int main()
{
    struct Ogrenci *xptr;//malloc tan d�nen ba�lang�� adresini tutar
    xptr=(struct Ogrenci*)malloc(sizeof(struct Ogrenci));
    strcpy(xptr->isim,"Serhat");
    strcpy(xptr->soyisim,"Kilic");
    xptr->ortalama=3.74;
    printf("Ogrencinin adi:%s Ogrencinin Soyadi:%s Ogrencinin Ortalamasi:%3.2f",(*xptr).isim,(*xptr).soyisim,(*xptr).ortalama);
    free(xptr);
    printf("%ld",sizeof(struct Ogrenci));//free komutuyla kaplad��� alan geri verildi�i i�in a�a��daki printf bo� kald�.

    return 0;
}

