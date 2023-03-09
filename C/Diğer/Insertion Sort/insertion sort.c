
#include <time.h>
#include <stdio.h>
#include <stdlib.h>
int main()
{
    int dizi[6],eleman,i,j;
    printf("Dizinin ilk hali:\n");
    for(i=0;i<6;i++){
        dizi[i]=rand()%10;
        printf("%d\t",dizi[i]);
    }
    printf("\nDizinin insertion sorttan sonraki hali:\n");
    for(i=1;i<6;i++){
        eleman=dizi[i]; //Instertion sortun gereði 1.elemandan baþlatmak gerekti o yüzden böyle bir döngü kuruldu.
       j=i-1;//j sayýsý i nin solundaki sayý olduðu için bu iþlemi uyguladýk.
       while(eleman<dizi[j] && j>=0){ 
           dizi[j+1]=dizi[j];
           j--; //Gerisindekilerin sayýsýný arttýrýr.
       }
       dizi[j+1]=eleman;
    }
    for(i=0;i<6;i++){
        printf("%d\t",dizi[i]);
    }

    return 0;
}
