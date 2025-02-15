#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, j, n, contador;
    contador = 0;
    int array[4][5];
    for(i = 0; i < 4; i++){
        for(j = 0; j < 5; j++){
            printf("Introduza o valor a introduzir na posição[%d][%d]: ", i, j);
            scanf("%d", &array[i][j]);
        }
    }
    
    printf("Introduza o número a verificar: ");
    scanf("%d", &n);
    
    for(i = 0; i < 4; i++){
        for(j = 0; j < 5; j++){
            if(array[i][j] == n) contador++;
        }
    }
    printf("Introduziu %d vezes o número %d!", contador, n);
    return 0;
}

