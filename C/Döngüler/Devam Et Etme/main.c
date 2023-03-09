#include <stdio.h>
#include <stdlib.h>


int main() {
	int sayi;
	char ch;
	int i;
	
	printf("Lutfen bir tamsayi giriniz:");
	scanf("%d",&sayi);
	
	printf("Devam etmek istiyor musunuz? (Evet icin E/e hayir icin H/h basiniz)");
	fflush(stdin);
	scanf("%c",&ch);
	
	while(ch=='E'|| ch=='e'){
		printf("Lutfen bir tamsayi giriniz:");
	    scanf("%d",&sayi);
	
	    printf("Devam etmek istiyor musunuz? (Evet icin E/e hayir icin H/h basiniz)");
	    fflush(stdin);
	    scanf("%c",&ch);
		
	}
	
	if(ch=='H'||ch=='h'){
		printf("Islemin devam etmesini istemediginiz icin islem sonlandirildi.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
