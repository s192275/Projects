#include <stdio.h>
#include <stdlib.h>


int main() {
	int tutar;
	int islem;
	int bakiye=1000;
	printf("Islemler\n\n");
	printf("1.Para cekme\n");
	printf("2.Para yatirma\n");
	printf("3.Havale yatirma\n");
	printf("4.Bakiye sorgulama\n");
	printf("5.Kart iade\n");
	
	printf("Lutfen yapmak istediginiz islemi seciniz:");
	scanf("%d",&islem);
	
	switch(islem) {
		case 1:
			printf("Bakiyeniz: %d\n",bakiye);
			printf("Cekilecek tutar:");
			scanf("%d",&tutar);
			if(tutar>bakiye){
				printf("Bakiyeniz yetersiz\n");
			}
			else{
				bakiye-=tutar;
				printf("Bakiyeniz %d\n",bakiye);
			}
			break;
		case 2:
			printf("Bakiyeniz: %d\n",bakiye);
			printf("Yatirilacak tutar:");
			scanf("%d",&tutar);
			bakiye+=tutar;
			printf("Bakiyeniz: %d\n",bakiye);
			break;
		case 3:
			printf("Bakiyeniz: %d\n",bakiye);
			printf("Yatirilacak tutar:");
			scanf("%d",&tutar);
			if(tutar>bakiye){
				printf("Bakiyeniz yetersiz.\n");
			}
			else{
				bakiye-=tutar;
				printf("Bakiyeniz: %d\n",bakiye);
			}
			break;
			
			
		case 4:
			printf("Bakiyeniz: %d\n",bakiye);
			break;
		
		case 5:
			printf("Girdiginiz kart geri verildi.\n");
			break;
			
		default:
		    printf("Hatali veya eksik islem");
			break;	
	}
	return 0;
}
