#include <stdio.h>
#include <stdlib.h>
int main(){
    int *ip,id;
    ip=(int*)malloc(sizeof(int)*5);
    for(id=0;id<5;id++){
        *(ip+id) = id+1;
       printf("%p adresindeki deðer: %d\n", (ip+id), *(ip+id));
    }
    ip=(int*)realloc(ip,10*sizeof(int));
    printf("\nGenisletilmis bellek degerleri:\n");
    for (id=5 ; id<10; id++) { // Burada id deðiþken deðeri 5 olarak baþlar.
       *(ip+id) = id+1;
       printf("%p adresindeki deðer: %d\n", (ip+id), *(ip+id));
  }

  free(ip);
    
    
    
    
    
    return 0;
}
