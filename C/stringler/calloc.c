#include <stdio.h>
#include <stdlib.h>
int main(){
	int *ip,id;//ip adýnda bir pointer ve id adýnda bir integer tanýmlandý.
	ip=(int*)calloc(5,sizeof(int)); //ip in dinamik bellek tanýmý yapýldý
	for(id=0;id<5;id++){
		*(ip+id)=(id+1)*10;//ip in adresinin içeriði id kadar kaydýrýldý ve id+1)*10 adrese yazýldý.
		printf("%p adresindeki deger:%d\n",(ip+id),*(ip+id));
	}
	free(ip);//Dinamik bellek serbest býrakýldý.
	return 0;
}
