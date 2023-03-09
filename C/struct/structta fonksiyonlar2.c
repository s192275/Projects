#include <stdio.h>
typedef enum{
    bay,
    bayan
}cinsiyet;
typedef struct{
    int yas;
    int isim[40];
    cinsiyet c;
}insan;
int emeklimi(insan *birey){
    if(birey->c == bay && birey->yas>55)
    return 1;
    if(birey->c == bayan && birey->yas>50)
    return 1;
    return 0;
}

int main()
{
    insan ali;
    insan ayse;
    ali.c=bay;
    ayse.c=bayan;
    ali.yas=60;
    ayse.yas=45;
    printf("Ali emekli mi?:%d\n",emeklimi(&ali));
    printf("Ayse emekli mi?:%d\n",emeklimi(&ayse));

    return 0;
}

