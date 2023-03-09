#include <stdio.h>
#include <stdlib.h>


int main() {
	
	int a;
	int b;
	int c;
	int delta;
	
	printf("ax^2+bx+c denklemi icin \n\n");
	printf("Lutfen bir a degeri giriniz:");
	scanf("%d",&a);
	
	printf("Lutfen bir b degeri giriniz:");
	scanf("%d",&b);
	
	printf("Lutfen bir c degeri giriniz:");
	scanf("%d",&c);
	
	delta=b*b-(4*a*c);
	
	if(delta<0)
	{
		printf("Denkleminizin reel bir koku yoktur.");
	}
	
	else if(delta>0)
	{
		printf("Denkleminizin reel 2 koku vardir.");
	}
	
	else if(delta==0)
	{
		printf("Denkleminizin birbirine eþit 2 reel koku vardir");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
