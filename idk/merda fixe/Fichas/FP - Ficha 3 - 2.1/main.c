#include <stdio.h>
#include <stdlib.h>


int main() {
    float i, n1, n2, divisao;
    char op, continuar;
     divisao;
    do {
        printf("\nInsira o primeiro número: ");
        scanf("%f", &n1);
        printf("\nInsira o segundo número: ");
        scanf("%f", &n2);
        printf("\nInsira o operador: ");
        scanf(" %c", &op);

        switch (op) {
            case '+':
                printf("%.0f %c %.0f = %.0f", n1, op, n2, n1 + n2);
                break;
            case '-':
                printf("%.0f %c %.0f = %.0f", n1, op, n2, n1 - n2);
                break;
            case '*':
                printf("%.0f %c %.0f = %.0f", n1, op, n2, n1 * n2);
                break;
            case '/':
                divisao = n1 / n2;
                printf("%.0f %c %.0f = %.2f", n1, op, n2, divisao);
                break;
            default:
                printf("%.0f %c %.0f = %.0f", n1, op, n2, n1 + n2);
        }
        printf("\nDeseja continuar? (introduza s/n): ");
        scanf(" %c", &continuar);
    } while (continuar != 'n' && continuar != 'N');
    return 0;
}

