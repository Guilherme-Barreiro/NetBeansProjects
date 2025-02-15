#include <stdio.h>
#include <stdlib.h>

int main() {
    char cha;
    printf("Insira o char: ");
    scanf(" %c", &cha);
    
    printf("O sucessor é %c", cha+1);
    printf("\n%d", (int)cha);
    printf("\nO antecessor é %c", cha-1);
    
    return 0;
}

