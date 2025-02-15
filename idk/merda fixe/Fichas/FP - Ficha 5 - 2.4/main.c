#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include "myIntLib.h"

int main() {
    int x, y;
    x = req_number_int();
    y = req_number_int();
    printf("\nx ^ y = %lf", potencia((double)x, y));  // Use %lf para imprimir um double
    return 0;
}
