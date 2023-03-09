#include <stdio.h>
typedef struct{
    int saat;
    int dakika;
    int saniye;
}Zaman;
Zaman zaman_farki_hesapla(Zaman kullanici1,Zaman kullanici2){
    Zaman saatler_arasi;
    int fark;
    int birinci_zaman=kullanici1.saat*3600+kullanici1.dakika*60+kullanici1.saniye;
    int ikinci_zaman=kullanici2.saat*3600+kullanici2.dakika*60+kullanici2.saniye;
    if(birinci_zaman>=ikinci_zaman){
        fark=birinci_zaman-ikinci_zaman;
        saatler_arasi.saat=fark/3600;
        saatler_arasi.dakika=(fark-saatler_arasi.saat*3600)/60;
        saatler_arasi.saniye=(fark-saatler_arasi.saat*3600-saatler_arasi.dakika*60);
    }
    if(ikinci_zaman>=birinci_zaman){
        fark=ikinci_zaman-birinci_zaman;
        saatler_arasi.saat=fark/3600;
        saatler_arasi.dakika=(fark-saatler_arasi.saat*3600)/60;
        saatler_arasi.saniye=(fark-saatler_arasi.saat*3600-saatler_arasi.dakika*60);
    }
    printf("Iki kullanicinin zaman farki:%d.%d.%d",saatler_arasi.saat,saatler_arasi.dakika,saatler_arasi.saniye); 
}
int main(){
    Zaman fark,kullanici1,kullanici2;
    printf("Lutfen birinci kullanici icin saat bilgisini giriniz:");
    scanf("%d",&kullanici1.saat);
    printf("Lutfen birinci kullanici icin dakika bilgisini giriniz:");
    scanf("%d",&kullanici1.dakika);
    printf("Lutfen birinci kullanici icin saniye bilgisini giriniz:");
    scanf("%d",&kullanici1.saniye);
    printf("\n\n");
    printf("Lutfen ikinci kullanici icin saat bilgisini giriniz:");
    scanf("%d",&kullanici2.saat);
    printf("Lutfen ikinci kullanici icin dakika bilgisini giriniz:");
    scanf("%d",&kullanici2.dakika);
    printf("Lutfen ikinci kullanici icin saniye bilgisini giriniz:");
    scanf("%d",&kullanici2.saniye);
    printf("\n\n");
    printf("Birinci kullanici icin zaman bilgileri:%d.%d.%d\n",kullanici1.saat,kullanici1.dakika,kullanici1.saniye);
    printf("Ikinci kullanici icin zaman bilgileri:%d.%d.%d\n",kullanici2.saat,kullanici2.dakika,kullanici2.saniye);
    fark=zaman_farki_hesapla(kullanici1,kullanici2);
   
    
    return 0;
}

