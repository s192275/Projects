#include <string.h>
#include <stdio.h>

int main()
{
    int karaktersayisi=0,i=0;
   char kullanicigirisi[20],degisecek_harf,yeni_harf;
   puts("Lutfen girmek istediginiz metni giriniz:");
   gets(kullanicigirisi);
   puts("Hangi harfi degistirmek istiyorsaniz giriniz:");
   scanf(" %c",&degisecek_harf);
   puts("Hangi harf ile degistirmek istiyorsaniz giriniz:");
   scanf(" %c",&yeni_harf);
   while(kullanicigirisi[i]!='\0'){
       if(kullanicigirisi[i]==degisecek_harf){
           karaktersayisi++;
           kullanicigirisi[i]=yeni_harf;
       }
       i++;
   }
   puts(kullanicigirisi);
   printf("%d adet harf degistirildi.",karaktersayisi);
    return 0;
}

