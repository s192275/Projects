#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main()
{
    char *cp1="Ilk karakter dizisi";//pointerlar dizi sayýlýr.
    char *cp2,*cp3;
    char cdizi[30];
    cp2="Ikinci karakter dizisi";
    cp3=(char*)malloc(50);
    strcpy(cp3,"Ucuncu karakter dizisi");
    strcpy(cdizi,"Dorduncu karakter dizisi");
    printf("%s\n",cp1);
    printf("%s\n",cp2);
    printf("%s\n",cp3);
    printf("%s\n",cdizi);
    free(cp3);
    return 0;
}

