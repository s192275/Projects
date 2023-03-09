#include <string.h>
#include <stdio.h>
#include <stdlib.h>
typedef struct{
    char sembol[3];
    char elementadi[30];
    int atomnumarasi;
}element;
  void bilgilerigoster(element dizi[],char*elementgosterim,int sayi){
  int bulundumu=0;
  int i;
  for(i=0;i<sayi;i++){
    if(strcmp(dizi[i].sembol,elementgosterim)==0){
        	printf("Sembol:%s\n",dizi[i].sembol);
			printf("Tam Adi:%s\n",dizi[i].elementadi);
			printf("Atom Numarasi:%d\n",dizi[i].atomnumarasi);
			bulundumu=1;
			break;
    }
  }
  if(strcmp(elementgosterim,dizi[i].sembol)!=0){
      printf("Aradiginiz element bulunamadi.");
  }
}
int main(){
    element dizi[]={{"H","Hidrojen",1},{"He","Helyum",2},{"Li","Lityum",3},{"C","Karbon",4},{"B","Bor",5}};
    char elementgosterim[5];
    while(1){
        printf("Lutfen element sembolunu giriniz(Cikis icin 'q' basiniz):");
        scanf("%s",elementgosterim);
        if(strcmp(elementgosterim,"q")==0){
            break;
        }
        bilgilerigoster(dizi,elementgosterim,5);
    }
    return 0;
}

