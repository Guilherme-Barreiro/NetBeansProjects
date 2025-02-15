#include <stdio.h>
#include <stdlib.h>
#include "MyIntLib.h"

float main() {
    float n1, n2;
    int op;
    printf("Mete primeiro número: ");
    scanf("%f", &n1);
    printf("Mete segundo número: ");
    scanf("%f", &n2);
    printf("1 - adição\n2 - subtração\n3 - multiplicação\n4 - divisão");
    scanf("%d", &op);
    switch(op){
        case 1:
            printf("%.2f", adicao(n1, n2));
            break;
        case 2:
            printf("%.2f", subtracao(n1, n2));
            break;
        case 3:
            printf("%.2f", multiplicacao(n1, n2));
            break;
        case 4:
            printf("%.2f", divisao(n1, n2));
            break;
        default:
            puts("Erro");
    }
    return 0;
}

