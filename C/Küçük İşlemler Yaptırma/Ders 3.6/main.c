#include <stdio.h>
#include <stdlib.h>


int main() {
	int sayi,bolum,bolen,kalan;
	printf("Lutfen bir sayi seciniz:");
	scanf("%d",&sayi);
	printf("Lutfen sectiginiz sayiyi bolmek icin bir bolum seciniz:");
	scanf("%d",&bolum);
	
	bolen=(sayi-kalan)/bolum;
	kalan=sayi%bolen;
	bolum=(sayi-kalan)/bolen;
	sayi=(bolum*bolen)+kalan;
	printf("Bolen: %d",bolen);
	printf("Bolum: %d",bolum);
	printf("Kalan: %d",kalan);
	
	
	
	
	
	
	
	
	
	return 0;
}
