#include <stdio.h>
#include <math.h>

int req_number_int(int num) {
    int n;
    printf("Introduza o %dº valor: ", num);
    scanf("%d", &n);
    return n;
}

char *strchar(char *str, char ch){
    for (; *str != '\0' ; str++) 
        if(*str == ch) 
            return str;
    return NULL;
}

int main() {
    char str[] = "abcde";
    char ch = 'd';
    char *resultado = strchar(str, ch);
    if (resultado != NULL) 
        printf("O caractere '%c' foi encontrado na posição: %ld\n", ch, resultado - str);
    else printf("O caractere '%c' não foi encontrado na string.\n", ch);
    
    return 0;
}


