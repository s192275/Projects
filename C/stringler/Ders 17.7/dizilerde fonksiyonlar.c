#include <math.h>
int dizinin_toplami(int dizi[],size_t boyut);
void diziyi_yazdir(int dizi[],size_t boyut);
void diziyi_degistir(int dizi[],size_t boyut);
int main()
{
    int dizi[10],i,boyut=10;
    printf("Lutfen dizi icin sayi girisi yapiniz:\n");
    for(i=0;i<10;i++){
        scanf("%d",&dizi[i]);
    }
    diziyi_yazdir(dizi,boyut);
    printf("Dizinin toplami: %d",dizinin_toplami(dizi,boyut));
    printf("\nDizinin teklik ciftlik durumuna gore 1 ve 0 la degismis hali:\n");
    diziyi_degistir(dizi,boyut);
    return 0;
}
int dizinin_toplami(int dizi[],size_t boyut){
    int i,toplam=0;
    for(i=0;i<boyut;i++){
        toplam+=dizi[i];
    }
    printf("\nGirilen dizideki elemanlarin toplami %d dir.",toplam);
}
void diziyi_yazdir(int dizi[],size_t boyut){
    int i;
    for(i=0;i<boyut;i++){
        printf("%d\t",dizi[i]);
    }
}
void diziyi_degistir(int dizi[],size_t boyut){
    int i;
    for(i=0;i<boyut;i++){
        if(dizi[i]%2==0)
        printf("1\t");
        else
        printf("0\t");
    }
}
