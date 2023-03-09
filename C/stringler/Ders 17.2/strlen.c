#include <string.h>
#include <stdio.h>

int main()
{
    char metin[40];
    printf("Lutfen metin girisini yapiniz:");
    gets(metin);
    int b=strlen(metin);
    printf("Girilen metnin uzunlugu :%d",b);

    return 0;
}

