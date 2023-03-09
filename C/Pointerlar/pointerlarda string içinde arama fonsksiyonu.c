#include <stdio.h>
#include <string.h>
int gecme_Sayisi(char *karaktergirisi,char arananharf){
    int sayac=0;
    char *ptr=karaktergirisi;
    while(*ptr!='\0'){
        if(*ptr==arananharf){
          sayac+=1;
        }
    ptr++;
    }
    return sayac;
    
}
int main(){
    char arananharf;
    int bulunmasayisi=0;
    char karaktergirisi[1000];
    puts("Lutfen string girisi yapiniz:");
    gets(karaktergirisi);
    puts("Lutfen aranan karakteri giriniz:");
    scanf("%c",&arananharf);
    int sonuc=gecme_Sayisi(karaktergirisi,arananharf);
    printf("Aranan karakter string icinde %d adet bulundu.",sonuc);
    
}
