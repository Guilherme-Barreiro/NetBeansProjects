package Ficha_3;
import java.lang.Math;

public class ex4 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Insira um número em radianos.");
            return;
        }
        
        double radianos = Double.parseDouble(args[0]);
        System.out.println(radianos * Math.PI / 180);
    }
}
