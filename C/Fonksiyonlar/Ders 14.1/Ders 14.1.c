#include <stdio.h>
   int combination(int sayi,int sayi2);
   int factorial(int sayi);

int main()
{   
    int sayi,sayi2;
    printf("Luten kombinasyonunu ogrenmek istediginiz sayiyi giriniz:");
    scanf("%d",&sayi);
    printf("Lutfen kombinasyonun alttaki kismini giriniz:");
    scanf("%d",&sayi2);
    printf("Girilen sayilarin kombinasyonu:%d dir.",combination(sayi,sayi2));
    return 0;
}
int combination(int sayi1,int sayi2){
    return factorial(sayi1)/(factorial(sayi2)*factorial(sayi1-sayi2));
}
int factorial(int x){
    int fact=1,i;
    for(i=1;i<=x;i++){
        fact*=i;
    }
    return fact;
}

