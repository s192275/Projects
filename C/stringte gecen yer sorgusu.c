#include <stdio.h>
#include <string.h>
int main(){
    char kullanicigirisi[20];
    char kullanicigirisi2[20];
    int i=0,j=0,devamedilecek_index=0,sorgu;
    puts("Lutfen ilk stringi giriniz:");
    gets(kullanicigirisi);
    puts("Lutfen ikinci stringi giriniz:");
    gets(kullanicigirisi2);
    while(kullanicigirisi[i]!='\0'){
        j=0;
        sorgu=1;
        i=devamedilecek_index;
        while(kullanicigirisi2[j]!='\0'){
            if(kullanicigirisi[i]!=kullanicigirisi2[j]){
                sorgu=0;
                break;
            }
            i++;
            j++;
            if(sorgu){
                printf("Girdiginiz ikinci stringin birincinin icinde bulundugunu tespit ettik.");
                break;
            }
        }
        devamedilecek_index++;
    }
    
    
    return 0;
}
