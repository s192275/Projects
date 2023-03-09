#include <stdio.h>

typedef struct{
    int saat;
    int dakika;
    double saniye;
}Saat;
void hesapla(float *saniye2){
    Saat zaman;
    zaman.saat=*saniye2/3600;
    zaman.dakika=(*saniye2-zaman.saat*3600)/60;
    zaman.saniye=(*saniye2-zaman.saat*3600-zaman.dakika*60);
    printf("Girilen saniye %d saat %d dakika %.2f saniyedir.",zaman.saat,zaman.dakika,zaman.saniye);
}

int main()
{
    float saniye2;
    printf("Lutfen saniyeyi giriniz:");
    scanf("%f",&saniye2);
    hesapla(&saniye2);
 

    return 0;
}
