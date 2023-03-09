#include <stdio.h>
void kareciz(void);
int main()
{
    kareciz();
    return 0;
}
void kareciz(void){
    int sayi,i,j;
    printf("Lutfen cizilecek kare icin bir kenar uzunlugu belirleyiniz:");
    scanf("%d",&sayi);
    for(i=1;i<=sayi;i++){
        for(j=1;j<=sayi;j++){
            printf("*");
        }
        printf("\n");
    }
}	
