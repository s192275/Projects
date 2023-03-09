#include <stdio.h>
#include <stdlib.h>


int main() {
	int sayi1,sayi2,buyuksayi,kucuksayi,ebob,ekok,i;
	
	printf("Lutfen EBOB EKOK bulunacak iki sayiyi giriniz:");
	scanf("%d%d",&sayi1,&sayi2);
	
	if(sayi1>sayi2){
		buyuksayi=sayi1;
		kucuksayi=sayi2;
	}
	
	else{
		buyuksayi=sayi2;
		kucuksayi=sayi1;
	}
	
   i=buyuksayi;
   while(1){
   	if(i%buyuksayi==0 && i%kucuksayi==0){
   		ekok=i;
   		break;
	   }
	   i++;
   }
    i=buyuksayi;   
		while(1){
			if(buyuksayi%i==0 && kucuksayi%i==0){
				ebob=i;
				break;
			}
			i--;
		}
	printf("%d ve %d sayilarinin EBOB u: %d EKOK u %d olarak bulundu.",sayi1,sayi2,ebob,ekok);
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
