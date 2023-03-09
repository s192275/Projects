
#include <stdio.h>
typedef struct{
    int yas;
    char ad[30];
    char cinsiyet;
}insan;

int main()
{
    insan ali;
    ali.yas=30;
    printf("Ali'nin yasi:%d",ali.yas);

    return 0;
}

