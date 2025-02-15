#include <stdio.h>
#include <stdlib.h>
#include <time.h>

#define CUSTO_MAO_DE_OBRA_BOTAS      7.0
#define CUSTO_MAO_DE_OBRA_SANDALIAS  4.0
#define CUSTO_MAO_DE_OBRA_SAPATOS    5.0

#define CUSTO_ADICIONAL_BOTAS        3.5
#define CUSTO_ADICIONAL_SANDALIAS    3.0
#define CUSTO_ADICIONAL_SAPATOS      3.0

#define PERC_LUCRO_BOTAS             0.4
#define PERC_LUCRO_SANDALIAS         0.25
#define PERC_LUCRO_SAPATOS           0.3
#define PERC_DESCONTO_REVENDEDOR     0.1

#define COD_PROMO                    1234
#define PERC_DESCONTO_PROMO          0.05

#define CAMP_PROMO_SANDALIAS         0.15
#define CAMP_PROMO_BOTAS             0.15

int main() {
    int codPromoAttempt, numBotas, numSapatos, numSandalias, nif, perfil;
    codPromoAttempt = numBotas = numSapatos = numSandalias = nif = perfil = 0;

    float total, totalCampPromoBotas, totalCampPromoSandalias, totalCodPromo, totalDescontoRevendedor, totalMaoObra, totalCustoAdicional, lucroTotal, custoTotalBotas, lucroBotas, totalBotas, custoTotalSandalias, lucroSandalias, totalSandalias, custoTotalSapatos, lucroSapatos, totalSapatos;
    total = totalCampPromoBotas = totalCampPromoSandalias = totalCodPromo = totalDescontoRevendedor = totalMaoObra = totalCustoAdicional = lucroTotal = custoTotalBotas = lucroBotas = totalBotas = custoTotalSandalias = lucroSandalias = totalSandalias = custoTotalSapatos = lucroSapatos = totalSapatos = 0;

    time_t t = time(NULL);
    int current_month = localtime(&t)->tm_mon + 1;
    
    puts("Qual o seu perfil? Revendedor (1) ou Cliente final(2): ");
    scanf("%d", &perfil);

    puts("Introduza NIF: ");
    scanf("%d", &nif);
    
    puts("Introduza número de Botas: ");
    scanf("%d", &numBotas);
    custoTotalBotas = numBotas * (CUSTO_MAO_DE_OBRA_BOTAS * 2 + CUSTO_ADICIONAL_BOTAS);
    lucroBotas = custoTotalBotas * PERC_LUCRO_BOTAS;
    totalBotas = custoTotalBotas + lucroBotas;
    if(current_month > 3 && current_month < 9){
        totalCampPromoBotas = totalBotas * CAMP_PROMO_BOTAS;
        totalBotas -= totalCampPromoBotas;
    }

    puts("Introduza número de Sandalias: ");
    scanf("%d", &numSandalias);
    custoTotalSandalias = numSandalias * (CUSTO_MAO_DE_OBRA_SANDALIAS * 2 + CUSTO_ADICIONAL_SANDALIAS);
    lucroSandalias = custoTotalSandalias * PERC_LUCRO_SANDALIAS;
    totalSandalias = custoTotalSandalias + lucroSandalias;
    if(current_month > 0 && current_month < 4){
        totalCampPromoSandalias = totalSandalias * CAMP_PROMO_SANDALIAS;
        totalSandalias -= totalCampPromoSandalias;
    }
        
    puts("Introduza número de Sapatos: ");
    scanf("%d", &numSapatos);
    custoTotalSapatos = numSapatos * ((CUSTO_MAO_DE_OBRA_SAPATOS*2) + CUSTO_ADICIONAL_SAPATOS);
    lucroSapatos = custoTotalSapatos * PERC_LUCRO_SAPATOS;
    totalSapatos = custoTotalSapatos + lucroSapatos;
    
    total = totalBotas + totalSandalias + totalSapatos;
    totalMaoObra = (numBotas * CUSTO_MAO_DE_OBRA_BOTAS * 2) + (numSandalias * CUSTO_MAO_DE_OBRA_SANDALIAS * 2) + (numSapatos * CUSTO_MAO_DE_OBRA_SAPATOS * 2);
    totalCustoAdicional = (numBotas * CUSTO_ADICIONAL_BOTAS) + (numSandalias * CUSTO_ADICIONAL_SANDALIAS) + (numSapatos * CUSTO_ADICIONAL_SAPATOS);
    lucroTotal = lucroBotas + lucroSandalias + lucroSapatos;
    
    if (numSapatos+numSandalias+numBotas != 0) {
        switch (perfil) {
            case 1: // Revendedor 
                totalDescontoRevendedor = total * PERC_DESCONTO_REVENDEDOR;
                total -= totalDescontoRevendedor;
                break;
                
            case 2: // Cliente Final
                puts("Possui um codigo promocional? (Se não introduza 0)");
                scanf("%d", &codPromoAttempt);
                if(codPromoAttempt == COD_PROMO) {
                    totalCodPromo = total * PERC_DESCONTO_PROMO;
                    total -= totalCodPromo;
                }
                break;
                
            default:
                puts("As opções eram 1 ou 2...");
        }
        printf("NIF: %d\n", nif);
        printf("Pares de sapatos: %d\n", numSapatos);
        printf("Total da encomenda: %.2f\n", total);
        printf("Custos de mão de obra: %.2f\n", totalMaoObra);
        printf("Custos adicionais: %.2f\n", totalCustoAdicional);
        printf("Lucro: %.2f\n", lucroTotal);
        if(perfil == 1) printf("Desconto de revendedor: %.2f\n", totalDescontoRevendedor);
        if(perfil == 2) printf("Desconto de codigo promocional: %.2f\n", totalCodPromo);
        if(numBotas > 0) printf("Desconto de campanha promocional: %.2f\n", totalCampPromoBotas);
        if(numSandalias > 0) printf("Desconto de campanha promocional: %.2f\n", totalCampPromoSandalias);
    }else{
        puts("Não pode comprar 0 pares de sapatos...");
    }
    return 0;
}
