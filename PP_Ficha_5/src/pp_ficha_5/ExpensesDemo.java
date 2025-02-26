/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_ficha_5;

/**
 *
 * @author guiba
 */
public class ExpensesDemo {

    /**
     * @param args the command line arguments
     */
    User user1, user2;

    public static void main(String[] args) {

        User user1 = new User("roberto", "roberto@gmail.com", "01-01-2000");
//        System.out.println(user1.nome);
//        System.out.println(user1.email);
//        System.out.println(user1.birthDate);
        Expense exp1 = new Expense("Carro", 5000, "10/02/2025");
        user1.expenses[0] = exp1;

        Expense exp2 = new Expense("Mota", 1000, "01/02/2025");
        user1.expenses[1] = exp2;

        for (Expense exp : user1.expenses) {
            if (exp != null) { // Evita imprimir posições vazias
                System.out.println(exp);
            }
        }
        System.out.println(user1);
    }

}
