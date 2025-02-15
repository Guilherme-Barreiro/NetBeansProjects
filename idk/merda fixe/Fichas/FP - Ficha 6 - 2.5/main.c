#include <stdio.h>

void swap(int x, int y) {
    int tmp = *x;
    x = y;
    y = tmp;
}

void swap_pointers(char x, char y) {
    char tmp;
    tmp = x;
    x = y;
    y = tmp;
}

int main() {
    int a = 0, b = 1;
    char s1 = "da programação", s2 = "Fundamentos";
    swap(&a, &b);
    printf("a: %d\n", a);
    printf("b: %d\n", b);
    swap_pointers(s1, s2);
    printf("%s %s\n", s1, s2);
    return 0;
}