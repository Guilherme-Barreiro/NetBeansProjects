#include <stdio.h>
#include <stdlib.h>
#define ARRAY_SIZE 3
int req_number(int i, int j){
    int n;
    printf("Introduza o valor a introduzir na posição[%d][%d]: ", i, j);
    scanf("%d", &n);
    return n;
}

int main() {
    int i, j;
    int a[ARRAY_SIZE][ARRAY_SIZE];
    int b[ARRAY_SIZE][ARRAY_SIZE];
    int soma[ARRAY_SIZE][ARRAY_SIZE];

    
    puts("Dados da primeira matriz:");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            a[i][j] = req_number(i, j);
        }
    }
    puts("\nMatriz A:");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("%d ", a[i][j]);
        }
        printf("\n");
    }



    puts("\n\nDados da segunda matriz:");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            b[i][j] = req_number(i, j);
        }
    }
    puts("\nMatriz B:");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("%d ", b[i][j]);
        }
        printf("\n");
    }


    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            soma[i][j] = a[i][j] + b[i][j];
        }
    }

    puts("\n\nMatriz Resultante:");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("%d ", soma[i][j]);
        }
        printf("\n");
    }
}