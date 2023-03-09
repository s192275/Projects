#include <stdio.h>
union unionjob{
    char workersname[40];
    int workersage;
    int salary;
}ulabor;
struct structjob{
    char workersname[40];
    int workersage;
    int salary;
}slabor;

int main()
{
    printf("Size of union:%lu",sizeof(ulabor));
    printf("\nSize of struct:%lu",sizeof(slabor));

    return 0;
}

