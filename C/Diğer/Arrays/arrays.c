#include <stdio.h>
#include <stdlib.h>
int main(){
    int *ip,id;
    ip=(int*)malloc(sizeof(int)*5);
    for(id=0;id<5;id++){
        *(ip+id) = id+1;
       printf("%p adresindeki de�er: %d\n", (ip+id), *(ip+id));
    }
    ip=(int*)realloc(ip,10*sizeof(int));
    printf("\nGenisletilmis bellek degerleri:\n");
    for (id=5 ; id<10; id++) { // Burada id de�i�ken de�eri 5 olarak ba�lar.
       *(ip+id) = id+1;
       printf("%p adresindeki de�er: %d\n", (ip+id), *(ip+id));
  }

  free(ip);
    
    
    
    
    
    return 0;
}
