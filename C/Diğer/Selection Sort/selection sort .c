#include <stdio.h>

void selection_sort(int dizi[]){
    int i,j,temp,key;
    for(i=0;i<10;i++){
        key=i;
        for(j=i+1;j<10;j++){
            if(dizi[key]>dizi[j]){
            key=j;
            }
        }
        temp=dizi[key];
        dizi[key]=dizi[i];
        dizi[i]=temp;
    }
}

int main(){
    int dizi[10],i;
    printf("Lutfen diziyi giriniz:");
    for(i=0;i<10;i++){
        scanf("%d",&dizi[i]);
    }
    printf("Dizinin ilk hali:\n");
    for(i=0;i<10;i++){
        printf("%d ",dizi[i]);
    }
    selection_sort(dizi);
    printf("\nDizinin son hali:\n");
    for(i=0;i<10;i++){
       printf("%d ",dizi[i]);
    }
    return 0;
}
