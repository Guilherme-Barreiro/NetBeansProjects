package Ficha_2;

public class ex6 {

    public static void main(String[] args) {
        System.out.println("Alínea A");
        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, -35, -121, 12, 1, -2};
        int[] novaLista = new int[listaA.length + listaB.length];
        int[] repetidos = new int[listaA.length + listaB.length];

        int i = 0, j = 0;

        for (i = 0; i < listaA.length; i++)
            novaLista[i] = listaA[i];

        for (j = 0; j < listaB.length; j++)
            novaLista[i + j] = listaB[j];

        for (i = 0; i < novaLista.length; i++)
            System.out.println(novaLista[i]);

        System.out.println("\nAlínea B");
        for (i = 0; i < listaA.length; i++) {
            for (j = 0; j < listaB.length; j++) {
                if (listaA[i] == listaB[j]) {
                    for (int k = 0; k < repetidos.length; k++) {
                        repetidos[k] = listaA[i];
                        break;
                    }
                }
            }
        }

        for (i = 0; i < repetidos.length; i++) 
            if (repetidos[i] != 0) 
                System.out.println(repetidos[i]);

        System.out.println("\nAlínea C");
        int[] novaListaC = new int[listaA.length];
        int countC = 0;

        for (i = 0; i < listaA.length; i++) {
            boolean found = false;
            for (j = 0; j < listaB.length; j++) {
                if (listaA[i] == listaB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) novaListaC[countC++] = listaA[i];
        }

        int[] novaListaCFinal = new int[countC];
        for (i = 0; i < countC; i++) 
            novaListaCFinal[i] = novaListaC[i];

        for (i = 0; i < novaListaCFinal.length; i++) 
            System.out.println(novaListaCFinal[i]);

        
        System.out.println("\nAlínea D");
        int count = 0;
        boolean found;
        for (i = 0; i < listaA.length; i++) {
            found = false;
            for (j = 0; j < listaB.length; j++) {
                if (listaA[i] == listaB[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) repetidos[count++] = listaA[i];
        }

        for (i = 0; i < listaB.length; i++) {
            found = false;
            for (j = 0; j < listaA.length; j++) {
                if (listaB[i] == listaA[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) repetidos[count++] = listaB[i];
        }

        novaLista = new int[count];
        for (i = 0; i < count; i++) 
            novaLista[i] = repetidos[i];

        for (i = 0; i < novaLista.length; i++) 
            System.out.println(novaLista[i]);

    }
}
