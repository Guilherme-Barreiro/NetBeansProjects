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

int req_number_int(){
    int n;
    printf("Introduza o valor: ");
    scanf("%d", &n);
    return n;
}

int req_number_float(int i){
    float n;
    printf("Introduza o valor a introduzir na posição[%d]: ", i);
    scanf("%f", &n);
    return n;
}

float media(int array[], int j){
    float media;
    int i, total;
    total = 0;
    for(i = 0; i < j; i++) total = total + array[i];
    media = total / j;
    return media;
}

int min(int n1, int n2) {
    return (n1 < n2) ? n1 : n2;
}


int max(int n1, int n2) {
    return (n1 > n2) ? n1 : n2;
}

