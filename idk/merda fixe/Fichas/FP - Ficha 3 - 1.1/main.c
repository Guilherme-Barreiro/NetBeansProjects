#include <stdio.h>
#include <stdlib.h>

int main() {
    int i, start;
    char letra;
    printf("Quer maiusculas ou minusculas? (M/m)");
    scanf(" %c", &letra);
    switch (letra){
        case 'm':
            start = 97;
            for (i = start; i < start+26; i++) {
                letra = i;
                printf("\n%c", letra);
            }
            break;
            
        case 'M':
            start = 65;
            for (i = start; i < start+26; i++) {
                letra = i;
                printf("\n%c", letra);
            }
            break;
            
        default:
            printf("Erro nigga!");
    }
    return 0;
}

