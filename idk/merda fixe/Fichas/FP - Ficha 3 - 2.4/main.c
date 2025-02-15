#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, isit, n;
    i = isit = 0;
    printf("\nInsira o número: ");
    scanf("%d", &n);
    for (i = 2; i <= n; i++) 
        if (n % i == 0) 
            isit++;
    
    isit == 1 ? printf("É primo") : printf("O número %d não é primo", n);
    
    return 0;
}