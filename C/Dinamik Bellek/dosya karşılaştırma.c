#include <stdio.h>

int icerik_karsilastir(FILE *ptr1,FILE *ptr2){
    int karaktersayisi1,karaktersayisi2;
    fseek(ptr1,0,SEEK_END);
    fseek(ptr2,0,SEEK_END);
     karaktersayisi1=ftell(ptr1);
     karaktersayisi2=ftell(ptr2);
    printf("Birinci dosya %d karakterlidir.\n",karaktersayisi1);
    printf("Ikinci dosya %d karakterlidir.\n",karaktersayisi2);
    if(karaktersayisi1>karaktersayisi2){
        printf("Ilk dosyanizin boyutu ikinci dosyadan daha buyuktur.");
        return;
    }
    else if(karaktersayisi2>karaktersayisi1){
        printf("Ikinci dosyanin boyutu birinci dosyadan daha buyuktur.");
        return;
    }
    else{
        rewind(ptr1);
        rewind(ptr2);
        int ch,ch2;
        while(1){
            ch=fgetc(ptr1);
            ch2=fgetc(ptr2);
            printf("Dosya 1 in karakteri:%c\n",ch);
            printf("Dosya 2 nin karakteri:%c\n",ch2);
            if(ch==EOF && ch2==EOF){
            	break;
			}
			if(ch!=ch2){
				return 0;
			}
        }
    }
    return 1;
}

int main(){
    FILE *ptr1=fopen("deneme.txt","r");
    FILE *ptr2=fopen("deneme2.txt","r");
    int sonuc=icerik_karsilastir(ptr1,ptr2);
    if(ptr1!=NULL && ptr2!=NULL){
        if(sonuc==1){
            printf("Icerikler aynidir.");
        }
        if(sonuc==0){
            printf("Icerikler farklidir.");
        }
    }
       
    return 0;
}
