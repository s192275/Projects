#include <stdio.h>
void matris_yazdir( int [][ 4 ], int );//Sutunu doldurduk
int main( void )
{
	// Ornek olmasi acisindan matrise keyfi 
	// degerler atiyoruz. Matrisimiz 3 satir 
	// ve 4 sutundan ( 3 x 4 ) olusuyor. 
	int matris[ 3 ][ 4 ] = { 
			{10, 15, 20, 25},
			{30, 35, 40, 45},
			{50, 55, 60, 65} };

	// Matris elemanlarini yazdiran fonksiyonu 
	// cagriyoruz.
	matris_yazdir( matris, 3 );//Sadece satýrý cagýrdýk.

	return 0;
}
void matris_yazdir( int dizi[ ][ 4 ], int satir_sayisi )
{
	int i, j;
	for( i = 0; i < satir_sayisi; i++ ) {
		for( j = 0; j < 4; j++ ) {
			printf( "%d ", dizi[ i ][ j ] );
		}
		printf( "\n" );
	}
}
