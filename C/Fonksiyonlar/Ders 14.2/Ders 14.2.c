#include <stdio.h>
int fact(int);
int main()
{
    int sayi;
    printf("Lutfen faktoriyeli alinacak sayiyi giriniz:");
    scanf("%d",&sayi);
    printf("Sonuc:%d",fact(sayi));

    return 0;
}
int fact(int sayi){
    int factorial=1,i;
    for(i=1;i<=sayi;i++){
        factorial*=i;
    }
    if(sayi==0)
    return 1;
    if(sayi!=0)
    return (sayi*fact(sayi-1));
}
