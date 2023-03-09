#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main(){
    char *cp; //cp adýnda bir adet pointer tanýmladýk
    cp=(char*)malloc(40); //malloc komutuyla dinamik bellek alaný oluþturduk ve onu cp nin ilk adresinden olmak üzere atamaya baþladýk
    if(!cp){ 
        printf("Bellek tahsis hatasi:");
        exit(1);
    }
    strcpy(cp,"Bilgisayar");//cp nin adresine bilgisayar yazdýrdýk
    printf("%s",cp);
    free(cp);
    return 0;
}
