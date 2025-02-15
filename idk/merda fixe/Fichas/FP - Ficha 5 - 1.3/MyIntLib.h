#include <stdio.h>
#include <stdlib.h>

float adicao(float n1, float n2){
    return n1 + n2;
}
float subtracao(float n1, float n2){
    return n1 - n2;
}
float multiplicacao(float n1, float n2){
    return n1 * n2;
}
float divisao(float n1, float n2){
    if(n2 != 0) return n1 / n2;
    return 1;
}