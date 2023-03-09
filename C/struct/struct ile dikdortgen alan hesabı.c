#include <stdio.h>
typedef struct{
	int x;
	int y;
}Nokta;

typedef struct{
	Nokta koordinat[4];//N0-->x ve y alýndý N1---->x ve y aldým N2--->x ve y aldým N3--->x ve y aldým
}dikdortgen;

float alanHesapla(dikdortgen kullaniciGirisi){
	float x_kenar,y_kenar;
	x_kenar=kullaniciGirisi.koordinat[1].x-kullaniciGirisi.koordinat[0].x;
	y_kenar=kullaniciGirisi.koordinat[3].y-kullaniciGirisi.koordinat[0].y;
	return x_kenar*y_kenar;
	
}



int main(){
		
	dikdortgen hesaplanacakDortgen;//deðiþken oluþturdum.
	int i;//dongu icin
	for(i=0;i<4;i++){
		printf("Lutfen  N%d koordinati icin sirasiyla x ve y degerlerini giriniz:",i);
		scanf("%d%d",&hesaplanacakDortgen.koordinat[i].x,&hesaplanacakDortgen.koordinat[i].y);
	}
	
	float sonuc=alanHesapla(hesaplanacakDortgen);
	printf("Girdiginiz x-y degerlerine karsilik alan degeri:%.2f",sonuc);
	

	
	return 0;	
}
