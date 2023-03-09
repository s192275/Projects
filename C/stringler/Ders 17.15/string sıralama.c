#include <stdio.h>
#include <string.h>
int main(){
	char kelime[5][7]={"Kitap",
	                   "Kalem",
					    "Defter",
						"Kapi",
						"Kale"};
	char gecici[7];
	int i=0,j=0;
	printf("Siralamadan once kelimeler:\n");
	for(i=0;i<5;i++){
		printf("%s\n",kelime[i]);
	}
	for(i=0;i<4;i++){
		for(j=i+1;j<5;j++){
			if(strcmp(kelime[i],kelime[j])>0){
				strcpy(gecici,kelime[i]);
				strcpy(kelime[i],kelime[j]);
				strcpy(kelime[j],gecici);
			}
		}
	}
	printf("Sirali kelimeler:\n");
	for(i=0;i<5;i++){
		printf("%s\n",kelime[i]);
	}
	return 0;
}//Bunun dinamik dizisini de deneyebilirsin
