#include <stdio.h>

void diziyiyazdir(int dizi[],int sayi);
int main(){
	int dizi[10],i;
	for(i=0;i<10;i++){
		printf("%d.elemani giriniz:",i+1);
		scanf("%d",&dizi[i]);
	}
		 diziyiyazdir(dizi,10);
	return 0;
}
void diziyiyazdir(int dizi[],int sayi){
	int i;
	printf("Dizi elemanlari:\n");
	for(i=0;i<10;i++){
		printf("%d\t",dizi[i]);
	}
}
