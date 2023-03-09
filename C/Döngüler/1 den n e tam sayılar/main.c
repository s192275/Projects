#include <stdio.h>
#include <stdlib.h>


int main(void) {
	int sayi=1;
	int n;
	
	printf("Lutfen bir tamsayi giriniz:");
	scanf("%d",&n);
	
	printf("1 den %d e kadar olan tamsayilar:\n ",n);
	while(sayi<n){
		printf("%d",sayi);
		if(n%2!=0)
		sayi=sayi+2;
		else 
		sayi++;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
