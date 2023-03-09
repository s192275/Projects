#include <stdlib.h>
#include <stdio.h>

int main()

{
    int *i;
    float *f;
    
    i=(int*)malloc(sizeof(int));//Dinamik bir dizi oluþturduk.
    f=(float*)malloc(sizeof(float));
    printf("Lutfen bir deger giriniz:");
    scanf("%d",i);
    printf("Lutfen bir deger giriniz:");
    scanf("%f",f);
    
    printf("Girilen degerler: %d          %f",*i,*f);
    free(i);
    free(f);

    return 0;
}

