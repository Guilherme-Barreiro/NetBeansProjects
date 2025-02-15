/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2;

/**
 *
 * @author guiba
 */
public class ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int negros = 0;
        double multiplication = 1;
        int maior = -9999999;
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i] > 0){
                multiplication *= lista[i];
            }else{
                negros++;
            }
            if(lista[i] > maior){
                maior = lista[i];
            }
        }
        System.out.println("multiplication " + multiplication);
        System.out.println("negros " + negros);
        System.out.println("maior "+ maior);
    }
    
}
