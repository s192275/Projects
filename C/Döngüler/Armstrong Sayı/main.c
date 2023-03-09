#include <stdio.h>
#include <stdlib.h>
#include <math.h>


int main(void) {
	int sayi,gecicisayi,basamak,toplam=0;
	printf("Lutfen sayiyi giriniz:");
	scanf("%d",&sayi);
	
	gecicisayi=sayi;
	
	while(gecicisayi!=0){
		basamak=sayi%10;
		toplam+=pow(basamak,3);
		gecicisayi/=10;
	}
	
	if(toplam==sayi){
		printf("%d sayisi bir Armstrong sayisidir.",sayi);
	}
	else{
		printf("%d sayisi bir Armstrong sayisi degildir.",sayi);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
