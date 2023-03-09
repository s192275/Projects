#include <stdlib.h>
#include <stdio.h>
#define SAYI_KARSILASTIR(sayi1,sayi2) (sayi1)>(sayi2)?(sayi1):(sayi2)
int main()
{
    printf("Buyuk olan sayi %d dir.\n",SAYI_KARSILASTIR(20,1000));
    #ifdef SAYI_KARSILASTIR//ya da #if defined 
    printf("Sayi karsilastirma tanimlanmistir.");
    #else
    printf("Sayi karsilastirma tanimlanmamistir.");
    #endif
    #ifndef ABUZER
    printf("\nABUZER tanimlanmistir.");
    #else
    printf("\nABUZER tanimlanmamistir.");
    #endif

    return 0;
}
//else if için elif defined  olabilir.
//#undef icin de yazýlaný silebilir define için
