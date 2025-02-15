#include <stdio.h>
#include <stdlib.h>

int main() {
    float n1, n2, n3;
    printf("Insira o primeiro número: ");
    scanf("%f", &n1);
    printf("Insira o segundo número: ");
    scanf("%f", &n2);    
    printf("Insira o terceiro número: ");
    scanf("%f", &n3);

    printf("\nA média dos três números é %.2f", (n1 + n2 + n3) / 3);
    printf("\nA média ponderada dos três números é %.2f", n1 * 0.2 + n2 * 0.3 + n3 * 0.5);
    printf("\nn1 -> 20%%\nn2 -> 30%%\nn3 -> 50%%");
    return 0;
}