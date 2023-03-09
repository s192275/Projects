#include <stdio.h>
int ussu(int,int);
int main()
{
    int us,taban;
    printf("Lutfen taban degerini giriniz:");
    scanf("%d",&taban);
    printf("Lutfen us degerini giriniz:");
    scanf("%d",&us);
    printf("%d uzeri %d = %d",taban,us,ussu(taban,us));

    return 0;
}
int ussu(int taban,int us){
    if(us==1 || us==0)
    return taban;
    else
    return taban*ussu(taban,us-1);
}
