#include <stdlib.h>//Ýstenmeyen durumlara döngü durumlarýna ve tarih girmeye bak.
#include <stdio.h>
#include <math.h>
#include <time.h>
#include <ctype.h>
#include <string.h>
float kral_dairesi_ucret(int,char,char);//Kaç gün kalacaðýný alsýn ve fonksiyonun kendi içinde oluþturduðu deðerle çarpýp ücreti döndürsün.
float suit_oda_ucret(int,char,char);
float normal_oda_ucret(int,char,char);
int main(void){
	int oda_no,gun_sayisi,taksit,dongu,gun,ay,yil,telefon_sayisi,kimlik_sayisi;
	float fiyat,taksitbasi;
	char ad[100],soyad[100],secim,akrabalik,odeme,email[150],sifre[40],kimlik[10],telefon[10],dahil_mi,manzara,kisi;
	srand(time(NULL));
	printf("*****Medeniyet Otel'e Hosgeldiniz.*****\n\n");
	printf("Lutfen adinizi giriniz:");
	gets(ad); //string de alsaydýk boþluða kadar alacaktý.Bu istenmeyen bir durum olduðu için gets ve puts komutlarýný kullandým.
	printf("Adiniz:");
	puts(ad);
	printf("Lutfen soyadinizi giriniz:");
	gets(soyad);
	printf("Soyadiniz:");
	puts(soyad);
	printf("Lutfen TC kimlik numaranizi ya da 11 haneli pasaport numaranizi giriniz:");
	gets(kimlik);
	for(dongu=0;dongu<11;dongu++){
		while(isalpha(kimlik[dongu])){
				printf("Hata.Lutfen tekrar giriniz:");
				scanf("%s",kimlik);
		}
		
	}
	kimlik_sayisi=strlen(kimlik);
	while(kimlik_sayisi!=11){
	    printf("Kimlik numarasi ya da pasaport sayisi 11 den farkli.Lutfen tekrar giriniz:");
	    scanf("%s",kimlik);
	    kimlik_sayisi=strlen(kimlik);
	    if(kimlik_sayisi==11)
	    printf("TC kimlik ya da 11 haneli pasaport numaraniz: %s\n",kimlik);
	}
	
	printf("Lutfen telefon numaranizi giriniz:");
	scanf("%s",telefon);
	for(dongu=0;dongu<3;dongu++){
		while(isalpha(telefon[dongu])){
				printf("Hata.Lutfen tekrar giriniz:");
				scanf(" %s",telefon);
		}
	}
	telefon_sayisi=strlen(telefon);
	while(telefon_sayisi!=11){
	    printf("Telefon sayiniz 11 den farkli.Lutfen tekrar giriniz:");
	    scanf("%s",telefon);
	    telefon_sayisi=strlen(telefon);
	    if(telefon_sayisi==11)
	    printf("Telefon numaraniz:%s\n ",telefon);
	}
	printf("Kac kisi kalacaksiniz(10 kisiye kadar):");
	scanf(" %c",&kisi);
	while(kisi<49 || kisi>57){  //Bug bulma durumu(Kullanýcýnýn sayý yerine harf girme durumuna karþýn char atadým ve ascii tablosundaki karþýlýklarýna göre iþlem atadým.
	    printf("Kisi sayisi yanlis girilmis.Lutfen tekrar giriniz:");
	    scanf(" %c",&kisi);
	}
	printf("Acik bufe,uc ogun yemek ve cesitli etkinliklere katilim hakkini fiyata da yansitilmak uzere kabul ediyor musunuz ? (Evet icin 'E/e' Hayir icin 'H/h' basiniz:)");
	scanf(" %c", &dahil_mi);
	while(dahil_mi!='E' && dahil_mi!='e' && dahil_mi!='H' && dahil_mi!='h'){
		printf("Yanlis bir secenek girdiniz.Lutfen tekrar deneyiniz:");
		scanf("%c",&dahil_mi);
	}
	printf("Deniz manzarali oda ister misiniz?(Evet icin 'E/e' Hayir icin 'H/h' basiniz:)");
	scanf(" %c",&manzara);
	while(manzara!='E' && manzara!='e' && manzara!='H' && manzara!='h'){
		printf("Yanlis bir secenek girdiniz.Lutfen tekrar deneyiniz:");
		scanf("%c",&manzara);
	}
	printf("Sehit ya da gazi yakini misiniz ?(Evet icin E/e Hayir icin H/h):");
	scanf(" %c",&akrabalik);
	while(akrabalik!='E' && akrabalik!='e' && akrabalik!='H' && akrabalik!='h'){
	    printf("Lutfen E/e ya da H/h karakterlerinden birini giriniz.Yetersiz karakter girdiniz.");
	    printf("Lutfen dogru bir secenek giriniz:");
	    scanf(" %c",&akrabalik);
	}
	printf("Lutfen giris yapmak istediginiz tarihi giriniz.(Gun ay yil formatinda):"); //Harf durumuna çözüm bul
	scanf("%d%d%d",&gun,&ay,&yil);
		while(gun<0 || gun>31 || ay<0 || ay>12 || yil<0){
			printf("Hatali tarih girisi.Lutfen tekrar giriniz:");
			scanf("%d%d%d",&gun,&ay,&yil);
		}
	printf("Lutfen kac gun kalmak istiyorsaniz onu giriniz:");  //Harf durumuna çözüm bulamadým.Char atayýp string yapýnca oldu ama bu seferde fonksiyonlarda sýkýntý çýktý.
	scanf("%d",&gun_sayisi);
		while(gun_sayisi<0){
				printf("Hata.Lutfen tekrar giriniz:");
				scanf("%d",&gun_sayisi);
	}
	printf("Lutfen kalmak istediginiz otel tipini giriniz(Kral dairesi icin K/K Suit oda icin S/s Normal oda icin N/n basiniz):");
	scanf(" %c",&secim);
	while(secim!='K' && secim!='k' && secim!='S' && secim!='s' && secim!='N' && secim!='n'){
	    printf("Otel tipini yanlis girdiniz.Lutfen gecerli bir tip girisi yapiniz:");
	    scanf(" %c",&secim);
	}
	printf("Lutfen avantajli firsatlarimiz ve tekliflerimizden yararlanmak icin e-mail hesabinizi giriniz:");
	scanf("%s", email);
	printf("Lutfen telefonunuza gelen aktivasyon kodunu giriniz:");
	scanf("%s", sifre);
	if(secim=='K' || secim=='k'){
		oda_no=rand()%901+601;
		printf("\n\n*****Fatura Bilgileri*****\n\n");
		printf("Ad: %s\n",ad);
		printf("Soyad: %s\n",soyad);
		printf("TC kimlik/pasaport no: %s\n",kimlik);
		printf("Telefon no: %s\n",telefon);
		printf("Kac kisi kalinacak: %c\n",kisi);
		printf("Giris yapilan tarih: %d . %d . %d\n",gun,ay,yil);
		printf("Kac gun kalinacak: %d\n",gun_sayisi);
		printf("Kalinacak otel tipi: Kral Dairesi\n");
		printf("E-mail adresi: %s\n",email);
		printf("Aktivasyon Kodu: %s\n",sifre);
		printf("Hesap: %.2f TL\n",kral_dairesi_ucret(gun_sayisi,akrabalik,dahil_mi));
	printf("Kalacaginiz oda numarasi: %d \n",oda_no);
	printf("Odeme olarak Nakit mi Kredi kartini mi kullanacaksiniz?(Nakit icin N/n Kredi karti icin K/k basiniz:)");
	scanf(" %c",&odeme);
	  while(odeme!='N' && odeme!='n' && odeme!='K' && odeme!='k'){
	      printf("Odeme tipini yanlis girdiniz.Lutfen gecerli bir odeme tipi giriniz:");
	      scanf(" %c",&odeme);
	  }
	if(odeme=='N' || odeme=='n')
		printf("Odeme islemiz tamamlandi.");
	if(odeme=='K' || odeme=='k'){
		printf("Lutfen kac taksitte odemek istiyorsaniz giriniz(1 ile 10 arasi girilmelidir):");
		scanf("%d",&taksit);
		while(taksit<0 || taksit>10){
		printf("Taksit komutunu yanlis girdiniz.Lutfen gecerli bir taksit giriniz:");
		scanf("%d",&taksit);
		}
		taksitbasi=(1.1*kral_dairesi_ucret(gun_sayisi,akrabalik,dahil_mi))/taksit;
		printf("Odeceginiz tutar taksit basina %.2f dir.",taksitbasi);
	}
}
	if(secim=='S' || secim=='s'){
		oda_no=rand()%601+301;
		printf("\n\n*****Fatura Bilgileri*****\n\n");
		printf("Ad: %s\n",ad);
		printf("Soyad: %s\n",soyad);
		printf("TC kimlik/pasaport no: %s\n",kimlik);
		printf("Telefon no: %s\n",telefon);
		printf("Kac kisi kalinacak: %c\n",kisi);
		printf("Giris yapilan tarih: %d . %d . %d\n",gun,ay,yil);
		printf("Kac gun kalinacak: %d\n",gun_sayisi);
		printf("Kalinacak otel tipi:Suit Oda\n");
		printf("E-mail adresi: %s\n",email);
		printf("Aktivasyon kodu: %s\n",sifre);
		printf("Hesap: %.2f TL\n",suit_oda_ucret(gun_sayisi,akrabalik,dahil_mi));
	printf("Kalacaginiz oda numarasi %d \n",oda_no);
	printf("Odeme olarak Nakit mi Kredi kartini mi kullanacaksiniz?(Nakit icin N/n Kredi karti icin K/k basiniz:)");
	scanf(" %c",&odeme);
	if(odeme=='N' || odeme=='n')
		printf("Odeme islemiz tamamlandi.");
	if(odeme=='K' || odeme=='k'){
	     while(odeme!='N' && odeme!='n' && odeme!='K' && odeme!='k'){
	      printf("Odeme tipini yanlis girdiniz.Lutfen gecerli bir odeme tipi giriniz:");
	      scanf(" %c",&odeme);
	  }
		printf("Lutfen kac taksitte odemek istiyorsaniz giriniz(1 ile 10 arasi girilmelidir):");
		scanf("%d",&taksit);
		while(taksit<0 || taksit>10){
	      printf("Taksit sayisini yanlis girdiniz.Lutfen gecerli bir taksit giriniz:");
	      scanf("%d",&taksit);
		}
		taksitbasi=(1.1*suit_oda_ucret(gun_sayisi,akrabalik,dahil_mi))/taksit;
		printf("Odeceginiz tutar taksit basina %.2f dir.",taksitbasi);
	}
}
	if(secim=='N' || secim=='n'){
		oda_no=rand()%301;
		printf("\n\n*****Fatura Bilgileri*****\n\n");
		printf("Ad: %s\n",ad);
		printf("Soyad: %s\n",soyad);
		printf("TC kimlik/pasaport no: %s\n",kimlik);
		printf("Telefon no: %s\n",telefon);
		printf("Kac kisi kalinacak: %c\n",kisi);
		printf("Giris yapilan tarih: %d .%d . %d\n",gun,ay,yil);
		printf("Kac gun kalinacak: %d\n",gun_sayisi);
		printf("Kalinacak otel tipi: Normal Oda\n");
		printf("Email adresi: %s\n",email);
		printf("Aktivasyon kodu: %s\n",sifre);
		printf("Hesap: %2.f TL\n",normal_oda_ucret(gun_sayisi,akrabalik,dahil_mi));
	printf("Kalacaginiz oda numarasi: %d \n",oda_no);
	printf("Hesap: %2.f\n",normal_oda_ucret(gun_sayisi,akrabalik,dahil_mi));
	printf("Odeme olarak Nakit mi Kredi kartini mi kullanacaksiniz?(Nakit icin N/n Kredi karti icin K/k basiniz:)");
	scanf(" %c",&odeme);
	if(odeme=='N' || odeme=='n')
		printf("Odeme islemiz tamamlandi.");
	if(odeme=='K' || odeme=='k'){
	     while(odeme!='N' && odeme!='n' && odeme!='K' && odeme!='k'){
	      printf("Odeme tipini yanlis girdiniz.Lutfen gecerli bir odeme tipi giriniz:");
	      scanf(" %c",&odeme);
	  }
		printf("Lutfen kac taksitte odemek istiyorsaniz giriniz(1 ile 10 arasi girilmelidir):");
		scanf("%d",&taksit);
		while(taksit<0 || taksit>10){
	      printf("Taksit komutunu yanlis girdiniz.Lutfen gecerli bir taksit sayisi giriniz:");
	      scanf("%d",&taksit);
	  }
		taksitbasi=(1.1*normal_oda_ucret(gun_sayisi,akrabalik,dahil_mi))/taksit;
		printf("Odeceginiz tutar taksit basina %.2f dir.",taksitbasi);
	}
}
	return 0;
}
float kral_dairesi_ucret(int gun_sayisi,char akrabalik,char dahil_mi){
	int ucret;
	if(dahil_mi=='e' || dahil_mi=='E')
		ucret=(50000*gun_sayisi)*1.1;
	
	if(dahil_mi=='H' || dahil_mi=='h')
		ucret=50000*gun_sayisi;
		
	if(akrabalik=='E' || akrabalik=='e')
	ucret=ucret*0.90;
	return ucret;
}
float suit_oda_ucret(int gun_sayisi,char akrabalik,char dahil_mi){
	int ucret;
	if(dahil_mi=='e' || dahil_mi=='E')
		ucret=(20000*gun_sayisi)*1.1;
	
	if(dahil_mi=='H' || dahil_mi=='h')
		ucret=20000*gun_sayisi;
		
	if(akrabalik=='E' || akrabalik=='e')
	ucret=ucret*0.90;
	return ucret;
}
float normal_oda_ucret(int gun_sayisi,char akrabalik,char dahil_mi){
	int ucret;
	if(dahil_mi=='e' || dahil_mi=='E'){
		ucret=(500*gun_sayisi)*1.05;
	}
	if(dahil_mi=='H' || dahil_mi=='h'){
		ucret=500*gun_sayisi;
	}
	if(akrabalik=='E' || akrabalik=='e')
	ucret=ucret*0.90;
	return ucret;
}
