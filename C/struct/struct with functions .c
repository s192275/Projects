
#include <stdlib.h>
#include <stdio.h>
#include <string.h>
struct Ogrenci{
    char isim[30];
    char soyisim[30];
    float ortalama;
};
void bilgileri_oku(struct Ogrenci *ogr1){
    printf("Lutfen ogrencinin adini giriniz:");
    scanf("%s",ogr1->isim);
    printf("Lutfen ogrencinin soyadini giriniz:");
    scanf("%s",ogr1->soyisim);
    printf("Lutfen ogrencinin ortalamasini giriniz:");
    scanf("%f",&ogr1->ortalama);
}
void bilgileri_yaz(struct Ogrenci *ogr1){
    printf("Ogrencinin adi:%s\n",ogr1->isim);
    printf("Ogrencinin soyadi:%s\n",ogr1->soyisim);
    printf("Ogrencinin ortalamasi:%.2f",ogr1->ortalama);
}
int main()
{
    struct Ogrenci ogr1;
    bilgileri_oku(&ogr1);
    bilgileri_yaz(&ogr1);

    return 0;
}
