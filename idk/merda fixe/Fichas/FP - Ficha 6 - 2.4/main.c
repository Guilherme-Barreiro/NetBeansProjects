#include <stdio.h>
#include <math.h>

int req_number_int(int num) {
    int n;
    printf("Introduza o %dº valor: ", num);
    scanf("%d", &n);
    return n;
}

char *strchar(char *str, char ch){
    for (; *str != '\0' ; str++) 
        if(*str == ch) 
            return str;
    return NULL;
}

int *findMax(int data[], int size){
    int maior = -2147483648;
    int cont = 0;
    for(int i = 0; i < size; i++){
        if(maior < data[i]){
            maior = data[i];
            cont = i;
        }
    }
    return &data[cont];
}

int main() {
    int array_size;
    printf("Quantos valores deseja introduzir? "); scanf("%d", &array_size);
    int array[array_size];
    for(int i = 0; i < array_size; i++) array[i] = req_number_int(i + 1);
    int *max = findMax(array, array_size);
    printf("\nEnderaço de memória do maior valor: %p", max);
    return 0;
}


