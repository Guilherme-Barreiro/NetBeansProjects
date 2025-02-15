#include <stdio.h>
#include <stdlib.h>

int main() {
    int valor1, valor2, valor3;
    valor1 = 1;
    valor2 = 2;
    
    valor3 = valor1;
    valor1 = valor2;
    valor2 = valor3;
    
    printf("\n valor1 = %d", valor1);    
    printf("\n valor2 = %d", valor2);

    return 0;
}