#include <stdio.h>
#include <stdlib.h>



int main() {
	int sayi;
	int i;
	int bolundumu=0;
	
	printf("Lutfen asallik bakimindan tespit edilecek olan sayiyi giriniz:");
	scanf("%d",&sayi);
	
	for(i=2;i<sayi;i++){
		if(sayi%i==0){
			bolundumu=1;
			break;
		}
	}
	if(bolundumu==1){
		printf("Sorguladiginiz sayi %d dir ve asal sayi degildir.",sayi);
	}
	else{
		printf("Sorguladiginiz sayi %d dir ve asaldir",sayi);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
