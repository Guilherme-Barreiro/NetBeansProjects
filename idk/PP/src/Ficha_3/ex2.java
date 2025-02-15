package Ficha_3;

public class ex2 {

    public static void main(String[] args) {
        int[] vetor = {2, 5, 121, 102, 35, 2, 0, 125, 802, 10, 7, 8, 28, 97};
        int[] nDivisores = new int[vetor.length];
        int[][] divisores = new int[vetor.length][vetor.length];
        int contador = 0;
        int[] perfeito = new int[vetor.length];

        for (int i = 0; i < vetor.length; i++) 
            nDivisores[i] = 0;

        for (int i = 0; i < vetor.length; i++) {
            contador = 0;
            for (int j = 1; j < vetor[i]; j++) {
                if (vetor[i] % j == 0) {
                    nDivisores[i]++;
                    divisores[i][contador++] = j;
                }
            }
        }

//        for(int i = 0; i < vetor.length; i++)
//            System.out.println(nDivisores[i]);

//        System.out.println("\n\n");

//        for(int i = 0; i < nDivisores.length; i++){
//            System.out.println("\n" + vetor[i] + ": ");
//            for(int j = 0; j < divisores.length; j++){
//                if(divisores[i][j] != 0){
//                    System.out.println(divisores[i][j]);
//                }
//            }
//        }

        for (int i = 0; i < nDivisores.length; i++) 
            if (nDivisores[i] == 1) 
                System.out.println("O número " + vetor[i] + " é primo!");

        System.out.println("");
        
        for(int i = 0; i < vetor.length; i++){
            for(int j = 0; j < vetor.length; j++)
                perfeito[i] = perfeito[i] + divisores[i][j];
            if (perfeito[i] == vetor[i]) 
                System.out.println("O número " + vetor[i] + " é perfeito!");
        }
    }
}
