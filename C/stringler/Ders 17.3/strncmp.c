//NULL='\0'
#include <string.h>
#include <stdio.h>
//sprintf ne iþe yarar
int main()
{
    char dizgi1[12]="Dunya ";
    char dizgi2[10]="Salam";
    printf("%s",strcat(dizgi1,dizgi2));
    char dizgi3[20]="Balik";
    char dizgi4[20]="Balci";
    int b;
    int a;
    a=strcmp(dizgi3,dizgi4);
    if(a==0)
    printf("\nDiziler aynidir.\n");
    else
    printf("\nDiziler farklidir.\n");
    b=strncmp(dizgi3,dizgi4,3);
    if(b==0)
    printf("Dizilerin ilk 3 harfi aynidir.\n");
    else
    printf("Dizilerin ilk 3 harfi farklidir.\n");
    return 0;
}

