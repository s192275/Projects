#include <stdio.h>
#include <string.h>
int main(){
	char kDizi[100];
	int i,uzunluk,sesli,sessiz;
	char dizgi2[13]="basit";
	printf("Metni giriniz:");
	fgets(kDizi,sizeof kDizi,stdin);
	sesli=0;
	sessiz=0;
	uzunluk=strlen(kDizi);
	for(i=0;i<uzunluk;i++){
		if(kDizi[i]=='a' || kDizi[i]=='e' || kDizi[i]=='�' || kDizi[i]=='i' || kDizi[i]=='o' || kDizi[i]=='�' || kDizi[i]=='u' || kDizi[i]=='�' || kDizi[i]=='A' || kDizi[i]=='E' || kDizi[i]=='I' || kDizi[i]=='�' || kDizi[i]=='O' || kDizi[i]=='�' || kDizi[i]=='U' || kDizi[i]=='�')
		sesli++;
		else if((kDizi[i]>='a' && kDizi[i]<='z')||(kDizi[i]>='A' && kDizi[i]<='Z'))//A y� da kullanabiliriz burada ��nk� �stteki ifin olmad��� durumlarda if else ge�erlidir.
		sessiz++;
	}
	printf("Sesli harf sayisi %d\n",sesli);
	printf("Sessiz harf sayisi %d\n",sessiz);
	return 0;
}
