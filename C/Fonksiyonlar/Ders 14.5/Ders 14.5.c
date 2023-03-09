#include <stdio.h>
float cevap (float,char,float);

int main()
{
    float sayi1,sayi2;
    char ch;
    printf("Lutfen birinci sayiyi seciniz:");
    scanf("%f",&sayi1);
    printf("Lutfen yapmak istediginiz islemi seciniz:");
    scanf(" %c",&ch);
    printf("Lutfen ikinci sayiyi seciniz:");
    scanf("%f",&sayi2);
    printf("%.2f     %c     %.2f     = %.2f",sayi1,ch,sayi2,cevap(sayi1,ch,sayi2));
    return 0;
}
float cevap (float sayi1,char ch,float sayi2){
    switch (ch){
        case '+':
        return sayi1+sayi2;
        break;
        case '-':
        return sayi1-sayi2;
        break;
        case '*':
        return sayi1*sayi2;
        break;
        case '/':
        return sayi1/sayi2;
        break;
        default:
        printf("Eksik veya hatali islem.");
        break;
    }
}
