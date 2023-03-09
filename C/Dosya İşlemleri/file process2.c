#include <stdio.h>
#include <string.h>
int main(){
	char yazilacak[39]="Serhat KILIC";
	int uzunluk=strlen(yazilacak);
	int i;
	FILE *fptr;
	fptr=fopen("cdeneme.txt","w");
	if(fptr=NULL){
		printf("Boyle bir dosya yok ya da dosya olusurulamadi.");
	}
	else{
		for(i=0;i<uzunluk;i++){
			fputc(yazilacak[i],fptr);
			printf("Yazilan karakter %c\n",yazilacak[i]);
		}
		printf("Dosya basariyla yazdirildi.");
	}
	fclose(fptr);
	
	
	
	return 0;
}
