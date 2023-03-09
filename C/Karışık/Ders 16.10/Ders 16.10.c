#include <stdio.h>
int main(){
	int arr[10]={1,2,3,4,5};
	printf("Area of the array:%d\n ",sizeof(arr));
	printf("Adress of the arrays first participant:%p\n",&arr[1]);
	printf("Adress of the arrays second participant:%p\n",&arr[2]);
	printf("Adress of the arrays third participant:%p\n",&arr[3]);
	printf("Adress of the arrays fourth participant:%p\n",&arr[4]);
	printf("Adress of the arrays fifth participant:%p\n",&arr[5]);//Adresini verdi ama deðeri olmadýðý için karþýlýðý boþ kaldý
	printf("Adress of the arrays sixth participant:%p\n",&arr[6]);//Adresini verdi ama deðeri olmadýðý için karþýlýðý boþ kaldý
	
	
	
	
	
	return 0;
}
