#include <stdio.h>
#include <stdlib.h>


int main() {
	int toplam=0;
	int i=0;
	int sayi;
	float ort;
	
	do{
	printf("Lutfen bir sayi giriniz:");
	scanf("%d",&sayi);
	
	if(sayi<0)
	printf("Negatif sayi girilmemelidir.Lutfen pozitif bir tamsayi giriniz:");	
	
	if(sayi==0)
	break;
	if(sayi>0){
		toplam+=sayi;
		i++;
		ort=toplam/i;
	}
	}while(1);
	printf("%d adet pozitif tamsayinin toplami: %d\n",i,toplam);
	printf("%d adet pozitif tamsayinin ortalamasi: %f\n",i,ort);
	
	
	
	
	
	
	
	
	return 0;
}
