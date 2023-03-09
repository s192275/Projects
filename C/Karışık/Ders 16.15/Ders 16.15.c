#include <stdio.h>
#include <math.h>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
int main()
{
    int dizi[10];
    int *ptr=&dizi[0];
    int *ptr2=&dizi;
    int i;
    for(i=0;i<10;i++){
        *(ptr+i)=rand()%100;
        printf("Dizinin %d.indexi %d ve adresi %p dir.\n",i,dizi[i],&dizi[i]);
    }
    int *p=dizi;
    printf("%d\n",(*p++));//dizinin 0.elemanýný önce yazdýr sonra deðerini arttýr(1.eleman oldu)
    printf("%d\n",*(p++));//Önce yazdýr sonra pointerýn adresini arttýr.
    printf("%d\n",*(++p));//Önce adresi arttýr sonra içeriðini al
    printf("%d\n",++(*p));//pointer + 1

    return 0;
}
//Online c compilerda çalýþýyor.
