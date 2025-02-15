#include <stdio.h>
#include <stdlib.h>

int main() {
    float n1, n2;
    printf("\nInsira o primeiro número: ");
    scanf("%f", &n1);
    printf("\nInsira o segundo número: ");
    scanf("%f", &n2);

    printf("\nA soma dos dois números é %.2f", n1 + n2);
    printf("\nA diferença dos dois números é %.2f", n1 - n2);
    printf("\nO produto dos dois números é %.2f", n1 * n2);
    printf("\nA divisão dos dois números é %.2f", n1 / n2);        
    return 0;
}