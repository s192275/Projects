#include <stdio.h>
int main(){
	int dizi[5],carpim=1,toplam=0,i;
	printf("Diziyi olusturmak icin sayi girisi yapiniz:");
	for(i=0;i<5;i++){
		scanf("%d",&dizi[i]);
		toplam+=dizi[i];
		carpim*=dizi[i];
	}
	printf("Diziyi olusturmak icin girilen sayilar sunlardir:\n");
	for(i=0;i<5;i++){
		printf("%d\t",dizi[i]);
	}
   printf("\nDiziyi olusturan sayilarin carpimi:%d toplami:%d dir.\n",carpim,toplam);
	
}
