#include <stdio.h>
#include <string.h>

typedef struct{
	int ID;//4byte
	double fiyatBilgisi;//8byte
	char urunAdiBilgisi[20];//20byte	
}urunBilgileri;

void listeyeUrunEkle(urunBilgileri urunListesi[],int urunID,double urunFiyat,char *urunAdi){
	int bosYer=0;//dongu icin
	while(1){
		if(urunListesi[bosYer].ID==0){//burasi bos buraya yazabilirim.
			urunListesi[bosYer].ID=urunID;
			urunListesi[bosYer].fiyatBilgisi=urunFiyat;
			strcpy(urunListesi[bosYer].urunAdiBilgisi,urunAdi);
			break;
		}
		bosYer++;
	}	
}
int urunBul(int arananID,urunBilgileri urunListesi[],int urunSayisi){
	int i;
	for(i=0;i<urunSayisi;i++){
		if(urunListesi[i].ID==arananID){
			return i;//bulduk ve indeksi i
		}
	}
	return -1;//bulamadik
}
void urunBilgisiGoster(int urunID,urunBilgileri urunListesi[],int urunSayisi){
	
	int urunIndex=urunBul(urunID,urunListesi,urunSayisi);//varsa index geldi yoksa -1 geldi.
	if(urunIndex!=-1){
		printf("Urun ID:%d\n",urunListesi[urunIndex].ID);
		printf("Urun Fiyat:%.2lf\n",urunListesi[urunIndex].fiyatBilgisi);
		printf("Urun Adi:%s",urunListesi[urunIndex].urunAdiBilgisi);
	}
	else{
		printf("Aradiginiz urun kayitli degildir.");
	}
		
}

int main(void){
	
	int urunSayisi,ID,i;
	urunBilgileri *urunlerListesi;
	double urunFiyat;
	char urunAdi[15];
	
	puts("Lutfen kac adet urun girmek istediginizi soyleyin.");
	scanf("%d",&urunSayisi);
	urunlerListesi=(urunBilgileri*)calloc(urunSayisi,sizeof(urunBilgileri));//dinamik þekilde ürün deposu oluþturduk
	
	for(i=0;i<urunSayisi;i++){
		puts("Lutfen eklenecek urunun ID bilgisini giriniz:");
		scanf("%d",&ID);
		puts("Lutfen eklenecek urunun fiyat bilgisini giriniz:");
		scanf("%lf",&urunFiyat);
		puts("Lutfen eklenecek urunun adini giriniz:");
		scanf("%s",&urunAdi);
		listeyeUrunEkle(urunlerListesi,ID,urunFiyat,urunAdi);//urunleri ekledik
	}
	
	printf("Lutfen gormek istediginiz urunun ID bilgisini giriniz:");
	scanf("%d",&ID);
	urunBilgisiGoster(ID,urunlerListesi,urunSayisi);

	return 0;

}


