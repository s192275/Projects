#include <stdio.h>
#include <stdlib.h>
int main()
{
	float ortalama;
	char bolum[100];
	char adsoyad[100];
    FILE *ptr;
    ptr=fopen("deneme.txt","r");
    FILE *ptr2=fopen("deneme2.txt","w");
    if(ptr!=NULL && ptr2!=NULL){
        printf("Iki dosya da basarili bir sekilde olusturuldu.\n");
        while(!feof(ptr)){
        	fscanf(ptr,"%s%f%s",&adsoyad,&ortalama,&bolum);
        	printf("Ad-Soyad:%s\nOrtalama:%.2f\nBolum Bilgisi:%s\n",adsoyad,ortalama,bolum);
		}
    }
    rewind(ptr);
    if(ptr!=NULL && ptr2!=NULL){
        printf("Iki dosya da basarili bir sekilde olusturuldu.\n");
        while(!feof(ptr)){
        	fscanf(ptr,"%s%f%s",&adsoyad,&ortalama,&bolum);
        	printf("Ad-Soyad:%s\nOrtalama:%.2f\nBolum Bilgisi:%s\n",adsoyad,ortalama,bolum);
		}
		printf("%d byte degerindedir.",ftell(ptr));//Kaçýncý byte deðerinde olduðunu söyler
    }
    
    else{
        printf("Dosya olusturuldu.");
    }
    fclose(ptr);

    return 0;
}

