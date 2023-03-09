#include <stdio.h>

int main()
{
    char cumle[]="Merhaba Dunya";
    int say=0;
    int i;
    for(i=0;cumle[i]!='\0';i++){
        say++;
    }
    printf("%s %d karakter icerir.",cumle,say);

    return 0;
}

