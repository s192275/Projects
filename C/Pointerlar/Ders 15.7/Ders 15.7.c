#include <stdio.h>
void degerdegistir(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
    printf("a:%d     b:%d\n",*a,*b);
    
}
int main()
{
    int x=5,y=10;//Deðer atamasý yaptýk
    // *x=&x   *y=&y iþlemlerini kendi otomatik yapýyor çünkü yukarýda pointera göre çaðýrdýk
    degerdegistir(&x,&y); // Fonksiyonu çaðýrdýk.Adresiyle çaðýrdýk çünkü kalýcý bir iþlem yapmak istiyoruz.
    printf("x:%d     y:%d\n",x,y);

    return 0;
}
