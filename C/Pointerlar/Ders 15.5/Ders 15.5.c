#include <stdio.h>
void fon (int *a);
int main()
{
    int s=1;
    printf("Fon adli fonksiyon cagrilmadan once s degiskeni %d dir.\n",s);
    fon(&s);
    printf("Fon adli fonksiyon cagrildiktan sonra s degiskeni %d dir.\n",s);
    return 0;
}
void fon(int *a){
    printf("Fonksiyona ilk gelen deger %d dir.\n",*a);
    *a=8;
    printf("Fonksiyonda yapilan degisikler sonrasi deger %d dir.\n",*a);
}
