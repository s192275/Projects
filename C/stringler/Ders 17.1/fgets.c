#include <stdio.h>

int main()
{
    char metin[1000];
    fgets(metin,30,stdin);//�lk k�s�mda stringin ad� ikinci k�s�mda ka� karakter girilece�i ���nc� k�s�mda verinin klavyeden al�naca�� yaz�yor.
    printf("Girilen string %s ",metin);

    return 0;
}

