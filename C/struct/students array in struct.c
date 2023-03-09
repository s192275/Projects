#include <string.h>
#include <stdio.h>
typedef struct{
    char ogrenciismi[200];
    int ogrencino;
    int vize;
}ogrenci;

int main()
{
    ogrenci Ogrenci[5];
    int i;
    for(i=0;i<5;i++){
    printf("Lutfen %d.ogrencinin adini giriniz:",i+1);
    fflush(stdin);
    scanf(" %s",Ogrenci[i].ogrenciismi);
    printf("Lutfen %d.ogrencinin nosunu giriniz:",i+1);
    scanf("%d",&Ogrenci[i].ogrencino);
    printf("Lutfen %d.ogrencinin vize sonucunu giriniz:",i+1);
    scanf("%d",&Ogrenci[i].vize);
    }
    for(i=0;i<5;i++){
        printf("Ogrencinin adi:%s\n",Ogrenci[i].ogrenciismi);
        printf("Ogrencinin nosu:%d\n",Ogrenci[i].ogrencino);
        printf("Ogrencinin vize sonucu:%d\n",Ogrenci[i].vize);
        printf("\n");
    }

    return 0;
}

