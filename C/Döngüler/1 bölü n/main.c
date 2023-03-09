#include <stdio.h>
#include <math.h>

int main(void) {
	int i,sayi;
	float toplam=0.0f;
	
	printf("Lutfen bir tamsayi giriniz:");
	scanf("%d",&sayi);
	
	for(i=1;i<=sayi;i+=2){
		toplam+=(float)pow(i,2)/(float)pow(i,3);
	}
	printf("1 den %d ye kadar olan tek sayilarin 1/n seklindeki toplami: %f dir.",sayi,toplam);
		
	return 0;
}
