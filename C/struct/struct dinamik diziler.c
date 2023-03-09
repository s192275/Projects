#include <stdio.h>
#include <string.h>
#include <stdlib.h>
struct Ogrenci{
    char isim[20];
    char soyisim[30];
    float ortalama;
};
int main()
{
    int ogrencisayisi,i;
    struct Ogrenci *ogrptr;
    ogrptr=(struct Ogrenci*)malloc(sizeof(struct Ogrenci)*ogrencisayisi);
    printf("Lutfen kac ogrenci uzerinde islem yapmak istiyorsaniz giriniz:");
    scanf("%d",&ogrencisayisi);
    for(i=0;i<ogrencisayisi;i++){
    printf("Lutfen ogrencinin adini giriniz:");
    scanf("%s",ogrptr[i].isim);
    printf("Lutfen ogrencinin soyadini giriniz:");
    scanf("%s",ogrptr[i].soyisim);
    printf("Lutfen ogrencinin ortalamasini giriniz:");
    scanf("%f",&ogrptr[i].ortalama);
    }
    for(i=0;i<ogrencisayisi;i++){
        printf("%d.ogrencinin adi:%s\n",i+1,ogrptr[i].isim);
        printf("%d.ogrencinin soyadi:%s\n",i+1,ogrptr[i].soyisim);
        printf("%d.ogrencinin ortalamasi:%5.2f\n",i+1,ogrptr[i].ortalama);
        printf("\n");
    }
    free(ogrptr);
	    return 0;
}

