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
    struct Ogrenci *xptr;//malloc tan dönen baþlangýç adresini tutar
    xptr=(struct Ogrenci*)malloc(sizeof(struct Ogrenci));
    strcpy(xptr->isim,"Serhat");
    strcpy(xptr->soyisim,"Kilic");
    xptr->ortalama=3.74;
    printf("Ogrencinin adi:%s Ogrencinin Soyadi:%s Ogrencinin Ortalamasi:%3.2f",(*xptr).isim,(*xptr).soyisim,(*xptr).ortalama);
    free(xptr);
    printf("%ld",sizeof(struct Ogrenci));//free komutuyla kapladýðý alan geri verildiði için aþaðýdaki printf boþ kaldý.

    return 0;
}

