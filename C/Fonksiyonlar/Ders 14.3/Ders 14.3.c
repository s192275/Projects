#include <stdio.h>
int fib(int);
int main()
{
    int sayi;
    printf("Fibonacci dizisini nereye kadar devam ettirmek istiyorsaniz giriniz:");
    scanf("%d",&sayi);
    printf("Diziler sirasiyla sunlardir:%d\t",fib(sayi));

    return 0;
}
int fib(int sayi){
    if(sayi==0 || sayi==1)
    return 1;
    else
    return fib(sayi-1)+fib(sayi-2);
}
