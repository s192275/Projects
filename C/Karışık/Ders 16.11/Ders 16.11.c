#include <stdlib.h>
#include <stdio.h>
#include <time.h>
int main()
{
   int vize[10],i;
   int final[10];
   float sonuc[10];
   for(i=0;i<10;i++){
       printf("Lutfen %d.vize sonucunu giriniz:",i+1);
       scanf("%d",&vize[i]);
   }
   for(i=0;i<10;i++){
       printf("Lutfen %d.final sonucunu giriniz:",i+1);
       scanf("%d",&final[i]);
   }
   printf("Girilen vizeler:\n");
   for(i=0;i<10;i++){
       printf("%d\t",vize[i]);
   }
     printf("\nGirilen finaller:\n");
   for(i=0;i<10;i++){
       printf("%d\t",final[i]);
   }
   printf("\nSonuclar:\n");
   for(i=0;i<10;i++){
       sonuc[i]=vize[i]*0.4+final[i]*0.6;
       printf("%.2f\t",sonuc[i]);
   }
    
    return 0;
}

