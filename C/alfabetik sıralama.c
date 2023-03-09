#include <string.h>
#include <stdio.h>
int main(){
    int karaktersayisi=0,karaktersayisi2=0,i=0,esitlik=1;
    char isim[30],isim2[30];
    puts("Lutfen birinci adi giriniz:");
    gets(isim);
    puts("Lutfen ikinci adi giriniz:");
    gets(isim2);
    while(isim[karaktersayisi]!='\0'){
        karaktersayisi++;
    }
    while(isim2[karaktersayisi2]!='\0'){
        karaktersayisi2++;
    }
    while(isim[i]!='\0' && isim2[i]!='\0'){
        if(isim[i]>isim2[i]){
            printf("Birinci metin ikinci metinden alfabetik olarak daha sonra gelir.");
            esitlik=0;
            break;
        }
        else if(isim2[i]>isim[i]){
            printf("Ikinci metin birinci metinden alfabetik olarak daha sonra gelir.");
            esitlik=0;
            break;
        }
        i++;
    }
    while(esitlik){
    if(isim[i]==isim2[i]){
         printf("Iki metin de birbirine esittir.");
         break;
    }
    if(isim[i]>isim2[i]){
            printf("Birinci metin ikinci metinden alfabetik olarak daha sonra gelir.");
            esitlik=0;
            break;
    }
        else if(isim2[i]>isim[i]){
            printf("Ikinci metin birinci metinden alfabetik olarak daha sonra gelir.");
            esitlik=0;
            break;
           }
           i++;
}
    return 0;
}
