#include <stdio.h>
#include <stdlib.h>

int main() {
    int op;
    do {
        printf("1. Criar\n2. Atualizar\n3. Eliminar\n4. Sair\n");
        scanf("%d", &op);

        switch (op) {
            case 1:
                printf("Escolheu a opção %d. Criar\n\n", op);
                break;
            case 2:
                printf("Escolheu a opção %d. Atualizar\n\n", op);
                break;
            case 3:
                printf("Escolheu a opção %d. Eliminar\n\n", op);
                break;
            case 4:
                break;
            default:
                printf("Erro nigga");
        }
    } while (op != 4);
    return 0;
}