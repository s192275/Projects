#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main(){
    char *cp; //cp ad�nda bir adet pointer tan�mlad�k
    cp=(char*)malloc(40); //malloc komutuyla dinamik bellek alan� olu�turduk ve onu cp nin ilk adresinden olmak �zere atamaya ba�lad�k
    if(!cp){ 
        printf("Bellek tahsis hatasi:");
        exit(1);
    }
    strcpy(cp,"Bilgisayar");//cp nin adresine bilgisayar yazd�rd�k
    printf("%s",cp);
    free(cp);
    return 0;
}
