#include <stdlib.h>
#include <stdio.h>

int main()
{
    int elemansayisi;
    printf("Lutfen eleman sayisini giriniz:");
    scanf("%d",&elemansayisi);
    int *dizi;
    dizi=(int*)calloc(elemansayisi,sizeof(int));
    int *ptr;
    for(ptr=dizi;ptr<dizi+elemansayisi;ptr++){
        *ptr=10;
        printf("%d ",*ptr);
    }
    printf("Yeni eleman sayisini kac yapmak istersiniz:");
    scanf("%d",&elemansayisi);
    dizi=realloc(dizi,elemansayisi);
    for(ptr=dizi;ptr<dizi+elemansayisi;ptr++){
        *ptr=5;
        printf("%d ",*ptr);
    }
    return 0;
}

