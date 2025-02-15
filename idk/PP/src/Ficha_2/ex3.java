package Ficha_2;
public class ex3 {
    public static void main(String[] args) {
        int[] lista = {12, 5, -21, 10, -345, 22, 50, -125, 80, -1};
        int multi = 1;
        for (int i = 0; i < lista.length; i++)
            if(lista[i] > 0) 
                multi *= lista[i];
        System.out.println("Multiplicação: " + multi);
        
        int nNegativos = 0;
        for (int i = 0; i < lista.length; i++)
            if(lista[i] < 0) 
                nNegativos++;
        System.out.println("Número de elementos negativos: " + nNegativos);
        
        int maior = -999999999;
        for (int i = 0; i < lista.length; i++)
            if(maior < lista[i]) 
                maior = lista[i];
        System.out.println("Maior número: " + maior);
  
    }
}
