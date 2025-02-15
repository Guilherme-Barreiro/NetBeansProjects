/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1;

/**
 *
 * @author guiba
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[][]{{11, 7, 333}, {-20, -23, 63}, {-22, 501, 10000}};
        int soma = 0;
        for(int i = 0; i < matriz.length; i++){
            for(int ii = 0; ii < matriz.length; ii++){
                soma += matriz[i][ii];
            }        
        }
        System.out.println("soma " + soma);
        System.out.println("media " + soma/9);
    }

}
