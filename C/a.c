#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <math.h>
typedef struct{
    char kisi_adi[30];
    char kisi_soyadi[30];
    int boy;
    int kilo;
    float indeks;
}kisiler;
void hesapla(kisiler *person, FILE *dosya2, int insan_sayisi){
    int i,j;
          for(i=0;i<insan_sayisi;i++){
        person[i].indeks=person[i].kilo/pow((person[i].boy/100),2);
}
    for(i=0;i<insan_sayisi-1;i++){
        for(j=0;j<insan_sayisi-1-i;j++){
            if(person[j].indeks>person[j+1].indeks){
                float temp=person[j].indeks;
                person[j].indeks=person[j+1].indeks;
                person[j+1].indeks=temp;
            }
        }
    }
    fprintf(dosya2,"BOY-KILO INDEKSINE GORE SIRALAMA\n\n");
    for(i=0;i<insan_sayisi;i++){
    	fprintf(dosya2,"%s----------%s----------%d----------%d----------%.2f\n",person[i].kisi_adi,person[i].kisi_soyadi,person[i].boy,person[i].kilo,person[i].indeks);
	}
	fclose(dosya2);
}

void bilgileri_gir(FILE *dosya2){
    int insan_sayisi,i=0,j;
    printf("Kac kisinin verisini almak istiyorsunuz giriniz:");
    scanf("%d",&insan_sayisi);
    kisiler *person=(kisiler*)malloc(sizeof(kisiler)*insan_sayisi);
    FILE *dosya1=fopen("liste.txt","r");
    while(fscanf(dosya1,"%s %s %d %d %f",person[i].kisi_adi,person[i].kisi_soyadi,&person[i].boy,&person[i].kilo,&person[i].indeks)!=EOF){
        i++;
    }
    hesapla(person,dosya2,insan_sayisi);
    free(person);
    fclose(dosya1);

}
int main(){
    FILE *dosya2=fopen("analiz.txt","w");
    if(dosya2==NULL){
        printf("Dosya olusturulurken bir hata meydana geldi.");
    }
    else{
        bilgileri_gir(dosya2);
    }
    return 0;
}
