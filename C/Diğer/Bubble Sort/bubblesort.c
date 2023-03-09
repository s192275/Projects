#include <stdio.h>


void diziyi_bas(int dizi[],int size){
     int i,j,temp;
     printf("\nDizinin degismis hali:\n");
     for(i=0;i<size;i++){
         for(j=1;j<size-i;j++){
             if(dizi[j-1]>dizi[j]){
                temp=dizi[j];
                dizi[j]=dizi[j-1];
                dizi[j-1]=temp;
             }
         }
     }
 }

int main(){
    int size;
    int i;
    int dizi[50];
    printf("Kac elemanli");
    scanf("%d",&size);
    for(i=0;i<size;i++){
    	scanf("%d",&dizi[i]);
	}
    diziyi_bas(dizi,size);
    for(i=0;i<size;i++){
    	printf("%d ",dizi[i]);
	}
    return 0;
}
