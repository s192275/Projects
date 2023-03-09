#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main()
{
    srand(time(NULL));
    int i;
    int elemansayisi;
    int *dizi;
    printf("Lutfen kac adet eleman gerektigini giriniz:");
    scanf("%d",&elemansayisi);
    dizi=(int*)malloc(sizeof(int)*elemansayisi);
    int *ptr;
    printf("Normal hali:\n");
    for(ptr=dizi;ptr<dizi+elemansayisi;ptr++){
        (*ptr)=rand()%100;
        printf("%d\t",*ptr);
    }
    printf("\nTers hali:\n");
    for(ptr=dizi+elemansayisi-1;ptr>=dizi;ptr--){
        printf("%d\t",*ptr);
    }
    return 0;
}

