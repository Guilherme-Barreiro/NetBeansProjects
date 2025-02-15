#include <stdio.h>
#include <stdlib.h>

int main() {
    int i;
    do {
        printf("Introduza um número positivo: ");
        scanf("%d", &i);
    } while (i < 0);
    if (i % 2 == 0) i--;
    while (i > 0) {
        printf("\n%d", i);
        i = i - 2;
    }
    return 0;
}

