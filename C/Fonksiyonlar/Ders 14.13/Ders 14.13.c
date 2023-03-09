#include <stdlib.h>
#include <stdio.h>
#include <time.h>
void yanit(int,int,int,int,int);
void toplam(int,int,int,int,int);
int main()
{
    int sayi1,sayi2,cevap,olumluyorum,olumsuzyorum,i,dogrucevap=0,seviye,secim;
    printf("Lutfen seviye seciniz:");
    scanf("%d",&seviye);
    if(seviye==1){
    	printf("Lutfen islem seviyesi seciniz:");
    	scanf("%d",&secim);
    	if(secim==1){
    srand(time(NULL));
    for(i=1;i<=10;i++){
    sayi1=rand()%9;
    sayi2=rand()%9;
    olumluyorum=1+rand()%4;
    olumsuzyorum=1+rand()%4;
    printf("%d carpi %d kactir?\n",sayi1,sayi2);
    scanf("%d",&cevap);
    if(cevap==sayi1*sayi2){
    dogrucevap++;
     yanit(sayi1,sayi2,cevap,olumluyorum,olumsuzyorum);
    }
    if(cevap!=sayi1*sayi2){
     yanit(sayi1,sayi2,cevap,olumluyorum,olumsuzyorum);
    }
    }
    if(dogrucevap<3)
    printf("Konuya tekrar bakmalisin.");
}
    	if(secim==2){
    srand(time(NULL));
    for(i=1;i<=10;i++){
    sayi1=rand()%9;
    sayi2=rand()%9;
    olumluyorum=1+rand()%4;
    olumsuzyorum=1+rand()%4;
    printf("%d arti %d kactir?\n",sayi1,sayi2);
    scanf("%d",&cevap);
    if(cevap==sayi1+sayi2){
    dogrucevap++;
     toplam(sayi1,sayi2,cevap,olumluyorum,olumsuzyorum);
    }
    if(cevap!=sayi1+sayi2){
     toplam(sayi1,sayi2,cevap,olumluyorum,olumsuzyorum);
    }
    }
    if(dogrucevap<3)
    printf("Konuya tekrar bakmalisin.");
}
}
if(seviye==2){
	printf("Lutfen seviye seciniz:");
	scanf("%d",&secim);
	if(secim==1){
srand(time(NULL));
    for(i=1;i<=10;i++){
    sayi1=rand()%99;
    sayi2=rand()%99;
    olumluyorum=1+rand()%4;
    olumsuzyorum=1+rand()%4;
    printf("%d carpi %d kactir?\n",sayi1,sayi2);
    scanf("%d",&cevap);
    if(cevap==sayi1*sayi2){
    dogrucevap++;
     yanit(sayi1,sayi2,cevap,olumluyorum,olumsuzyorum);
    }
    if(cevap!=sayi1*sayi2){
     yanit(sayi1,sayi2,cevap,olumluyorum,olumsuzyorum);
    }
    }
    if(dogrucevap<3)
    printf("Konuya tekrar bakmalisin.");
}
if(secim==2){
srand(time(NULL));
    for(i=1;i<=10;i++){
    sayi1=rand()%99;
    sayi2=rand()%99;
    olumluyorum=1+rand()%4;
    olumsuzyorum=1+rand()%4;
    printf("%d arti %d kactir?\n",sayi1,sayi2);
    scanf("%d",&cevap);
    if(cevap==sayi1+sayi2){
    dogrucevap++;
     toplam(sayi1,sayi2,cevap,olumluyorum,olumsuzyorum);
    }
    if(cevap!=sayi1+sayi2){
     toplam(sayi1,sayi2,cevap,olumluyorum,olumsuzyorum);
    }
    }
    if(dogrucevap<3)
    printf("Konuya tekrar bakmalisin.");
}
}
return 0;
}
void yanit(int sayi1,int sayi2,int cevap,int olumluyorum,int olumsuzyorum){
    if(cevap==sayi1*sayi2){
        if(olumluyorum==1)
        printf("Bravo.\n");
        if(olumluyorum==2)
        printf("Harikasin\n");
        if(olumluyorum==3)
        printf("Aferin\n");
    }
    if(cevap!=sayi1*sayi2){
        if(olumsuzyorum==1)
        printf("Yanlis cevap.\n");
        if(olumsuzyorum==2)
        printf("Bir daha bakmalisin.\n");
        if(olumsuzyorum==3)
        printf("Babanin burnunu sikarim penseyle\n");
    }
}
void toplam(int sayi1,int sayi2,int cevap,int olumluyorum,int olumsuzyorum){
    if(cevap==sayi1+sayi2){
        if(olumluyorum==1)
        printf("Bravo.\n");
        if(olumluyorum==2)
        printf("Harikasin\n");
        if(olumluyorum==3)
        printf("Aferin\n");
    }
	    if(cevap!=sayi1+sayi2){
        if(olumsuzyorum==1)
        printf("Yanlis cevap.\n");
        if(olumsuzyorum==2)
        printf("Bir daha bakmalisin.\n");
        if(olumsuzyorum==3)
        printf("Babanin burnunu sikarim penseyle\n");
    }
}
