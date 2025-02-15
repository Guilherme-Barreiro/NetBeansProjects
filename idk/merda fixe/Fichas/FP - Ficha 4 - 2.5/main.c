#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define STRING_SIZE 30
int main() {
    int i, counter;
    char string[STRING_SIZE];
    char string_invertida[STRING_SIZE];
    counter = 0;
    
    printf("Introduza a string : ");
    fgets(string, sizeof(string), stdin); 
    
    for(i = strlen(string)-2; i > -1; i--) string_invertida[counter++] = string[i];
    
    printf("String original: %s", string);
    printf("String invertida: %s", string_invertida);
    return 0;
}