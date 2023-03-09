#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct{
	char ad[20];
	char soyad[20];
	int okulno;
	float matvize;
	float matfinal;
	float fizikvize;
	float fizikfinal;
	float bilvize;
	float bilfinal;
	double matort;
	double fizikort;
	double genelort;
}ogrenciler;
void bilgilerigir(FILE *dosya2){
	char var1[20],var2[20],var3[20],var4[20],var5[20],var6[20],var7[20],var8[20],var9[20];
	int ogrencisayisi=0;
	int i=0;
	  ogrenciler *ogr=(ogrenciler*)malloc(sizeof(ogrenciler)*6);
	FILE *dosya1=fopen("obs.txt","r");
	if(dosya1==NULL){
		printf("Dosya bulunamadi.");
	}
	else{
	while (fscanf(dosya1, "%s %s %s %s %s %s %s %s %s",ogr[i].ad,ogr[i].soyad,var3,var4,var5,var6,var7,var8,var9)!=EOF) {
            ogr[i].okulno=atoi(var3);
            ogr[i].matvize=atoi(var4);
            ogr[i].matfinal=atoi(var5);
            ogr[i].fizikvize=atoi(var6);
            ogr[i].fizikfinal=atoi(var7);
            ogr[i].bilvize=atoi(var8);
            ogr[i].bilfinal=atoi(var9);
            i++;
            ogrencisayisi++;
        }
	}
	mat_notuna_gore_sirala(ogrencisayisi,dosya2,ogr);
	isme_gore_sirala(ogrencisayisi,dosya2, ogr);
	fizik_notuna_gore_sirala(ogrencisayisi,dosya2, ogr);
	okul_noya_gore_sirala(ogrencisayisi,dosya2, ogr);
	soyada_gore_sirala(ogrencisayisi,dosya2, ogr);
	genele_gore_sirala(dosya1,ogrencisayisi,dosya2, ogr);
    
    fclose(dosya1);
}
void isme_gore_sirala(FILE *dosya2,int ogrencisayisi,ogrenciler *ogr){
	int i,j;
	 for (i = 0; i < ogrencisayisi-1; i++){
       for (j = 0; j < ogrencisayisi-i-1; j++){
           if (strcmp(ogr[j].ad,ogr[j+1].ad)>0){
                ogrenciler tempOgrenci = ogr[j];
                ogr[j]=ogr[j+1];
                ogr[j+1]=tempOgrenci;
           }
       }
    }
    fprintf(dosya2,"ISME GORE ARTAN SIRALAMA\n");
    fprintf(dosya2,"Ad\t\tSoyad\tOkulNo\n");
    for(i=0;i<ogrencisayisi;i++){
        fprintf(dosya2,"%s\t",ogr[i].ad);
        fprintf(dosya2,"%s\t",ogr[i].soyad);
        fprintf(dosya2,"%d\t",ogr[i].okulno);
        fprintf(dosya2,"\n");
    }
    fprintf(dosya2,"\n");
   fclose(dosya2);
}
void soyada_gore_sirala(FILE *dosya2,int ogrencisayisi,ogrenciler *ogr){
	int i,j;
	for(i=0;i<ogrencisayisi-1;i++){
		for(j=0;j<ogrencisayisi-1-i;j++){
			if(strcmp(ogr[j].soyad,ogr[j+1].soyad>0)){
				ogrenciler tempOgrenci=ogr[j];
				ogr[j]=ogr[j+1];
				ogr[j+1]=tempOgrenci;
			}
		}
	}
	fprintf(dosya2,"SOYISME GORE ARTAN SIRALAMA\n");
    fprintf(dosya2,"Ad\t\tSoyad\tOkulNo\n");
    for(i=0;i<ogrencisayisi;i++){
        fprintf(dosya2,"%s\t",ogr[i].ad);
        fprintf(dosya2,"%s\t",ogr[i].soyad);
        fprintf(dosya2,"%d\t",ogr[i].okulno);
        fprintf(dosya2,"\n");
    }
    fprintf(dosya2,"\n");
   fclose(dosya2);
}
void mat_notuna_gore_sirala(FILE *dosya2,int ogrencisayisi,ogrenciler *ogr){
	int i;
	for(i=0;i<ogrencisayisi;i++){
	ogr[i].matort=0.6*(ogr[i].matfinal)+0.4*(ogr[i].matvize);
}
	for(i=0;i<ogrencisayisi;i++){
		if(ogr[i].matort>ogr[i+1].matort){
			int temp=ogr[i].matort;
			ogr[i].matort=ogr[i+1].matort;
			ogr[i+1].matort=temp;
		}
		fprintf(dosya2,"MATEMATIK ORTALAMASINA GORE SIRALAMA\n");
		for(i=0;i<ogrencisayisi;i++){
        fprintf(dosya2,"%s\t",ogr[i].ad);
        fprintf(dosya2,"%s\t",ogr[i].soyad);
        fprintf(dosya2,"%d\t",ogr[i].okulno);
        fprintf(dosya2,"\n");
    }
    fprintf(dosya2,"\n");
	}
	fprintf(dosya2,"\n");
   fclose(dosya2);
}

void fizik_notuna_gore_sirala(FILE *dosya2,int ogrencisayisi,ogrenciler *ogr){
	int i;
	for(i=0;i<ogrencisayisi;i++){
	ogr[i].fizikort=0.6*(ogr[i].fizikfinal)+0.4*(ogr[i].fizikvize);
}
	for(i=0;i<ogrencisayisi;i++){
		if(ogr[i].fizikort>ogr[i+1].fizikort){
			int temp=ogr[i].fizikort;
			ogr[i].fizikort=ogr[i+1].fizikort;
			ogr[i+1].fizikort=temp;
		}
		fprintf(dosya2,"FIZIK ORTALAMASINA GORE SIRALAMA\n");
		for(i=0;i<ogrencisayisi;i++){
        fprintf(dosya2,"%s\t",ogr[i].ad);
        fprintf(dosya2,"%s\t",ogr[i].soyad);
        fprintf(dosya2,"%d\t",ogr[i].okulno);
        fprintf(dosya2,"\n");
    }
    fprintf(dosya2,"\n");
	}
	fprintf(dosya2,"\n");
   fclose(dosya2);
}

void okul_noya_gore_sirala( int ogrencisayisi,FILE *dosya2,ogrenciler *ogr){
	int i;
	for(i=0;i<ogrencisayisi;i++){
		if(ogr[i].okulno>ogr[i+1].okulno){
			int temp=ogr[i].okulno;
			ogr[i].okulno=ogr[i+1].okulno;
			ogr[i+1].okulno=temp;
		}
		fprintf(dosya2,"OKUL NOSUNA GORE SIRALAMA\n");
		for(i=0;i<ogrencisayisi;i++){
        fprintf(dosya2,"%s\t",ogr[i].ad);
        fprintf(dosya2,"%s\t",ogr[i].soyad);
        fprintf(dosya2,"%d\t",ogr[i].okulno);
        fprintf(dosya2,"\n");
    }
    fprintf(dosya2,"\n");
	}
	fprintf(dosya2,"\n");
	fclose(dosya2);
}
void genele_gore_sirala(FILE *dosya2,int ogrencisayisi,ogrenciler *ogr){
	int i;
	for(i=0;i<ogrencisayisi;i++){
		if(ogr[i].genelort>ogr[i+1].genelort){
			int temp=ogr[i].genelort;
			ogr[i].genelort=ogr[i+1].genelort;
			ogr[i+1].genelort=temp;
		}
		fprintf(dosya2,"GENEL ORTALAMAYA GORE SIRALAMA\n");
		for(i=0;i<ogrencisayisi;i++){
        fprintf(dosya2,"%s\t",ogr[i].ad);
        fprintf(dosya2,"%s\t",ogr[i].soyad);
        fprintf(dosya2,"%d\t",ogr[i].okulno);
        fprintf(dosya2,"\n");
    }
    fprintf(dosya2,"\n");
	}
	fprintf(dosya2,"\n");
   fclose(dosya2);
}

int main(){
	FILE *dosya2=fopen("hedefdosya.txt","w");
	if(dosya2==NULL){
		printf("Dosya acilirken bir hata meydana geldi.");
	}
	bilgilerigir(dosya2);
	fclose(dosya2);
	return 0;
	
}
