#include <stdio.h>
#include <stdlib.h>
int main(){
	int *ip,id;//ip ad�nda bir pointer ve id ad�nda bir integer tan�mland�.
	ip=(int*)calloc(5,sizeof(int)); //ip in dinamik bellek tan�m� yap�ld�
	for(id=0;id<5;id++){
		*(ip+id)=(id+1)*10;//ip in adresinin i�eri�i id kadar kayd�r�ld� ve id+1)*10 adrese yaz�ld�.
		printf("%p adresindeki deger:%d\n",(ip+id),*(ip+id));
	}
	free(ip);//Dinamik bellek serbest b�rak�ld�.
	return 0;
}
