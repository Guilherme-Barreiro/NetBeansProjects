#include <stdio.h>
int main() {
    int a = 2, b = 4, c = 3, d;
    d = (((a = a + 1) + ++b) * c++) % (2 * c);
    printf("%d, %d, %d, %d", a, b, c, d);
    // 3, 5, 4, 0
    return 0;
}