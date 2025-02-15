#include <stdio.h>
#include <stdlib.h>

int main() {
    float i, contador, total;
    total = 0;
    i = 1;
    while(i != 0){
        printf("Introduza um numero (0 para sair): ");
        scanf("%f", &i);
        contador++;
        total = total + i;
    }
    printf("A média dos numeros introduzidos é %.2f", total/contador);
    return 0;
}

