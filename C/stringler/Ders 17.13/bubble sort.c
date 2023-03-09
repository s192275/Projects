#include <stdio.h>
#include <stdlib.h>
//Bubble Sort
//1 9 0 9 7  54 3 icin 0 1 3 7 9 9 54 döndürür her iki sayýyý kýyaslayýp yerlerini deðiþtirir
int main(){
	int a[7],boyut,i,j,temp;
	printf("Lutfen boyutu giriniz 7 den kucuk olmalidir.");
	scanf("%d",&boyut);
	for(i=0;i<boyut;i++){
	    scanf("%d",&a[i]);
	}
	for(i=0;j<boyut-1;j++){
	    for(j=0;j<boyut-1-i;j++){
	        if(a[j]>a[j+1]){
	            temp=a[j];
	            a[j]=a[j+1];
	            a[j+1]=temp;
	        }
	    }
	}
	for(i=0;i<boyut;i++){
	    printf("%d ",a[i]);
	}
	return 0;
}
