
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
        eleman=dizi[i]; //Instertion sortun gere�i 1.elemandan ba�latmak gerekti o y�zden b�yle bir d�ng� kuruldu.
       j=i-1;//j say�s� i nin solundaki say� oldu�u i�in bu i�lemi uygulad�k.
       while(eleman<dizi[j] && j>=0){ 
           dizi[j+1]=dizi[j];
           j--; //Gerisindekilerin say�s�n� artt�r�r.
       }
       dizi[j+1]=eleman;
    }
    for(i=0;i<6;i++){
        printf("%d\t",dizi[i]);
    }

    return 0;
}
