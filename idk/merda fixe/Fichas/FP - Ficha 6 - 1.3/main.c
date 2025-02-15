#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int req_number_int(int num) {
    int n;
    printf("Introduza o %dº valor: ", num);
    scanf("%d", &n);
    return n;
}

void somar(int n1, int n2, long *resultado){
    (*resultado) = n1 + n2;
}

int main() {
    int n1, n2;
    long resultado;
    resultado = 0;
    n1 = req_number_int(1);
    n2 = req_number_int(2);
    somar(n1, n2, &resultado);
    printf("%ld", resultado);
    return 0;
}
