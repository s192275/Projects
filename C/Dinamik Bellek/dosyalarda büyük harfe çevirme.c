#include <stdio.h>
#include <ctype.h>
#include <string.h>

void buyukharfe_cevir(FILE *dosya1,FILE *dosya2){
int ch;
while(1){
ch=fgetc(dosya1);
    if(ch==EOF){
        break;
    }
   fputc(toupper(ch),dosya2);
}
}


int main(){
    FILE *dosya1=fopen("deneme.txt","r");
    FILE *dosya2=fopen("deneme2.txt","w");
    if(dosya1!=NULL){
        buyukharfe_cevir(dosya1,dosya2);
        fclose(dosya1);
        fclose(dosya2);
    }
    return 0;
}
