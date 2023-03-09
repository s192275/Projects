#include <stdio.h>
#include <time.h>
#include <stdlib.h>
int main(){
    int matris1[5][5];
    int i,j;
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            printf("%d.satir %d.sutun icin veri girisi yapiniz:",i+1,j+1);
            scanf("%d",&matris1[i][j]);
        }
    }
    for(i=0;i<5;i++){
        for(j=0;j<5;j++){
            printf("%d\t",matris1[i][j]);
        }
        printf("\n");
    }
   for(i=0;i<5;i++){
       for(j=0;j<5;j++){
           matris1[i][j]=matris1[j][i];
       }
   }
   printf("\n\n\n");
   for(i=0;i<5;i++){
       for(j=0;j<5;j++){
           printf("%d\t",matris1[i][j]);
       }
       printf("\n");
   }
    return 0;
}
