#include <stdio.h>
#include <stdlib.h>

void foo(int a, int *aPtr) {
    printf(" a: %d\n", a);
    printf(" &a: %p\n", &a);
    printf(" aPtr: %p\n", aPtr);
    printf(" &aPtr: %p\n", &aPtr);
    a++;
    (*aPtr)++;
}

int main() {
    int a = 0;
    printf(" a: %d\n", a);
    printf(" &a: %p\n", &a);
    foo(a, &a);
    printf(" a: %d\n", a);
    return 0;
}
