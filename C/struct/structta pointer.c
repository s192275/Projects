#include <stdio.h>
#include <string.h>
struct Ogrenci{
    char isim[20];
    char soyisim[30];
    float ortalama;
};

int main()
{
    struct Ogrenci ogr1={"Serhat","Kilic",3.65};//Baþta tanýmlama olmasaydý strcpy((*ptrogr1).isim,"Serhat") da diyebilirdik
    struct Ogrenci *ptrogr1;
    struct Ogrenci *ptr2ogr1;
    ptrogr1=&ogr1;
    ptr2ogr1=&ogr1;
    strcpy(ptr2ogr1->isim,"Duygu");
    strcpy(ptr2ogr1->soyisim,"Bayrak");
    ptr2ogr1->ortalama= 3.48;
    printf("Ogrenci kalibindaki ogr1 in adresi:%p ve pointer olan ptrogr1 in adresi %p dir.\n",&ogr1,ptrogr1);
    printf("Ogrencinin adi:%s Soyadi:%s Ortalamasi:%4.2f\n",ptrogr1->isim,ptrogr1->soyisim,ptrogr1->ortalama); 
    printf("Ogrencinin adi:%s Soyadi:%s Ortalamasi:%4.2f",(*ptr2ogr1).isim,(*ptr2ogr1).soyisim,(*ptr2ogr1).ortalama);
    /*
    Son kýsýmda olan iþlem:
                           isim           soyisim        ortalama 
    ptrogr1--------->ogr1  Serhat         Kilic           3.65
    ptr2ogr--------->ogr1  Duygu          Bayrak          3.48
    
    /*
}
