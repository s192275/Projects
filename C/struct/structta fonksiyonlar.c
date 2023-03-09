#include <stdio.h>
#include <string.h>
#include <stdlib.h>
struct Ogrenci{
    char isim[20];
    char soyisim[30];
    float ortalama;
};
void bilgileri_oku(struct Ogrenci *ogr){
    printf("Lutfen ogrencinin adini giriniz:");
    scanf("%s",ogr->isim);
    printf("Lutfen ogrencinin soyadini giriniz:");
    scanf("%s",ogr->soyisim);
    printf("Lutfen ogrencinin ortalamasini giriniz:");
    scanf("%f",&ogr->ortalama);
    printf("Ogrencinin adi:%s\n",ogr->isim);
    printf("Ogrencinin soyadi:%s\n",ogr->soyisim);
    printf("Ogrencinin ortalamasi:%.2f",ogr->ortalama);
}
int main()
{
    struct Ogrenci ogr;
    bilgileri_oku(&ogr);
    return 0;
}
