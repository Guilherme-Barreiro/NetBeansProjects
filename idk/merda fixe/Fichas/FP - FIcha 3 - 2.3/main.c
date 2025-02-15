#include <stdio.h>
#include <stdlib.h>

int main() {
    int np1, guess; // numero do player 1
    do {
        printf("Player 1:\n\tIntroduza um número de 0 a 100: ");
        scanf("%d", &np1);
    } while (np1 < 0 || np1 > 100);

    do {
        printf("\nPlayer 2:\n\tTente adivinhar o número de 0 a 100: ");
        scanf("%d", &guess);
        if (np1 > guess)
            printf("\tÉ Superior!\n");
        else if (np1 < guess)
            printf("\tÉ Inferior!\n");
        else
            printf("\nAcerto miseraveu!");
    } while (np1 != guess);
    return 0;
}