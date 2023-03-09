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
    printf("Sonuncu karakter %d byte degerindedir.\n",ftell(ptr));
    fseek(ptr,5,SEEK_SET);//baþtan itibaren 5 byte SEEK_SET yerine 0
    fseek(ptr,5,SEEK_CUR);//son kaldýðým yerden 5 byte SEEK_CUR yerine 1
    fseek(ptr,-1,SEEK_END);//dosyanýn sonundan itibaren 5 byte SEEK_END yerine 2 yazabilirsin
    printf("%d byte degerindedir.",ftell(ptr));
    
   
    fclose(ptr);

    return 0;
}
