#include <stdio.h>
int main(){
	char arr[300];
	FILE *fptr;
	fptr=fopen("C:\\Users\\s7522\\Desktop\\cdeneme.txt","w");
	if(fptr=NULL){
		printf("Dosya olusturulamadi.");
	}
	else{
		printf("Metin olusturuldu.");
		fgets(arr,300,stdin);
		fputs(arr,fptr);
	}
	fclose(fptr);
	
	return 0;
}
