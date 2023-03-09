#include <stdio.h>
#include <stdlib.h>


int main(void) {
	int buyukharf=0,kucukharf=0,sayi=0,karakter;
	char ch;
	char a;
	
	printf("Lutfen bir sifre olusturunuz:");
	
	do{
		ch=getchar();
		if(buyukharf==0){
			if(isupper(ch)){
				buyukharf=1;
			}
		}
		if(kucukharf==0){
			if(islower(ch)){
				kucukharf=1;
			}
		}
		if(sayi==0){
			if(isdigit(ch)){
				sayi=1;
			}
		}
		karakter++;
	}while(ch!='\n');
	    if(buyukharf && kucukharf && sayi && 8<=karakter && karakter<=16){
	    	printf("Girdiginiz sifre sifreleme kurallarina uygundur.Sifreyi olusturmak icin E/e tusuna basiniz olusturmak istemiyorsaniz H/h tusuna basiniz:");
	    	fflush(stdin);
	    	scanf("%c",&a);
	    	if(a=='E' || a=='e'){
	    		printf("Girdiginiz sifre basari ile olusturuldu.");
			}
			else{
				printf("Islem sonlandirildi.");
			}
		}
	else {
		printf("Girdiginiz sifre sifreleme kurallarina uygun degildir.");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
