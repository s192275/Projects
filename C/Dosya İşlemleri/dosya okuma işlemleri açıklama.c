/*
#include <stdio.h>

int main()
{
    FILE //Dosyayý bir pointer okuyacaðý için file structýna bir pointer ekle
    fopen():Dosyayý oluþturmak veya açmak için(Önce bu komut girilmelidir.)
    fclose():Dosyayý kapatmak için
    fprintf():Dosyaya formatlý yazdýrmak için
    fscanf():Dosyadan formatlý okumak için
    fputs:Dosyaya katar yazdýrmak için
    fgets:Dosyadan katar okumak için
    fwrite():Dosyaya dizi yazmak için
    fread():Dosyadan dizi okumak için
    fseek():Verilere rastgele eriþim için
    feof():Dosya sonuna gelip gelmediðinin sorgulanmasý için
    putc getc--------------->Dosya üzerinde birer karakter okumamý saðlayan fonksiyonlardýr.
    fputc fgetc------------->Yukarýdakinin aynýsý
    end of file=eof
    ----------------------------------------------------------------------------
    FILE *ic_dosya_adi;(Ýþaretçi var olmayan bir iþaretçidir ve dosya içinde iþlemler yapmaný saðlar.)
    
    FILE *di;
    di=fopen("ogrenci.txt",r);
    fopen(dosyanýn adý,dosya açma modu(Kodla ayný dizinde deðilse adresine göre gitmek için bütün uzantýyý vermen gerekir.))
    fopen("ogrenci.txt",r);---->Okumak için açar
    fopen("ogrenci.txt",w)------>Yazma ve dosya yaratma
    fopen("ogrenci.txt",a)---->Sonuna ekleme yoksa dosya oluþturur
    fopen("ogrenci.txt",r+)-------->Okuma ve yazma
    fopen("ogrenci.txt",w+)-------->Okuma yazma ve dosya yaratma(Önceki veriler silinir)
    fopen("ogrenci.txt",a+)-------->Okuma yazma ve dosya yaratma (Önceki verilerin sonuna devam edililir.)
    ----------------------------------------------------------------------------
    FILE *ogrencidosyasi;
    ogrencidosyasi=fopen("test.txt","w");
    if(ogrencidosyasi=='\0'){
        printf("Dosya acilamadi.");
    }
    fclose(ogrencidosyasi);
    ----------------------------------------------------------------------------
    fgetc(ic_dosya_adi);     Ýþaretçinin o an gösterdiði karakterin alýnmasýný saðlar
    FILE *dosyaOku;
    dosyaOku=fopen("input.txt","r");
    char ch;
    ch=fgetc(dosyaOku);
    printf("Dosyadaki ilk karakter:%c\n",ch);
    ----------------------------------------------------------------------------
    fgets() çoklu veri çekmiþgýr.Bir dosyadan katar okunmasý için kullanýlýr
    fscanf(isaretci,format,.....);
    return 0;

}*/

