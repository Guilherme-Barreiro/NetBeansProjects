package Ficha_3;
public class ex1 {
    public static void main(String[] args) {
        int N = 3, contador = 0;
        int[][] A = new int[N][N];
        int[][] B = new int[N][N];
        
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                A[i][j] = contador++;
        
        for(int i = 0; i < N; i++)
            for(int j = 0; j < N; j++)
                B[i][j] = A[j][i];
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(A[i][j] + " ");
            }System.out.print("\n");
        }
        
        System.out.print("\n");
        
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                System.out.print(B[i][j] + " ");
            }System.out.print("\n");
        }
    }
}
