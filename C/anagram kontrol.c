#include <stdio.h>
#include <string.h>
int main(){
    char kullanicigirisi[20],kullanicigirisi2[20];
    int i,j,eleman,sorgu=1;
    int karaktersayilari,karaktersayilari2;
    puts("Lutfen ilk stringi giriniz:");
    gets(kullanicigirisi);
    puts("Lutfen ikinci stringi giriniz:");
    gets(kullanicigirisi2);
    karaktersayilari=strlen(kullanicigirisi);
    karaktersayilari2=strlen(kullanicigirisi2);
    if(karaktersayilari!=karaktersayilari2){
        printf("Anagram degiller.");
    }
    else{
        for(i=1;i<karaktersayilari;i++){
        eleman=kullanicigirisi[i]; //Instertion sortun gere�i 1.elemandan ba�latmak gerekti o y�zden b�yle bir d�ng� kuruldu.
       j=i-1;//j say�s� i nin solundaki say� oldu�u i�in bu i�lemi uygulad�k.
       while(eleman<kullanicigirisi[j] && j>=0){ 
           kullanicigirisi[j+1]=kullanicigirisi[j];
           j--; //Gerisindekilerin say�s�n� artt�r�r.
       }
       kullanicigirisi[j+1]=eleman;
    }
    for(i=1;i<karaktersayilari2;i++){
        eleman=kullanicigirisi2[i]; //Instertion sortun gere�i 1.elemandan ba�latmak gerekti o y�zden b�yle bir d�ng� kuruldu.
       j=i-1;//j say�s� i nin solundaki say� oldu�u i�in bu i�lemi uygulad�k.
       while(eleman<kullanicigirisi2[j] && j>=0){ 
           kullanicigirisi2[j+1]=kullanicigirisi2[j];
           j--; //Gerisindekilerin say�s�n� artt�r�r.
       }
       kullanicigirisi2[j+1]=eleman;
    }
    for(i=0;i<karaktersayilari;i++){
     if(kullanicigirisi[i]!=kullanicigirisi2[i]){
         sorgu=0;
         break;
     }   
    }
    if(sorgu==1){
        printf("Anagramdirlar.");
    }
    if(sorgu!=1){
        printf("Anagram degildirler.");
    }
    
    }
    
    return 0;
}
