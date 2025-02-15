package Ficha_2;
public class ex2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {11, 7, 333},
            {-20, -23, 63},
            {-22, 501, 10000}
        };   
        
        int soma = 0;
        float media = 0;
        
        for(int i = 0; i < 3; i++)
            for(int j = 0; j < 3; j++)
                soma = soma + matriz[i][j];
        
        media = soma / 9;
        System.out.println(soma);
        System.out.println(media);
    }
}
