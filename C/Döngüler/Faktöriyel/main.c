#include <stdio.h>
#include <stdlib.h>


int main() {
	int n;
	int fact=1;
	
	printf("Lutfen faktoriyelini almak istediginiz sayiyi giriniz:");
	scanf("%d",&n);
	
	while(n!=0){
		printf("%d\n",n);
		fact=fact*n;
		--n;
	}
	
	printf("%d",fact);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	return 0;
}
