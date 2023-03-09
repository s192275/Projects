#include <time.h>
#include <stdio.h>
#include <math.h>
int main()
{
    int skor,i,miktar[6]={0,0,0,0,0,0};
    srand(time(NULL));
    for(i=0;i<1000;i++){
        skor=rand()%6;
        miktar[skor]++;
    }
    for(i=0;i<6;i++){
    	printf("%d gelen zar miktari %d dir.\n",i+1,miktar[i]);
	}
    return 0;
}

