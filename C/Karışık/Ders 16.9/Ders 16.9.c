#include <stdio.h>
void diziyeverigirisi(int dizi[],int sayi);
int enbuyukeleman(int dizi[],int sayi);
int enkucukeleman(int dizi[],int sayi);
int main(){
	int dizi[10];
	diziyeverigirisi(dizi,10);
	printf("Dizinin en buyuk elemani %d en kucuk elemani %d dir.",enbuyukeleman(dizi,10),enkucukeleman(dizi,10));
	return 0;
}
int enbuyukeleman(int dizi[],int sayi){
	int i,b;
	b=dizi[0];
	for(i=0;i<10;i++){
		if(dizi[i]>b)
		b=dizi[i];
	}
	return b;
}
int enkucukeleman(int dizi[],int sayi){
	int i,k;
	k=dizi[0];
	for(i=0;i<10;i++){
		if(dizi[i]<k)
		k=dizi[i];
	}
	return k;
}
void diziyeverigirisi(int dizi[],int sayi){
	int i;
	printf("Lutfen dizinin olusmasi icin tamsayi girisi yapiniz:");
	for(i=0;i<10;i++){
		scanf("%d",&dizi[i]);
	}
	printf("Secilen sayilardan olusan dizi sudur:\n");
	for(i=0;i<10;i++){
		printf("%d\t",dizi[i]);
	}
}
