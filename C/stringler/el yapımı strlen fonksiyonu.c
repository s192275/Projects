#include <stdio.h>
int main()
{
   int uzunluk=0,i;
   char metin[1000];
   printf("Lutfen karakter sayisi hesaplanacak metni giriniz:");
   scanf("%s",metin);
   for(i=0;i<1000;i++){
       if(metin[i]!='\0'){
           uzunluk++;
       }
   }
   printf("Karakter sayisi hesaplanmasi icin girilen metin %s olup karakter sayisi %d dir.",metin,uzunluk);
    return 0;
}
