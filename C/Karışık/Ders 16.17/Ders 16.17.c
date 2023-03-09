#include <math.h>
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int dizi[10];
    int aranan_deger;
    int bulundu_mu;
    int i,j;
    printf("Dizi:\n");
    for(i=0;i<10;i++){
        dizi[i]=rand()%100;
        printf("%d\t",dizi[i]);
    }
    printf("\nLutfen aranan degeri giriniz:");
    scanf("%d",&aranan_deger);
    for(i=0;i<10;i++){
        if(aranan_deger==dizi[i])
        bulundu_mu=1;
        break;
        if(aranan_deger!=dizi[i])
        bulundu_mu=0;
    }
    if(bulundu_mu==1)
    printf("Tebrikler aradiginiz degeri buldunuz.");
    else
    printf("Sayi bulunamadi.");
    return 0;
}

