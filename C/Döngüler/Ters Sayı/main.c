#include <stdio.h>
#include <stdlib.h>


int main(void) {
	int sayi,gecicisayi,tersi=0,kalan;
	
	printf("Lutfen tersi alinacak sayiyi giriniz:");
	scanf("%d",&sayi);
	
	gecicisayi=sayi;
	
	while(gecicisayi!=0){
		kalan=gecicisayi%10;
		tersi=tersi*10+kalan;
		gecicisayi/=10;
	}
	
	printf("Tersi bulunmasi icin girdiginiz %d sayisinin tersi: %d dir.",sayi,tersi);
	
	
	
	
	
	
	
	return 0;
}
