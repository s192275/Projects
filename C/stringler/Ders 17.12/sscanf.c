#include <stdio.h>

int main()
{
    char string[100]; 
    int sayi1,sayi2,sayi3;
    char *n;
    sprintf(string,"%d\t%d\t%d\t%s",1,2,3,"Serhat");//sprintf komutu ile yazýlmasý gerekenleri string in içine attýk printf komutu ile de stringin içeriðini yazdýrdýk.
    sscanf(string,"%d%d%d%s",&sayi1,&sayi2,&sayi3,&n);
    printf("%s",string);
    return 0;
}

