#include <stdio.h>
#include <stdlib.h>


int main() {
	
	
	int sayi1,sayi2,toplam,fark,carpim,bol;
	sayi1=50,sayi2=10,toplam=sayi1+sayi2,fark=sayi1-sayi2,carpim=sayi1*sayi2,bol=sayi1/sayi2;
	printf("Toplam: %d\n",toplam);
	printf("Fark: %d\n",fark);
	printf("Carpim: %d\n",carpim);
	printf("Bolum: %d\n",bol);
	
	int kenar1,kenar2,alan,cevre;
	kenar1=20,kenar2=30,cevre=(kenar1+kenar2)*2,alan=kenar1*kenar2;
	printf("Alan: %d\n",alan);
	printf("Cevre: %d\n",cevre);
	
	int sinav1,sinav2,sinav3,ort;
	sinav1=70,sinav2=45,sinav3=31,ort=(sinav1+sinav2+sinav3)/3;
	printf("Ortalamaniz:%d\n",ort);
	
	int bagaj,el,fiyat;
	bagaj=45,el=15;
	fiyat=(bagaj-15)*5+(el-8)*5+150;
	printf("Ucretiniz %d",fiyat);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
