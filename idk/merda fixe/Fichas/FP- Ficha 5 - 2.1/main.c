#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    printf("Mete número: ");
    scanf("%d", &n);
    n = validar(n);
    asteriscoprint(n);
    return 0;
}

