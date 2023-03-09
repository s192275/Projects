#include <stdio.h>
#include <stdlib.h>

void diziyi_sirala(char *dizi,int elemansayisi){
    int *ptr=dizi;
    int *ptr2,*enkucuk;
    for(ptr=dizi;ptr<dizi+elemansayisi;ptr++){
        enkucuk=dizi+elemansayisi-1;
        for(ptr2=ptr;ptr2<dizi+elemansayisi;ptr2++){
            if(*ptr2<*enkucuk){
                ptr2=enkucuk;
            }
        }
        int gecici=*enkucuk;
        *enkucuk=*ptr;
        *ptr=gecici;
        printf("%d ",*ptr);
    }
    

int main(){

    int elemansayisi,i;
    printf("Lutfen kac elemanli dizi olusturmak istiyorsaniz giriniz:");
    scanf("%d",&elemansayisi);
    int *dizi=(int*)malloc(sizeof(int)*elemansayisi);
    printf("Lutfen dizi elemanlarini tek tek giriniz:\n");
    for(i=0;i<elemansayisi;i++){
        scanf("%d",&dizi[i]);
    }
    printf("Girilen dizi elemanlari:\n");
    for(i=0;i<elemansayisi;i++){
        printf("%d ",dizi[i]);
    }
    printf("Dizi elemanlarini siraladiktan sonra dizinin yeni hali:\n");
    diziyi_sirala(dizi,elemansayisi);
}
