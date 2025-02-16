
package pp_ficha_3;
import java.util.Random;

public class PP_Ficha_3 {
    public static void main(String[] args) {
        
        System.out.println("1.");
        Random random = new Random();
        int N = 3;
        int[][] matriz = new int[N][N];
        int[][] matrizTrans = new int[N][N];
        
        for(int i = 0; i < matriz.length; i++ )
            for(int j = 0; j < matriz.length; j++ )
                matriz[i][j] =  random.nextInt(89) + 10;
        
        for(int i = 0; i < matriz.length; i++ )
            for(int j = 0; j < matriz.length; j++ )
                matrizTrans[i][j] =  matriz[j][i];
        
        System.out.println("Matriz original:");
        for(int i = 0; i < matriz.length; i++ ){
            for(int j = 0; j < matriz.length; j++ )
                System.out.print(matriz[i][j]+" ");
            System.out.println("");
        }
        System.out.println("Matriz transposta:");
        for(int i = 0; i < matriz.length; i++ ){
            for(int j = 0; j < matriz.length; j++ )
                System.out.print(matrizTrans[i][j]+" ");
            System.out.println("");
        }
        
        
        System.out.println("\n2.");
        int[] vetor = new int[10]; 
        for(int i = 0; i < vetor.length; i++ ){
            vetor[i] =  random.nextInt(89) + 10;
            System.out.print(vetor[i]+ " ");
        }
    }
}
