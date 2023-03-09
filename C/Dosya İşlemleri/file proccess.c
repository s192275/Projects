#include <stdio.h>
int main(){
	FILE *ptr;
	ptr=fopen("cdeneme.txt","r");
	if(ptr==NULL){
		printf("Dosya olusturulamadi.");
	}
	else{
		printf("Dosya olusturuldu.");
	}
	fclose(ptr);
	
	return 0;
}
