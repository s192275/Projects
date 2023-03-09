#include <stdio.h>
#include <stdlib.h>


int main() {
	
	
	float a,b,c;
	printf("Birinci Sayi:");
	scanf("%f",&a);
	printf("Ikinci sayi:");
	scanf("%f",&a);
	c=a/b;
	printf("Sonuc: %f\n",c);
	
	//Aylýk 2500 TL maaþ alýnan kiþinin maaþýna yüzde 12 zam yapýlýrsa yeni maaþý ne olur
	
	printf("Maas Zam Hesabi\n");
	float maas,yeni_maas;
	printf("Maasinizi girin: \n");
	scanf("%f",&maas);
	yeni_maas=maas*1.12;
	printf("Yeni maasiniz: %f\n",yeni_maas);
	
	  /* float yaricap,pi,cevre,alan;
	   pi=3.14;
	    printf("Yaricap degeri giriniz: \n");
	    scan("%f",&yaricap);
	    cevre=2*pi*yaricap;
	    alan=pi*yaricap*yaricap;
	    printf("Alan degeri: %f",alan);
	    printf("Cevre degeri: %f",cevre);*/
	    
	float turkce,matematik,sosyal,fen,taban,toplampuan;
	taban=100.160;
	printf("Turkce netiniz: ");
	scanf("%f",&turkce);
	printf("Matematik netiniz: ");
	scanf("%f",&matematik);
	printf("Sosyal Bilgiler netiniz: ");
	scanf("%f",&sosyal);
	printf("Fen netiniz: ");
	scanf("%f",&fen);
	toplampuan=turkce*1.999+matematik*3.998+sosyal*1+fen*2.999+taban;
	printf("YGS -1 Puan Turunde Sonucunuz: %f",toplampuan);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
