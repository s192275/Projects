#include <stdlib.h>
#include <stdio.h>

int main( void )
{
	int boyut;
	printf("Lutfen dizinin boyutunu giriniz:");
	scanf("%d",&boyut);
	int *c=(int*)malloc(boyut*sizeof(int)); //Belirlenen boyutla sizeof int i �arpt�k ve bellekte o kadar yer ayr�ld�.int pointer� da dizinin inter�n i�eri�ini  g�stermek ad�na koyuldu.c pointer� da diziinin i�eri�ini g�stermek ad�na koyuldu.
	free(c);                                //Malloc random dizi atar onlar� doldurup atar bundan dolay� calloctan daha h�zl�d�r.
	printf("c dizisi:\n");
	for(int i=0;i<boyut;i++){
	    printf("%d ",i);
	}
	return 0;
}

