#include <stdio.h>

int main()
{
    int sayi,gecici,array[32],i=0;
    printf("Lutfen bit bakimindan alinacak sayiyi giriniz:");
    scanf("%d",&sayi);
    gecici=sayi;
    while(gecici!=0){
        if(gecici%2==0){
            array[i]=0;
        }
        else{
            array[i]=1;
        }
        i++;
        gecici/=2;
    }
    printf("Bit düzeyinde alinmasi icin girilen %d sayisinin bit duzeyindeki hali",sayi);
    while(i>0){
        printf("%d",array[i]);
        i--;
    }

    return 0;
}

