#include <stdio.h>
#include <string.h>
int main()
{
   int uzunluk=0,i;
   char metin[1000];
   printf("Lutfen kopyalanacak ana  metni giriniz:");
   fgets(metin,1000,stdin);
   for(i=0;i<1000;i++){
       if(metin[i]!='\0'){
           uzunluk++;
       }
   }
   char metin2[uzunluk];
   for(i=0;i<uzunluk;i++){
       metin2[i]=metin[i];
   }
   printf("Birinci metin %s ikinci metin %s ve iki metinin de yazilislari aynidir.",metin,metin2);
    return 0;
}
