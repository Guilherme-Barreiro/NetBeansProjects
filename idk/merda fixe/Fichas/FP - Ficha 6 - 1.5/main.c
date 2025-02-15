#include <stdio.h>
#include <math.h>

int req_number_int(int num) {
    int n;
    printf("Introduza o %dº valor: ", num);
    scanf("%d", &n);
    return n;
}

int len( char *str) {
    int length = 0;
    for (; *str != '\0'; str++) length++;
    return length;
}

int main() {
    char str[] = "abcde";
    printf("%d\n", len(str));
    return 0;
}
