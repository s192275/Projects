#include <stdio.h>
#include <time.h>
#include <stdlib.h>
int main(){
    int matris[5][5],i,j,satir_toplam=0,sutun_toplam=0;
    srand(time(NULL));
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            matris[i][j]=rand()%10;
        }
    }
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            printf("%d\t",matris[i][j]);
        }
        printf("\n");
    }
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            satir_toplam+=matris[i][j];//i yi 0 dan ba�latt�k j 0 1 2 3 4 oldu sonra i 1 oldu ve ayn� i�lemler tekrar etti hal b�yle olunca sat�rlar� toplay�p alt sat�ra ge�ti
            sutun_toplam+=matris[j][i];//j yi 0 dan ba�latt�k i 0 1 2 3 4 oldu sonra j 1 oldu ve ayn� i�lemler tekrar etti hal b�yle olunca sutunlar� toplay�p yan sutuna ge�tik
        }
         printf("%d.satirin toplami:%d\n",i+1,satir_toplam);
         printf("%d.sutunun toplami:%d\n\n",i+1,sutun_toplam);
    }
    printf("Satirlar toplami:%d\n",satir_toplam);
    printf("Sutunlar toplami:%d\n",sutun_toplam);
    
}
