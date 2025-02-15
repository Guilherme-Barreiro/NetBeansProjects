#include <stdio.h>
#include <stdlib.h>
#include "MyIntLib.h"

int main() {
    int i, j;
    printf("Quantos números deseja introduzir?: ");
    scanf("%d", &i);
    int n[i];
    
    for(j = 0; j < i; j++) n[j] = req_number_int(j);
    
    printf("A média é %.2f", media(n, i));
    return 0;
}


