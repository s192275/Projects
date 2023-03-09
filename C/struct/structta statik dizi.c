#include <stdio.h>
#include <string.h>
struct Ogrenci{
    char isim[20];
    char soyisim[30];
    float ortalama;
};

int main()
{
    struct Ogrenci ogr1[3];
    int i;
    for(i=0;i<3;i++){
        printf("Lutfen %d.ogrencinin adini giriniz:",i+1);
        gets(ogr1[i].isim);
        printf("Lutfen %d.ogrencinin soyadini giriniz:",i+1);
        gets(ogr1[i].soyisim);
        printf("Lutfen %d.ogrencinin ortalamsini giriniz:",i+1);
        scanf("%f",&ogr1[i].ortalama);
    }
    for(i=0;i<3;i++){
        printf("%d.ogrencinin adi: %s\n",i+1,ogr1[i].isim);
        printf("%d.ogrencinin soyadi:%s\n",i+1,ogr1[i].soyisim);
        printf("%d.ogrencinin ortalamasi:%5.2f\n",i+1,ogr1[i].ortalama);
        printf("\n");
    }

    return 0;
}

