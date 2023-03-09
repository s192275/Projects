
#include <stdlib.h>
#include <stdio.h>
#include <math.h>

typedef struct{
    char kisi_ad[30];
    char kisi_soyad[30];
    int boy;
    int kilo;
    float indeks;
}insanlar;

void bilgileri_gir(FILE *dosya2){
    int i=0,insan_sayisi;
    FILE *dosya1=fopen("liste.txt","r");
    printf("Kac kisinin verisini cekmek istiyorsaniz giriniz:");
    scanf("%d",&insan_sayisi);
    insanlar *person=(insanlar*)malloc(sizeof(insanlar)*insan_sayisi);
    while(fscanf(dosya1,"%s %s %d %d ",person[i].kisi_ad,person[i].kisi_soyad,&person[i].boy,&person[i].kilo)!=EOF){
    i++;
    }
    fprintf(dosya2,"BOY-KILO INDEKSINE GORE \n\n");
    for(i=0;i<insan_sayisi;i++){
    	person[i].indeks=person[i].kilo/pow((person[i].boy/100),2);
    	fprintf(dosya2,"%s----------%s----------%d----------%d----------%.2f\n",person[i].kisi_ad,person[i].kisi_soyad,person[i].boy,person[i].kilo,person[i].indeks);
	}
    free(person);
    fclose(dosya1);
    fclose(dosya2);
}



int main(){
    FILE *dosya2=fopen("analiz.txt","w");
    if(dosya2==NULL){
        printf("Dosya olusturulurken bir hata meydana geldi.");
        fclose(dosya2);    
	}
    else{
        printf("Dosya basarili bir sekilde olusturuldu...");
        bilgileri_gir(dosya2);
    }
    return 0;
}
