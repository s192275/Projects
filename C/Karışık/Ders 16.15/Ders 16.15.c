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
    printf("%d\n",(*p++));//dizinin 0.eleman�n� �nce yazd�r sonra de�erini artt�r(1.eleman oldu)
    printf("%d\n",*(p++));//�nce yazd�r sonra pointer�n adresini artt�r.
    printf("%d\n",*(++p));//�nce adresi artt�r sonra i�eri�ini al
    printf("%d\n",++(*p));//pointer + 1

    return 0;
}
//Online c compilerda �al���yor.
