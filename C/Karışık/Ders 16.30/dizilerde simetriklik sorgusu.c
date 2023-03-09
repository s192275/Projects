
#include <stdio.h>
int main()
{
    int dizi[3][3],i,j,simetrik;
    printf("***Girilen sayinin simetrik olup olmadigini sorgulayan uygulama****\n\n");
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("Lutfen dizinin %d.satiri %d.sutunu icin eleman girisi yapiniz:",i+1,j+1);
            scanf("%d",&dizi[i][j]);
        }
    }
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            printf("%d\t",dizi[i][j]);
        }
        printf("\n");
    }
    for(i=0;i<3;i++){
        for(j=0;j<3;j++){
            if(dizi[i][j]==dizi[j][i])
            simetrik=1;
            else
            simetrik=0;
        }
    }
    if(simetrik==1)
    printf("Girilen dizi simetrik bir dizidir.");
    else
    printf("Girilen dizi simetrik bir dizi degildir.");
    return 0;
}

