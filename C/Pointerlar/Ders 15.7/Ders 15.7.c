#include <stdio.h>
void degerdegistir(int *a,int *b){
    int temp=*a;
    *a=*b;
    *b=temp;
    printf("a:%d     b:%d\n",*a,*b);
    
}
int main()
{
    int x=5,y=10;//De�er atamas� yapt�k
    // *x=&x   *y=&y i�lemlerini kendi otomatik yap�yor ��nk� yukar�da pointera g�re �a��rd�k
    degerdegistir(&x,&y); // Fonksiyonu �a��rd�k.Adresiyle �a��rd�k ��nk� kal�c� bir i�lem yapmak istiyoruz.
    printf("x:%d     y:%d\n",x,y);

    return 0;
}
