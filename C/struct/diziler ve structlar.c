#include <stdio.h>
#include <string.h>
#include <stdlib.h>

struct Ogrenci{
    char isim[20];
    char soyisim[20];
    float ortalama;
};
void bilgileri_oku(struct Ogrenci *ogr1,struct Ogrenci *ogr2){
    printf("Lutfen ogrencinin adini giriniz:");
    scanf("%s",&ogr1->isim);
    printf("Lutfen ogrencinin soyadini giriniz:");
    scanf("%s",&ogr1->soyisim);
    printf("Lutfen ogrencinin ortalamasini giriniz:");
    scanf("%f",&ogr1->ortalama);
    printf("\n\n");
    printf("Lutfen ogrencinin adini giriniz:");
    scanf("%s",&ogr2->isim);
    printf("Lutfen ogrencinin soyadini giriniz:");
    scanf("%s",&ogr2->soyisim);
    printf("Lutfen ogrencinin ortalamasini giriniz:");
    scanf("%f",&ogr2->ortalama);
}
void bilgileri_yazdir(struct Ogrenci *ogr1,struct Ogrenci *ogr2){
    printf("Ogrenci adi:%s\n",ogr1->isim);
    printf("Ogrenci soyadi:%s\n",ogr1->soyisim);
    printf("Ogrenci ortalamasi:%3.2f\n",ogr1->ortalama);
    printf("\n\n");
    printf("Ogrenci adi:%s\n",ogr2->isim);
    printf("Ogrenci soyadi:%s\n",ogr2->soyisim);
    printf("Ogrenci ortalamasi:%3.2f\n",ogr2->ortalama);
}
void bilgileri_degistir(struct Ogrenci *ogr1,struct Ogrenci *ogr2){
    struct Ogrenci *temp;
    *temp=*ogr1;
    *ogr1=*ogr2;
    *ogr2=*temp;
    printf("Ogrenci adi:%s\n",ogr1->isim);
    printf("Ogrenci soyadi:%s\n",ogr1->soyisim);
    printf("Ogrenci ortalamasi:%3.2f\n",ogr1->ortalama);
    printf("\n\n");
    printf("Ogrenci adi:%s\n",ogr2->isim);
    printf("Ogrenci soyadi:%s\n",ogr2->soyisim);
    printf("Ogrenci ortalamasi:%3.2f\n",ogr2->ortalama);
}
int main()
{
    struct Ogrenci ogr1,ogr2;
    bilgileri_oku(&ogr1,&ogr2);
    printf("Ogrenci bilgileri:\n");
    bilgileri_yazdir(&ogr1,&ogr2);
    printf("\n\nOgrencilerin bilgilerinin degismis hali:\n");
    bilgileri_degistir(&ogr1,&ogr2);

    return 0;
}

