package Ficha_2;
public class ex5 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Insira o primeiro e último nome como argumentos.");
            return;
        }

        String primeiroNome = args[0];
        String ultimoNome = args[1];

        System.out.println(ultimoNome + ", " + primeiroNome);
    }
}
