#include <stdio.h>
int main(){
	double a[]={3.9,2.4,7.7,1.1};
	double *p;
	p=a;
	printf("%f\n",*a);//Bir dizi olmasayd� i�eri�in i�eri�ine ula�mak istedi�imiz i�in hata alacakt�k ama bu bir dizi oldu�u i�in bize 0.indisi basacaktt�r.
	printf("%f\n",a[0]);//0.indisi basar
	printf("%f\n",*p);//0.indisi basar.
	printf("%f\n",p[0]);//p[i] �eklindeki g�sterim bir pointer g�sterimidir ve bu 0.indisi basar
	printf("%f\n",p[1]);//1.indisi basar
	printf("%f\n",a[1]);//1.indisi basar
	
	
	
	
	
	
	
	
	
	
	return 0;
}
