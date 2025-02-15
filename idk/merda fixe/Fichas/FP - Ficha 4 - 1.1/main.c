
#include <stdio.h>
#include <stdlib.h>

int main() {
    int array[10], i, soma;
    soma = 0;
    for(i = 0; i < 10; i++){
        printf("Introduza o %dº numero a adicionar: ", i+1);
        scanf("%d", &array[i]);
        soma = array[i] + soma;
    }
    printf("A soma é %d", soma);
    return 0;
}

