/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

/**
 *
 * @author guiba
 */
public class ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        String ana = "";        
        String apelido = "";
        int ii = 0;
        for(int i = 0; i < nome.length; i++){
            if(nome[i] == ' '){
                ana += nome[i];
                ii++;
            }else{
                apelido += nome[i];
            }
        }
        System.out.println(apelido + "khkh " + ana);
   
    }

}
