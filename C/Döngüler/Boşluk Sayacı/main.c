#include <stdio.h>
#include <stdlib.h>


int main(void) {
		
	
	char ch;
	int boslukSayisi=0;
	printf("Lutfen bosluk sayisi belirlenecek cumleyi giriniz.");
	do{
		ch=getchar();//karakter alma.
		if(ch==' '){
			boslukSayisi++;
		}	
	}while(ch!='\n');
	
	printf("Girdiginiz cumlede %d adet bosluk karakteri gecmektedir.\n",boslukSayisi);

	
	
	
	
	
	
	
	
	
	
	return 0;
}
