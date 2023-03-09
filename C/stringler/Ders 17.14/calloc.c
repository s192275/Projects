#include <stdlib.h>
#include <stdio.h>

int main()
{
    int boyut;
    printf("Lutfen dizinin boyutunu seciniz:");
    scanf("%d",&boyut);
    int *a= (int*) calloc(boyut,sizeof(int)); //Ne tutuyorsa hepsini 0 la baslatýr
    free(a);
    for(int i=0;i<boyut;i++){
        printf("%d ",i);
    }

    return 0;
}

