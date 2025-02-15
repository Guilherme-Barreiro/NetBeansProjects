#include <stdio.h>
#include <stdlib.h>

int main() {
    int array[10], i, maior_impar;
    maior_impar = -2147483647;
    
    for(i = 0; i < 10; i++){
        printf("Introduza o %dº numero a adicionar: ", i+1);
        scanf("%d", &array[i]);
        if(array[i] % 2 == 1) if(array[i] > maior_impar ) maior_impar = array[i];
    }
    
    if(maior_impar != -2147483647) 
        printf("O maior número impar: %d", maior_impar); 
    else 
        printf("Não foi introduzido nenhum número impar!");
    
    return 0;
}

