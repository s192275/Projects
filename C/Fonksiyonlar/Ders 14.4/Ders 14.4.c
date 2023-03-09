#include <stdio.h>
int sayiyazdir(int);
int main()
{
    int a;
    printf("Lutfen kaca kadar sayi yazdirmak istiyorsaniz giriniz:");
    scanf("%d",&a);
    printf("%d",sayiyazdir(a));
    return 0;
}
int sayiyazdir(int a){
    if(a==0)
    return a;
    printf("%d\t",a);
    sayiyazdir(a-1);
}
