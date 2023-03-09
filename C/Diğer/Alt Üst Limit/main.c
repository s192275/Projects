#include <stdio.h>
#include <stdlib.h>


int main(void) {
	int altlimit,ustlimit,i,j,flag;
	printf("Lutfen asalllik baskimindan tespit edilecek alt ve ust limiti sirasiyla giriniz:");
	scanf("%d%d",&altlimit,&ustlimit);
	
	for(i=altlimit;i<=ustlimit;i++){
		flag=0;
		for(j=2;j<i;j++){
			if(i%j==0){
				flag=1;
				break;
			}
		}
		
			if(flag==0)
			printf("%d\n",i);
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
