#include <stdio.h>
#include <stdlib.h>
#define ARRAY_SIZE 3
int main() {
    int i, j;
    int a[ARRAY_SIZE][ARRAY_SIZE];
    int b[ARRAY_SIZE][ARRAY_SIZE];

    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("Introduza o valor a introduzir na posição[%d][%d]: ", i, j);
            scanf("%d", &a[i][j]);
            b[j][i] = a[i][j];
        }
    }

    puts("\nMatriz A:");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }    

    puts("\nMatriz B:");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("%d ", b[i][j]);
        }
        printf("\n");
    }
    return 0;
}

