#include <stdio.h>
#include <stdlib.h>

#define MAX 98560

int main() {
    int array[MAX] = {0};
    int edivisivelpor[MAX] = {0}; // array que guarda os números que dividem $n
    int i, j;
    j = 0;

    for (i = 2; i <= MAX; i++) if (MAX % i == 0) edivisivelpor[j++] = i;
    for (i = 0; i < j; i++) printf("%d\n", edivisivelpor[i]);
    
    return 0;
}
