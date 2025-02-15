#include <stdio.h>
#include <stdlib.h>

int main() {
    float produto1, produto2, produto3;

    printf("Insira o preço do primeiro produto: ");
    scanf("%f", &produto1);
    printf("Insira o preço do segundo produto: ");
    scanf("%f", &produto2);    
    printf("Insira o preço do terceiro produto: ");
    scanf("%f", &produto3);
    
    printf("\nDeve pagar %.2f€", (produto1 + produto2 + produto3) * 0.9);

    return 0;
}