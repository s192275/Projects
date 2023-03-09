#include <stdio.h>
#include <stdlib.h>
int main()
{
    int *xp;//xp adında bir adet pointer tanımlandı.
    xp=(int*)malloc(sizeof(int)*5); //Dinamik bellekten 5 elemanlık bir integer dizisi tanımlandı ve void olan fonksiyon int ile tür dönüşümü yapılarak int e döndü
       //(int*) ile değerin bir pointer olduğu ve integera dönüşüp xp nin adresine atandı
    *xp=126;
    printf("Tahsis edilen bellegin baslangic adresi:%p dir.",xp);
    printf("\nTahsis edilen bellegin baslangic degeri %d dir.",*xp);
    free(xp);

    return 0;
}

