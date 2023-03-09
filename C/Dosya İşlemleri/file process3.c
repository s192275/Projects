#include <stdio.h>
int main(){
	char text[300];
	FILE *fptr;
	fptr=fopen("cdeneme.txt","a");//Dosyayý bozmadan son kýsmýna ekleme yapar olan dosyalarda çalýþýr
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
//fputs fonksiyonu dosyanýn içine bir string yazýlmasýný saðlar
