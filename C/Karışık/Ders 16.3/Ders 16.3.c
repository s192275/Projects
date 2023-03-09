#include <stdio.h>
int main(){
	double a[]={3.9,2.4,7.7,1.1};
	double *p;
	p=a;
	printf("%f\n",*a);//Bir dizi olmasaydý içeriðin içeriðine ulaþmak istediðimiz için hata alacaktýk ama bu bir dizi olduðu için bize 0.indisi basacakttýr.
	printf("%f\n",a[0]);//0.indisi basar
	printf("%f\n",*p);//0.indisi basar.
	printf("%f\n",p[0]);//p[i] þeklindeki gösterim bir pointer gösterimidir ve bu 0.indisi basar
	printf("%f\n",p[1]);//1.indisi basar
	printf("%f\n",a[1]);//1.indisi basar
	
	
	
	
	
	
	
	
	
	
	return 0;
}
