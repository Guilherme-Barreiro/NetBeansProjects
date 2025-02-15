#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define ARRAY_SIZE 3

int main() {
    int i, j;
    int array[ARRAY_SIZE][ARRAY_SIZE];
    int array_original[ARRAY_SIZE][ARRAY_SIZE];
    int op;
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("Introduza o valor a introduzir na posição[%d][%d]: ", i, j);
            scanf("%d", &array[i][j]);
        }
    }
    
    // copiar o array  para array_original
    for (i = 0; i < ARRAY_SIZE; i++) for (j = 0; j < ARRAY_SIZE; j++) array_original[i][j] = array[i][j];
            
    printf("Introduza quanto pretende rodar a matriz (90, 180 ou 270): ");
    scanf("%d", &op);
    switch(op){
        case 90:
            for(i = 0; i < ARRAY_SIZE; i++) for(j = 0; j < ARRAY_SIZE; j++) array[j][ARRAY_SIZE-i-1] = array_original[i][j];
            break;
        case 180:
            for(i = 0; i < ARRAY_SIZE; i++) for(j = 0; j < ARRAY_SIZE; j++) array[j][i] = array_original[i][j];
            break;
        case 270:
            for(i = 0; i < ARRAY_SIZE; i++) for(j = 0; j < ARRAY_SIZE; j++) array[i][j] = array_original[j][ARRAY_SIZE-i-1];
            break;
        default:
            puts("Erro!");
    }

    puts("\nMatriz Original: ");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("%d ", array_original[i][j]);
        }
        printf("\n");
    } 
    
    puts("\nNova Matriz: ");
    for(i = 0; i < ARRAY_SIZE; i++){
        for(j = 0; j < ARRAY_SIZE; j++){
            printf("%d ", array[i][j]);
        }
        printf("\n");
    } 
    
    return 0;
}

