#include <stdio.h>
 struct Calisan{
    char isim[30];
    int maas;
    int sehirplaka;
    }calisan;

int main()
{
    printf("Lutfen calisan adini giriniz:");
    scanf("%s",calisan.isim);
    printf("Lutfen calisanin maasini giriniz:");
    scanf("%d",&calisan.maas);
    printf("Lutfen sehir plakasi giriniz:");
    scanf("%d",&calisan.sehirplaka);
    printf("\n\n");
    printf("Calisan adi:%s\n",calisan.isim);
    printf("Calisan maas:%d\n",calisan.maas);
    printf("Sehir plaka:%d",calisan.sehirplaka);
    return 0;
}

