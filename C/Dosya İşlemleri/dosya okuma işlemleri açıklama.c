/*
#include <stdio.h>

int main()
{
    FILE //Dosyay� bir pointer okuyaca�� i�in file struct�na bir pointer ekle
    fopen():Dosyay� olu�turmak veya a�mak i�in(�nce bu komut girilmelidir.)
    fclose():Dosyay� kapatmak i�in
    fprintf():Dosyaya formatl� yazd�rmak i�in
    fscanf():Dosyadan formatl� okumak i�in
    fputs:Dosyaya katar yazd�rmak i�in
    fgets:Dosyadan katar okumak i�in
    fwrite():Dosyaya dizi yazmak i�in
    fread():Dosyadan dizi okumak i�in
    fseek():Verilere rastgele eri�im i�in
    feof():Dosya sonuna gelip gelmedi�inin sorgulanmas� i�in
    putc getc--------------->Dosya �zerinde birer karakter okumam� sa�layan fonksiyonlard�r.
    fputc fgetc------------->Yukar�dakinin ayn�s�
    end of file=eof
    ----------------------------------------------------------------------------
    FILE *ic_dosya_adi;(��aret�i var olmayan bir i�aret�idir ve dosya i�inde i�lemler yapman� sa�lar.)
    
    FILE *di;
    di=fopen("ogrenci.txt",r);
    fopen(dosyan�n ad�,dosya a�ma modu(Kodla ayn� dizinde de�ilse adresine g�re gitmek i�in b�t�n uzant�y� vermen gerekir.))
    fopen("ogrenci.txt",r);---->Okumak i�in a�ar
    fopen("ogrenci.txt",w)------>Yazma ve dosya yaratma
    fopen("ogrenci.txt",a)---->Sonuna ekleme yoksa dosya olu�turur
    fopen("ogrenci.txt",r+)-------->Okuma ve yazma
    fopen("ogrenci.txt",w+)-------->Okuma yazma ve dosya yaratma(�nceki veriler silinir)
    fopen("ogrenci.txt",a+)-------->Okuma yazma ve dosya yaratma (�nceki verilerin sonuna devam edililir.)
    ----------------------------------------------------------------------------
    FILE *ogrencidosyasi;
    ogrencidosyasi=fopen("test.txt","w");
    if(ogrencidosyasi=='\0'){
        printf("Dosya acilamadi.");
    }
    fclose(ogrencidosyasi);
    ----------------------------------------------------------------------------
    fgetc(ic_dosya_adi);     ��aret�inin o an g�sterdi�i karakterin al�nmas�n� sa�lar
    FILE *dosyaOku;
    dosyaOku=fopen("input.txt","r");
    char ch;
    ch=fgetc(dosyaOku);
    printf("Dosyadaki ilk karakter:%c\n",ch);
    ----------------------------------------------------------------------------
    fgets() �oklu veri �ekmi�g�r.Bir dosyadan katar okunmas� i�in kullan�l�r
    fscanf(isaretci,format,.....);
    return 0;

}*/

