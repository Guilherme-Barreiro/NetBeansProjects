package Ficha_3;

public class ex3 {

    public static void main(String[] args) {
        int[][] matriz = {
            {11, 7, 333},
            {-20, -23, 63},
            {20, 23, 63},
            {-22, 501, 10000}
        };
        int[] vetor = new int[matriz.length * matriz[0].length];
        int contador = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                vetor[contador] = matriz[i][j];
                contador++;
            }
        }
        
    }
}
