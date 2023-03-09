#include <stdio.h>
typedef struct{
    int yas;
    char isim[40];
}insan;
int main()
{
    insan ali;
    insan *veli;//Dinamik bellekte tutulmasini istiyorsak veli=(insan*)(malloc(sizeof(insan) yapmamız yeterli olacaktır.
    veli->yas=40;
    ali.yas=31;
    printf(" Ali nin yasi %d Veli nin yasi %d dir.",ali.yas,veli->yas);

    return 0;
}

