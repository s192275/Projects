#include <stdio.h>

int main()
{
    int dizi[10];
    int i;
    printf("Lutfen dizinin elemanlarini giriniz:\n");
    for(i=0;i<10;i++){
        printf("%d.satir icin eleman girisi yapiniz:",i+1);
        scanf("%d",&dizi[i]);
    }
    printf("Diziyi olusturan elementler sirasiyla:\n");
    for(i=0;i<10;i++){
        printf("%d\t",dizi[i]);
    }
    printf("\nDizinin tersi:\n");
    for(i=0;i<10;i++){
        printf("%d\t",dizi[9-i]);
    }

    return 0;
}

