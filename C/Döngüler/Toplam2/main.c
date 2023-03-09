#include <stdio.h>
#include <stdlib.h>


int main() {
	int max=0;
	int i;
	int sayi;
	
   printf("Lutfen bir tamsayi giriniz:");
   scanf("%d",&sayi);
   
   while(sayi>0){
   	if(sayi>max){
   		max=sayi;
   	printf("Lutfen bir tamsayi giriniz:");
   	scanf("%d",&sayi);
	   }
	   i++;
   }
	
	printf("Negatif tamsayi girdiginiz icin isleminiz %d.islemde sonlandi.\n",i++);
	printf("Girdiginiz sayilardan en buyugu: %d\n",max);
	
	return 0;
}
