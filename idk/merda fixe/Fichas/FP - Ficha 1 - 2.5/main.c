#include <stdio.h>
#include <stdlib.h>

int main() {
    int cancao1, cancao2, cancao3, cancao4, cancao5, totalemS, horas, minutos, segundos;
    horas = minutos = segundos = 0;
    
    printf("Insira a duração da primeira canção em segundos: ");
    scanf("%d", &cancao1);    
    printf("Insira a duração da segunda canção em segundos: ");
    scanf("%d", &cancao2);    
    printf("Insira a duração da terceira canção em segundos: ");
    scanf("%d", &cancao3);
    printf("Insira a duração da quarta canção em segundos: ");
    scanf("%d", &cancao4);
    printf("Insira a duração da quinta canção em segundos: ");
    scanf("%d", &cancao5);
    
    totalemS = cancao1 + cancao2 + cancao3 + cancao4 + cancao5;
    
    if(totalemS < 60){
        segundos = totalemS;
        printf("%d:%d:%d", horas, minutos, segundos);
    }else if(totalemS <= 3600){
        segundos = totalemS % 60;
        minutos = totalemS / 60;
        printf("%d:%d:%d", horas, minutos, segundos);
    }else{
        segundos = totalemS % 60;
        minutos = totalemS / 3600;
        horas = totalemS / 60 / 60;
        printf("%d:%d:%d", horas, minutos, segundos);
    }

    return 0;
}