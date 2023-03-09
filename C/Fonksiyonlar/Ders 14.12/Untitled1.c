#include <stdlib.h>
#include <stdio.h>
#include <time.h>
void paraat(int);
int main()
{
    int i,para,yazi=0,tura=0;
    srand(time(NULL));
    for(i=1;i<=100;i++){
        para=0+rand()%2;
        paraat(para);
        if(para==1)
        tura++;
        else
        yazi++;
    }
    printf("Yazi:%d Tura:%d",yazi,tura);
    return 0;
}
void paraat(int para){
    int yazi=0,tura=0;
    if(para==1)
    printf("Tura.\n");
    if(para==0)
     printf("Yazi.\n");
    }
