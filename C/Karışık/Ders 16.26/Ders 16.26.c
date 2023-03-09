#include <stdio.h>

int main()
{
    int m,i,x[10],j,num;
    printf("M giriniz:");
    scanf("%d",&m);
    printf("%d adet tamsayi giriniz:",m);
    for(i=0;i<m;i++){
        scanf("%d",&x[i]);
    }
    printf("Bir tamsayi giriniz:");
    scanf("%d",&num);
    for(i=0;i<m;++i)
    if(x[i]==num) //Eðer bir i deðeri seçilen numaraya eþitse
    for(j=i;j<m-1;++j) // Toplam döngü sayýlarýndan bir sayý eksilt 
    x[j]=x[j+1];  //-----------------> En can alýcý yeri burasý.Seçilen numaranýn olduðu deðeri saðdakine ata.Mesela j=5 olsun x[5] x[6]daki degeri tuttu.
    printf("Yeni dizi: ");
    for(i=0;i<m-1;++i)
    printf("%d",x[i]);

    return 0;
}

