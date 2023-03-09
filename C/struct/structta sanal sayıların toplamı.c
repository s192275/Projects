#include <stdio.h>
typedef struct{
    float sanalKisim;
    float GercelKisim;
}KomplekSayi;
KomplekSayi sayi_topla(KomplekSayi sayi1,KomplekSayi sayi2){
	KomplekSayi sonuc;
          sonuc.sanalKisim=sayi1.sanalKisim+sayi2.sanalKisim;
          sonuc.GercelKisim=sayi1.GercelKisim+sayi2.GercelKisim;
    return sonuc;
}

int main()
{
    KomplekSayi sayi1,sayi2,sonuc;
    printf("Lutfen birinci kompleks sayinin sanal ve gercel kisimlarini giriniz:");
    scanf("%f%f",&sayi1.sanalKisim,&sayi1.GercelKisim);
    printf("Lutfen ikinci kompleks sayinin sanal ve gercel kisimlarini giriniz:");
    scanf("%f%f",&sayi2.sanalKisim,&sayi2.GercelKisim);
    sonuc=sayi_topla(sayi1,sayi2);
    printf("Sonuc:%.1f+%.1fi",sonuc.GercelKisim,sonuc.sanalKisim);
    return 0;
}

