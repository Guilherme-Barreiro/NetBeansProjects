/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_ficha_4;

import exchange.CurrencyRates;

/**
 *
 * @author guiba
 */
public class PP_Ficha_4 {

    /**
     * @param args the command line arguments
     */
    static User user1, user2;
    static Expenses expenses;
    static CurrencyRates rates;

    public static void main(String[] args) {

        user1.id[0] = 'A';
        user1.id[1] = 'B';
        user1.id[2] = 'C';
        user1.nome = new char[]{'B', 'r', 'u', 'n', 'o'};
        user1.email = new char[]{'b', 'm', 'o', '@', 'e', 's', 't', 'g', 'f', '.', 'i', 'p', 'p', '.', 'p', 't'};

//        System.out.println("-------User 1-------");
//        System.out.print("ID:");
//        System.out.println(user1.id);
//        System.out.print("Name:");
//        System.out.println(user1.nome);
//        System.out.print("Email:");
//        System.out.println(user1.email);
        user1.expenses.number1 = '1';
        user1.expenses.carValues[0] = 1;
        user1.expenses.descriptionCar = new char[]{'C', 'A', 'R', 'C', 'C', 'C'};
        user1.expenses.number2 = '1';
        user1.expenses.foodValues[0] = 1;
        user1.expenses.descriptionFood = new char[]{'C', 'A', 'R'};;

//        System.out.println("\n\nuser1");
//        System.out.println(user1.expenses.number1);
//        System.out.println(user1.expenses.carValues[0]);
//        System.out.println(user1.expenses.descriptionCar[0]);
//        System.out.println(user1.expenses.number2);
//        System.out.println(user1.expenses.foodValues[0]);
//        System.out.println(user1.expenses.descriptionFood[0]);
        user2.expenses.number1 = '2';
        user2.expenses.carValues[1] = 2;
        user2.expenses.descriptionCar = new char[]{'a', 'a', 'a', 'a', 'a'};
        user2.expenses.number2 = '2';
        user2.expenses.foodValues[1] = 2;
        user2.expenses.descriptionCar = new char[]{'B', 'B', 'B', 'B', 'B', 'B'};

//        System.out.println("\n\nuser2");
//        System.out.println(user2.expenses.number1);
//        System.out.println(user2.expenses.carValues[0]);
//        System.out.println(user2.expenses.number2);
//        System.out.println(user2.expenses.foodValues[0]);
//
//        System.out.println("\n\nuser1");
//        System.out.println(user1.expenses.number1);
//        System.out.println(user1.expenses.carValues[0]);
//        System.out.println(user1.expenses.number2);
//        System.out.println(user1.expenses.foodValues[0]);
        double somaDespesas = 0.0;
        for(int i = 0; i < 31; i++){
            somaDespesas = somaDespesas += user1.expenses.carValues[i];
        }
        System.out.println("total: " + somaDespesas);
        
        System.out.println("Despesas user em dolar: " + somaDespesas * rates.conversion_euro_dolar);
        System.out.println("Despesas user em iene: " + somaDespesas * rates.conversion_euro_iene);
        System.out.println("Despesas user em GBP: " + somaDespesas * rates.conversion_euro_GBP);
    }
}
