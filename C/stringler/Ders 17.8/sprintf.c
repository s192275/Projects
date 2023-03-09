//NULL='\0'
#include <string.h>
#include <stdio.h>
//sprintf ne işe yarar
int main()
{
   float benzin=47.0;
   float km=300;
   char benzin_km[80];
   sprintf(benzin_km,"km de %5.3f benzin yakiyor",km/benzin);//Bu komutu stringin içine bilgi atıp yazdırdığımızda o bilgiyi kulllanmak için yaptık.
   printf("%s",benzin_km);                                   //Buradaki stringimiz benzin_km olduğu için verileri onun içine attık 
    return 0;
}

