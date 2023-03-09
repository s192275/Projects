//NULL='\0'
#include <string.h>
#include <stdio.h>
//sprintf ne iþe yarar
int main()
{
    char d1[15]="Iyi gunler";
    char d2[15];
    strcpy(d2,d1);
    printf("%s %ld karakter icerir.",d2,strlen(d2));
  

    return 0;
}

