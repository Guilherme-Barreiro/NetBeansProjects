#include <stdio.h>
#include <stdlib.h>

int main() {
    int voto, c0, c1, c2, c3, c4, c5, c9, totalvotos;
    totalvotos = c0 = c1 = c2 = c3 = c4 = c5 = c9 = 0;
    do {
        do {
            puts("\n 0 - Voto em Branco\n 1 - Candidato 1\n 2 - Candidato 2\n 3 - Candidato 3\n 4 - Candidato 4\n 5 - Candidato 5\n 9 - Voto Nulo\n-1 - Sair");
            scanf("%d", &voto);
        } while (!(voto == 0 || voto == 1 || voto == 2 || voto == 3 || voto == 4 || voto == 5 || voto == 9 || voto == -1));

        switch (voto) {
            case 0:
                c0++;
                totalvotos++;
                break;
            case 1:
                c1++;
                totalvotos++;
                break;
            case 2:
                c2++;
                totalvotos++;
                break;
            case 3:
                c3++;
                totalvotos++;
                break;
            case 4:
                c4++;
                totalvotos++;
                break;
            case 5:
                c5++;
                totalvotos++;
                break;
            case 9:
                c9++;
                totalvotos++;
                break;
            case -1:
                break;
            default: 
                voto = 0;
                break;
        }
    } while (voto != -1);

    if (totalvotos != 0) {
        printf("Total de votos: %d\n", totalvotos);
        printf("Percentagem de votos do Candidato 1 %.2f%%\n", (float)c1/(float)totalvotos*100);
        printf("Percentagem de votos do Candidato 2 %.2f%%\n", (float)c2/(float)totalvotos*100);
        printf("Percentagem de votos do Candidato 3 %.2f%%\n", (float)c3/(float)totalvotos*100);
        printf("Percentagem de votos do Candidato 4 %.2f%%\n", (float)c4/(float)totalvotos*100);
        printf("Percentagem de votos do Candidato 5 %.2f%%\n", (float)c5/(float)totalvotos*100);
        printf("Percentagem de votos nulos %.2f%%\n", (float)c9/(float)totalvotos*100);
        printf("Percentagem de votos em branco %.2f%%\n", (float)c0/(float)totalvotos*100);
    }
    return 0;
}