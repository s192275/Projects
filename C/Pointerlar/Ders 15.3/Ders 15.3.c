#include <stdio.h>

int main()
{
    int x=7;
    int *xptr=&x;
    printf("x degiskeninin icerigi %d dir.\n",x);
    printf("x degiskeninin iceriginin icerigi %d dir.\n",*x); //icerigin icerigine ulasmak istedigimiz icin bu satirda hatayla karasilasiriz.Cunku x komutuyla x in iceriði olan 5 print edilirken *x komutuyla 5 in de iceriði print edilmelidir bu da hataya yol açar.
    printf("x degiskeninin adresi %d dir.\n",&x);
    printf("xptr isaretcisinin icerdigi veri %p dir.\n",xptr);
    printf("xptr isaretcisinin adresi %p dir.\n",&xptr);
    printf("xptr isaretcisinin icerigi %d dir.\n",*xptr);
    
    return 0;
}

