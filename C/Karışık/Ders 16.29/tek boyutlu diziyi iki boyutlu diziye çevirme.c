#include <stdio.h>
#include <time.h>
#include <stdlib.h>
int main(){
    int dizi[10],satir,sutun,i,j;
    srand(time(NULL));
    for(i=0;i<10;i++){
        dizi[i]=1+rand()%100;
        printf("%d\t",dizi[i]);
    }
    printf("\nLutfen satir sayisini seciniz:");
    scanf("%d",&satir);
    printf("Lutfen sutun sayisini seciniz:");
    scanf("%d",&sutun);
    int ikiboyutludizi[satir][sutun];
    printf("\nDizinin degistikten sonraki hali:\n");
    for(i=0;i<satir;i++){
        for(j=0;j<sutun;j++){
        	ikiboyutludizi[i][j]=dizi[sutun*i+j];//3 sutun icin i=0 ve j=0 ken dizi[0]=ikiboyutludizi[0][0] oluyor sonra j artt�k�a dizinin j.eleman�na e�it oluyor sonra bir sutun at�yor
            printf("%d\t",ikiboyutludizi[i][j]);
        }
        printf("\n");
    }
    
    return 0;
}
