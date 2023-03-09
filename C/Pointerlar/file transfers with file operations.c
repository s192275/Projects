#include <stdio.h>
#define MAX_SATIR_SAYISI 50
#define MAX_KARAKTER_SAYISI 50
int main()
{
    char saklanacakyer[MAX_SATIR_SAYISI][MAX_KARAKTER_SAYISI];
    int satirsayac=0;
    FILE *ptr;
    FILE *ptr2;
    ptr=fopen("deneme.txt","r");
    ptr2=fopen("deneme2.txt","w");
    if(ptr!=NULL && ptr2!=NULL){
        printf("Iki dosya da basarili bir sekilde olusturuldu.");
        while(satirsayac<MAX_KARAKTER_SAYISI && !feof(ptr)){
            fgets(saklanacakyer[satirsayac],MAX_KARAKTER_SAYISI,ptr);
            printf("%s ifadesi ptr2 ye kopyalandi.\n",saklanacakyer[satirsayac]);
            fputs(saklanacakyer[satirsayac],ptr2);
            satirsayac++;
        }
    }
    return 0;
}

