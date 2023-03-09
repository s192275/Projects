#include <stdio.h>
#include <stdlib.h>


int main() {
	int i=0;
	int sayi;
	int toplam=0;
	while(i<10){
		printf("Lutfen bir sayi giriniz:");
		scanf("%d",&sayi);
		if(sayi>0){
			toplam+=sayi;
			i++;
		}
		printf("%d. sayi basari ile kabul edildi.\n",i);
	}
	printf("10 sayiya ait toplam %d olarak bulundu.",toplam);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
