#include <stdio.h>
#include <stdlib.h>
#include <time.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

int main() {
	int sayi;
	srand(time(NULL));
	sayi=rand()%10000;
	printf("Uretilen sayi: %d",sayi);
	
	if(0<sayi && sayi<10){
		printf("Sayi tek basamaklidir.");
	}
	else if(10<=sayi && sayi<100){
		printf("Sayi iki basamaklidir.");
	}
	
	else if(100<=sayi && sayi<1000){
		printf("Sayi uc basamaklidir.");
	}
	else{
		printf("Sayi dort basamaklidir.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
