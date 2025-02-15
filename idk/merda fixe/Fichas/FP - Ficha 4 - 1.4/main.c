#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, j, maior, menor;
    maior = -2147483647;
    menor = 2147483647;
    int array[3][3];
    for(i = 0; i < 3; i++){
        for(j = 0; j < 3; j++){
            printf("Introduza o valor a introduzir na posição[%d][%d]: ", i, j);
            scanf("%d", &array[i][j]);
            if(maior < array[i][j]) maior = array[i][j];
            if(menor > array[i][j]) menor = array[i][j];
        }
    }
    
    for(i = 0; i < 3; i++){
        for(j = 0; j < 3; j++){
            printf("%d ", array[i][j]);
        }
        printf("\n");
    }
    printf("O maior número introduzido é %d.\n", maior);
    printf("O menor número introduzido é %d.", menor);
    return 0;
}

