#include <stdio.h>

int main()
{
    char metin[1000];
    fgets(metin,30,stdin);//Ýlk kýsýmda stringin adý ikinci kýsýmda kaç karakter girileceði üçüncü kýsýmda verinin klavyeden alýnacaðý yazýyor.
    printf("Girilen string %s ",metin);

    return 0;
}

