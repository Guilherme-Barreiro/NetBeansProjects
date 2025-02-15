#include <stdio.h>
#include <stdlib.h>

int main() {
    float comprimento, largura, raio, pi, base, altura;
    int op;
    pi = 3.1415;
    
    printf("\nSelecione a figura geométrica: ");
    printf("\n1 - Retângulo");
    printf("\n2 - Circunferência");
    printf("\n3 - Triângulo\n");
    scanf("%d", &op);
    
    switch(op){
        case 1:
            printf("Insira o comprimento: ");
            scanf("%f", &comprimento);
            printf("Insira a largura: ");
            scanf("%f", &largura);
            
            printf("\nO perímetro é %.2f", comprimento*2+largura*2);
            printf("\nA área é %.2f", comprimento*largura);
            break;
        case 2:
            printf("Insira o raio: ");
            scanf("%f", &raio);
            
            printf("\nA área é %.2f", pi*raio*raio);            
            break;
        case 3:
            printf("Insira a base: ");
            scanf("%f", &base);
            printf("Insira a altura: ");
            scanf("%f", &altura);
            
            printf("\nA área é %.2f", base*altura/2);
            break;
        default:
            printf("\nNão introduziu uma opção válida...");
    }       
    return 0;
}