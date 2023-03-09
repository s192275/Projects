 #include <stdio.h>
 #include <stdlib.h>
 #include <time.h>
 int zarAtma( void );

 int main( )
 {
 int oyunDurumu, toplam, oyuncuPuani;

 srand( time( NULL ) );
 toplam = zarAtma( ); /* zar�n ilk at�l�G� */

 switch( toplam ) {
 case 7: case 11: /* ilk at�Gta kazanma */
 oyunDurumu = 1;
 break;
 case 2: case 3: case 12: /* ilk at�Gta kaybetme */
 oyunDurumu = 2;
 break;
 default: /* hat�rlatma noktas� */
 oyunDurumu = 0;
 oyuncuPuani= toplam;
 printf( "Oyuncunun kazanaca�� zar: %d\n", oyuncuPuani );
 break;
 }

 while (oyunDurumu == 0 ) { /* zar atmaya devam et */
 toplam= zarAtma( );

 if ( toplam == oyuncuPuani) /* kazan�lacak zar� atma */ 
 oyunDurumu = 1;
 else
 if ( toplam == 7 ) /* 7 atma ile kaybetme */
 oyunDurumu = 2;
 }

 if (oyunDurumu == 1 )
 printf( "Oyuncu Kazan�r \n" );
 else
 printf( "Oyuncu kaybeder\n" ); 

 return 0;
 }

 int zarAtma( void )
 {
 int zar1, zar2, toplamZar;

 zar1 = 1 + ( rand( ) % 6 );
 zar2 = 1 + ( rand( ) % 6 );
 toplamZar = zar1 + zar2;
 printf( "Oyuncu %d + %d = %d att� \n", zar1, zar2, toplamZar );
 return toplamZar;
 }
