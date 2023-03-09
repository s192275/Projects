#include <stdlib.h>
#include <stdio.h>

int main( void )
{
	int boyut;
	printf("Lutfen dizinin boyutunu giriniz:");
	scanf("%d",&boyut);
	int *c=(int*)malloc(boyut*sizeof(int)); //Belirlenen boyutla sizeof int i çarptýk ve bellekte o kadar yer ayrýldý.int pointerý da dizinin interýn içeriðini  göstermek adýna koyuldu.c pointerý da diziinin içeriðini göstermek adýna koyuldu.
	free(c);                                //Malloc random dizi atar onlarý doldurup atar bundan dolayý calloctan daha hýzlýdýr.
	printf("c dizisi:\n");
	for(int i=0;i<boyut;i++){
	    printf("%d ",i);
	}
	return 0;
}

