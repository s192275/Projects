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
		if(kDizi[i]=='a' || kDizi[i]=='e' || kDizi[i]=='ý' || kDizi[i]=='i' || kDizi[i]=='o' || kDizi[i]=='ö' || kDizi[i]=='u' || kDizi[i]=='ü' || kDizi[i]=='A' || kDizi[i]=='E' || kDizi[i]=='I' || kDizi[i]=='Ý' || kDizi[i]=='O' || kDizi[i]=='Ö' || kDizi[i]=='U' || kDizi[i]=='Ü')
		sesli++;
		else if((kDizi[i]>='a' && kDizi[i]<='z')||(kDizi[i]>='A' && kDizi[i]<='Z'))//A yý da kullanabiliriz burada çünkü üstteki ifin olmadýðý durumlarda if else geçerlidir.
		sessiz++;
	}
	printf("Sesli harf sayisi %d\n",sesli);
	printf("Sessiz harf sayisi %d\n",sessiz);
	return 0;
}
