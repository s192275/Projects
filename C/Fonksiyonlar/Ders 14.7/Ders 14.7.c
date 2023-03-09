#include <stdio.h>
int basamak (int);
int main()
{
    int sayi;
    printf("Lutfen basamak bakimindan tespit edilecek sayiyi giriniz:");
    scanf("%d",&sayi);
    printf("Basamak bakimindan tespit edilmesi icin girilen sayinin basamak sayisi %d dir.",basamak(sayi));
    return 0;
}
int basamak (int sayi){
    int sayac=0;
    if(sayi<10){
    	sayac+=1;
    	return sayac;
   }
    else
    sayi/=10;
    sayac+=1;
    return sayac+basamak(sayi);
}
