/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_ficha_2;

/**
 *
 * @author guiba
 */
public class PP_Ficha_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        char[] sentence = {
//            'e', 'u', ' ',
//            's', 'o', 'u', ' ',
//            'a', 'l', 'u', 'n', 'o', ' ',
//            'd', 'a', ' ',
//            'E', 'S', 'T', 'G', 'F', '.', '\n'
//        };
//
//        for (int i = 0; i < sentence.length; i++) {
//            System.out.print(sentence[i]);
//        }





//        int[][] matrix = {
//            {11, 7, 333},
//            {-20, -23, 63},
//            {-22, 501, 10000}
//        };
//        int soma = 0;
//        int cont = 0;
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix.length; j++) {
//                soma = soma + matrix[i][j];
//                cont++;
//            }
//        }
//        System.out.println("total soma: " + soma + "\nmedia: " + soma/cont);




//        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
//        int multip = 1;
//        for (int j = 0; j < lista.length; j++) {
//            if(lista[j] > 0){
//                multip = multip * lista[j];
//            }
//        }
//        System.out.println("multi: "+multip);
//        
//        
//        int negatibos = 0;
//        for (int j = 0; j < lista.length; j++) {
//            if(lista[j] < 0){
//                negatibos++;
//            }
//        }
//        System.out.println("negativos: "+negatibos);
//        
//        
//        int maoir = 0;
//        for (int j = 0; j < lista.length; j++) {
//            if(lista[j] > maoir){
//                maoir = lista[j];
//            }
//        } 
//        System.out.println("Maior: "+maoir);



//        int espaco = 0;
//        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
//        char[] apelidonome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
//        for (int j = 0; j < nome.length; j++) {
//            if(nome[j] == ' '){
//                espaco = j;
//            }
//        }
//                
//        int cont = 0;
//        for (int i = espaco; i < nome.length-1; i++, cont++) {
//            apelidonome[cont] = nome[i];
//        }
//        apelidonome[cont] = ','; cont++;
//        for (int j = 0; j < nome.length-cont+2; j++, cont++) {
//            apelidonome[cont] = nome[j];
//        }
//        
//        for (int j = 0; j < apelidonome.length; j++) {
//            System.out.print(apelidonome[j]);
//        }
//         
//        
//        int bogais = 0;
//        int consuantes = 0;
//        
//        for (int i = 0; i < nome.length; i++) {
//            if(nome[i] == 'A' || nome[i] == 'a' || 
//               nome[i] == 'E' || nome[i] == 'e' || 
//               nome[i] == 'I' || nome[i] == 'i' || 
//               nome[i] == 'O' || nome[i] == 'o' || 
//               nome[i] == 'U' || nome[i] == 'u'){
//                bogais++;
//            }else if(nome[i] != '\n' && nome[i] != ' '){
//                consuantes++;
//            }
//        }
//        System.out.println("\nconsoantes: "+consuantes+"\nbogais: "+bogais);



        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10}; 
        int[] listaB = {6, 99, -1, 12, 1, -2}; 
        int[] novaLista = new int[listaA.length + listaB.length];
        int i = 0;
        for(i = 0; i < listaA.length; i++)
            novaLista[i] = listaA[i];
        
        for(int j = 0; j < listaB.length; j++, i++)
            novaLista[i] = listaB[j];
        
        System.out.println("\nA)");
        for(i = 0; i < novaLista.length; i++)
            System.out.print(novaLista[i] + ",");
        
        int repetidos = 0;
        for(i = 0; i < listaA.length; i++)
            for(int j = 0; j < listaB.length; j++)
                if(listaA[i] == listaB[j])
                    repetidos++;
            
        System.out.println("\n\nB)");
        System.out.println("repetidos: "+repetidos); 
        
        
        int[] novoVetor = new int[listaA.length - 1];
        for(i = 0; i < listaA.length; i++)
            for(int j = 0; j < listaB.length; j++)
                if(listaA[i] == listaB[j])
                    novoVetor[i] = listaA[i];
        
        System.out.println("\nC)");
        System.out.println("repetidos: "+repetidos);
    }
}
