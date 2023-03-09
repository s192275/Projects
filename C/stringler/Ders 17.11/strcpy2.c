#include <stdio.h>
#include <string.h>
int main(){
    char isim[30]="Onur Ahmet Uslu";
    char soyad[10];
    char ilkad[10];
    char ortaad[10];
    strncpy(ilkad,isim,4);
    ilkad[4]='\0';
    strncpy(ortaad,&isim[5],4);
    ortaad[5]='\0';
    strncpy(soyad,&isim[11],4);
    printf("Ad:%s\n",ilkad);
    printf("Orta ad:%s\n",ortaad);
    printf("Soyad:%s\n",soyad);
}
