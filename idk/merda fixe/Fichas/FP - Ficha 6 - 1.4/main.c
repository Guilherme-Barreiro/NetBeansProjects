#include <stdio.h>
#include <stdlib.h>
#include <math.h>

int req_number_int(int num) {
    int n;
    printf("Introduza o %dº valor: ", num);
    scanf("%d", &n);
    return n;
}

void ordenar(int *v1, int *v2, int *v3) {
    int menor, meio, maior;
    if ((*v1) < (*v2) && (*v2) < (*v3)) { // v1 < v2 < v3
        menor = *v1;
        meio = *v2;
        maior = *v3;
    }
    if ((*v1) < (*v3) && (*v3) < (*v2)) { // v1 < v3 < v2
        menor = *v1;
        meio = *v3;
        maior = *v2;
    }
    if ((*v2) < (*v1) && (*v1) < (*v3)) { // v2 < v1 < v3
        menor = *v2;
        meio = *v1;
        maior = *v3;
    }
    if ((*v2) < (*v3) && (*v3) < (*v1)) { // v2 < v3 < v1
        menor = *v2;
        meio = *v3;
        maior = *v1;
    }
    if ((*v3) < (*v1) && (*v1) < (*v2)) { // v3 < v1 < v2
        menor = *v3;
        meio = *v1;
        maior = *v2;
    }
    if ((*v3) < (*v2) && (*v2) < (*v1)) { // v3 < v2 < v1
        menor = *v3;
        meio = *v2;
        maior = *v1;
    }
    (*v1) = menor;
    (*v2) = meio;
    (*v3) = maior;
    
}

int main() {
    int v1, v2, v3;
    v1 = req_number_int(1);
    v2 = req_number_int(2);
    v3 = req_number_int(3);
    printf("\nv1: %d\nv2: %d\nv3: %d", v1,v2,v3);
    ordenar(&v1, &v2, &v3);
    printf("\n\nv1: %d\nv2: %d\nv3: %d", v1,v2,v3);
    return 0;
}
