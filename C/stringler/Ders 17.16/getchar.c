#include <ctype.h>
#include <stdio.h>

int main()
{
    int dongu=0;
    char a[100];
    char c;
    c=getchar();
    while(getchar()!='\n'){
        dongu++;
    }
    printf("Girilen cumlede karakter sayisi %d dir.",dongu);
    

    return 0;
}

