//NULL='\0'
#include <string.h>
#include <stdio.h>
//sprintf ne i�e yarar
int main()
{
   float benzin=47.0;
   float km=300;
   char benzin_km[80];
   sprintf(benzin_km,"km de %5.3f benzin yakiyor",km/benzin);//Bu komutu stringin i�ine bilgi at�p yazd�rd���m�zda o bilgiyi kulllanmak i�in yapt�k.
   printf("%s",benzin_km);                                   //Buradaki stringimiz benzin_km oldu�u i�in verileri onun i�ine att�k 
    return 0;
}

