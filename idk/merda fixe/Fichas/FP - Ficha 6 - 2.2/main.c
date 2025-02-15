#include <stdio.h>
#include <math.h>

int req_number_int(int num) {
    int n;
    printf("Introduza o %dº valor: ", num);
    scanf("%d", &n);
    return n;
}

void printFirst(char *str, int n){
    for (int i = 0; *str != '\0' && i < n; str++, i++) printf("%c", *str);
}

int main() {
    char str[] = "abcde";
    int n;
    n = req_number_int(1);
    printFirst(str, n);
    return 0;
}


