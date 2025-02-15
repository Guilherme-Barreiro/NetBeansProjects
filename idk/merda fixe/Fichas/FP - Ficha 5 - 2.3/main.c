#include <stdio.h>
#include <stdlib.h>
#include "MyIntLib.h"

int main() {
    int n1, n2;
    n1 = req_number_int();
    n2 = req_number_int();
    
    printf("\nO valor mínimo é %d.", min(n1, n2));
    printf("\nO valor máximo é %d.", max(n1, n2));

    return 0;
}


