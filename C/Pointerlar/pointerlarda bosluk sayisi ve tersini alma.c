#include <stdio.h>
#include <string.h>

void bosluk_sayisi(char *kullanicigirisi,int *bosluksayisi){
        char *ptr=kullanicigirisi;
        while(*ptr!='\0'){
            if(*ptr==' '){
                *bosluksayisi+=1;
            }
            ptr+=1;
        }
   
}
void tersini_bas(char *kullanicigirisi){
    int elemansayisi=strlen(kullanicigirisi);
    char *ptr=kullanicigirisi+elemansayisi-1;
    while(ptr>=kullanicigirisi){
        printf("%c",*ptr);
        ptr--;
    }
}
int main(){
    int bosluksayisi=0;
    char kullanicigirisi[30];
    puts("Lutfen girmek istediginiz metni giriniz:");
    gets(kullanicigirisi);
    bosluk_sayisi(kullanicigirisi,&bosluksayisi);
    printf("Girdiginiz metinde bosluk sayisi %d olarak hesaplandi.",bosluksayisi);
    tersini_bas(kullanicigirisi);
    
    return 0;
}
