#include <stdlib.h>
#include <stdio.h>
// Uygulama deðeri ne kadar çok artarsa teorik deðere o kadar çok yaklaþýr.

int main()
{
    int frekans1=0,frekans2=0,frekans3=0,frekans4=0,frekans5=0,frekans6=0,atis,yuz;
    for(atis=1;atis<=6000;atis++){
        yuz=1+rand()%6;
        switch (yuz){
        case 1:
        frekans1++;
        break;
        case 2:
        frekans2++;
        break;
        case 3:
        frekans3++;
        break;
        case 4:
        frekans4++;
        break;
        case 5:
        frekans5++;
        break;
        case 6:
        frekans6++;
        break;
        }
    }
        printf("Yuz\t Frekans\n");
        printf("1\t %d\n",frekans1);
        printf("2\t %d\n",frekans2);
        printf("3\t %d\n",frekans3);
        printf("4\t %d\n",frekans4);
        printf("5\t %d\n",frekans5);
        printf("6\t %d\n",frekans6);
       return 0;
}
