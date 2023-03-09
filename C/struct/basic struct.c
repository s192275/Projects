#include <stdio.h>
struct{
    int yil;
    char *isim;
    int sure;
}film1;

int main()
{
    struct film1;
    film1.yil=1999;
    film1.isim="Matrix";
    film1.sure=142;
    printf("%d\n",film1.yil);
    printf("%s\n",film1.isim);
    printf("%d\n",film1.sure);
    printf("%lu\n",sizeof(film1));
    return 0;
}

