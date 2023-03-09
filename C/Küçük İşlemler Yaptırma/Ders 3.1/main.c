#include <stdio.h>
#include <stdlib.h>


int main() {
	
	char ad[30];
	char soyad[30];
	char sehir[30];
	char okul[70];
	char bolum[50];
	char sinif[1];
	
	printf("Lutfen Adinizi Giriniz:");
	scanf("%s",ad);
	printf("Girmis Oldugunuz Ad: %s\n",ad);
	
	printf("Lutfen Soyadinizi Giriniz:");
	scanf("%s",soyad);
	printf("Girmis Oldugunuz Soyad: %s\n",soyad);
	
	printf("Lutfen Yasadiginiz Sehri Giriniz:");
	scanf("%s",sehir);
	printf("Girmis Oldugunuz Sehir: %s\n",sehir);
	
	printf("Lutfen Okudugunuz Okulu Giriniz:");
	scanf("%s",okul);
	printf("Girmis Oldugunuz Okul: %s\n",okul);
	
	printf("Lutfen Okudugunuz Bolumu Giriniz:");
	scanf("%s",bolum);
	printf("Girmis Oldugunuz Bolum Adi: %s\n",bolum);
	
	printf("Lutfen Kacinci Siniftaysaniz Onu Giriniz:");
	scanf("&s",sinif);
	printf("Girmis Oldugunuz Sinif: %s",sinif);
	
	
	
	
	
	
	
	
	
	
	return 0;
}
