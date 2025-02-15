#include <stdio.h>
#include <stdlib.h>

void asteriscoprint(int n){
    int i;
    for(i = 0; i < n; i++){
        printf("*");
    }
}

int validar(int n){
    int min, max;
    min = 0; max = 50;
    while(n < min || n > max){
        printf("Introduza um número entre %d e %d: ", min, max);
        scanf("%d", &n);
    }
    return n;
}