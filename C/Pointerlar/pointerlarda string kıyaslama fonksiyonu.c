#include <stdio.h>
#include <string.h>

void string_kiyasla(char *karakterdizisi,char *karakterdizisi2,int *karaktersayisi,int *karaktersayisi2){
    int benzerlik=0;
    char *ptr=karakterdizisi;
    char *ptr2=karakterdizisi2;
  
    while(*ptr!='\0' && *ptr2!='\0'){
        if(*ptr==*ptr2 && strlen(ptr)==strlen(ptr2)){
           benzerlik=1;
           break;
        }
        else{
           benzerlik=0;
            break;
        }
    ptr++;
    ptr2++;
    }
    if(benzerlik==1){
        printf("Girilen iki metin de birbirinin aynisidir.");
    }
    else{
        printf("Girilen metinler birbirinden farklidir.");
    }
    
}

int main(){
    char karakterdizisi[1000], karakterdizisi2[1000];
    int karaktersayisi=0,karaktersayisi2=0;
    puts("Lutfen birinci string icin giris yapiniz:");
    gets(karakterdizisi);
    puts("Lutfen ikinci string icin giris yapiniz:");
    gets(karakterdizisi2);
    string_kiyasla(karakterdizisi,karakterdizisi2,&karaktersayisi,&karaktersayisi2);
}
