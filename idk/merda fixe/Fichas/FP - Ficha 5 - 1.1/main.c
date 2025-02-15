#include <stdio.h>
#include <stdlib.h>
void asteriscoprint(int n){
    int i;
    for(i = 0; i < n; i++){
        printf("*");
    }
}
int main() {
    int n;
    printf("Mete número: ");
    scanf("%d", &n);
    asteriscoprint(n);
    return 0;
}

