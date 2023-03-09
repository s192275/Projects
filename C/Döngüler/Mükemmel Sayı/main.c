#include <stdio.h>
#include <stdlib.h>


int main(void) {
	int sayi,toplam,i;
	printf("Lutfen sorgulanacak olan sayiyi giriniz:");
	scanf("%d",&sayi);
	
	for(i=1;i<sayi;i++){
		if(sayi%i==0)
		toplam+=i;
	}
	if(toplam==sayi){
		printf("Sayi mukemmeldir.");
	}
	else{
		printf("Sayi mukemmel degildir.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
