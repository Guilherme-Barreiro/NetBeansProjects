#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    int i, cont;
    cont = 0;
    char string1[30];
    char string2[30];
    
    printf("Introduza a primeira string : ");
    fgets(string1, sizeof(string1), stdin); 
    
    printf("Introduza a segunda string : ");
    fgets(string2, sizeof(string2), stdin);
    
    for(i = 0; i < strlen(string1); i++) if(string1[i] != string2[i]) cont++;
    if(strlen(string1) != strlen(string2)) cont++;
    
    puts((cont == 0) ? "São iguais" : "Não são iguais");
    return 0;
}