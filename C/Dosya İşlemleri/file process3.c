#include <stdio.h>
int main(){
	char text[300];
	FILE *fptr;
	fptr=fopen("cdeneme.txt","a");//Dosyay� bozmadan son k�sm�na ekleme yapar olan dosyalarda �al���r
	if(fptr=NULL){
		printf("Dosya olusmadi.");
	}
	else{
		printf("Bir sey yaziniz:\n");
		fgets(text,300,stdin);
		fputs(text,fptr);
		printf("Dosyaya yazildi.");
	}
	fclose(fptr);
	
	
	
	
	
	
	return 0;
}
//fputs fonksiyonu dosyan�n i�ine bir string yaz�lmas�n� sa�lar
