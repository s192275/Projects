#include <stdio.h>
#include <string.h>

void karakter_say(char *karaktergirisi,int *karaktersayisi){
    char *ptr=karaktergirisi;   
    while(*ptr!='\0'){
        *karaktersayisi+=1;
        ptr++;
    }
}

int main(){
    char karaktergirisi[1000];
    int karaktersayisi=0;
    printf("Lutfen girmek istediginiz metni giriniz:");
    gets(karaktergirisi);
    karakter_say(karaktergirisi,&karaktersayisi);
    printf("Girdiginiz metinde %d adet karakter bulunmaktadir.",karaktersayisi);
}
