#include <stdio.h>
#include <stdlib.h>

int main() {
    unsigned int mao_obra_sapatos = 10;
    unsigned int custo_adicional_sapato = 3;
    float margem_lucro = 1.3;           // margem de lucro de 30%
    float desconto_cliente = 0.1;       // desconto de 10%
    unsigned int NIF, n_sapatos;
    
    float custo_total, lucro, custo_com_lucro, desconto, valor_final;
    custo_total = lucro = custo_com_lucro = desconto = valor_final = 0;

    printf("Introduza o seu NIF: ");
    scanf("%d", &NIF);
    
    printf("Introduza o número de pares de sapatos pretendidos: ");
    scanf("%d", &n_sapatos);
    
    
    custo_total = (mao_obra_sapatos + custo_adicional_sapato) * n_sapatos;
    lucro = custo_total * (margem_lucro - 1);
    custo_com_lucro = custo_total + lucro;
    desconto = custo_com_lucro * desconto_cliente;
    valor_final = custo_com_lucro - desconto;

    printf("\nO seu NIF é: %d", NIF);
    printf("\nPretende %d pares de sapatos.", n_sapatos);
    printf("\nCusto de mao de obra total é de %d€", mao_obra_sapatos * n_sapatos);
    printf("\nCusto adicional de conceção total é de %d€", custo_adicional_sapato * n_sapatos);
    printf("\nCusto total é de %.2f€", custo_total);
    printf("\nA empresa obteve %.2f€ de lucro", lucro);
    printf("\nO custo total com margem de lucro é de %.2f€", custo_com_lucro);
    printf("\nO desconto obtido pelo cliente é de %.2f€", desconto);
    printf("\nO valor a pagar pelo cliente é de %.2f€", valor_final);
    
    return 0;
}
