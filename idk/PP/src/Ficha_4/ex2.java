package Ficha_4;

public class ex2 {

    static User user1, user2;
//    static Expenses Ex1;
    public static void main(String[] args) {
        user1.id[0] = '3';
        user1.id[1] = '2';
        user1.id[2] = '1';
        user1.name = new char[]{'B', 'e', 'a', 'a', 'f', 'p', 't'};
        user1.email = new char[]{'b', 'e', '@', 'a', '.', 'p', 't'};

        System.out.println("--------User 1--------");
        System.out.print("ID:");
        System.out.println(user1.id);
        System.out.print("Name:");
        System.out.println(user1.name);
        System.out.print("Email:");
        System.out.println(user1.email);
        
        user2.id[0] = 's';
        user2.id[1] = 'd';
        user2.id[2] = 'f';
        user2.name = new char[]{'B', 'e', 'a', 'a', 'f', 'p', 't'};
        user2.email = new char[]{'b', 'e', '@', 'a', '.', 'p', 't'};

        System.out.println("--------User 2--------");
        System.out.print("ID:");
        System.out.println(user2.id);
        System.out.print("Name:");
        System.out.println(user2.name);
        System.out.print("Email:");
        System.out.println(user2.email);
        
        System.out.println("\n----Cars e Food -------");
        user1.expenses.carValues[0] = 20;
        user1.expenses.carValues[1] = 200;
        user1.expenses.carValues[2] = 20;
        double totalCars = 0;
        int totalDaysCar = 0;
        for(int i = 0; i < user1.expenses.carValues.length; i++){
            if(user1.expenses.carValues[i] != 0.0){
                totalCars = totalCars + user1.expenses.carValues[i];
                totalDaysCar++;
            }
        }

        user1.expenses.foodValues[0] = 200;
        user1.expenses.foodValues[1] = 20;
        user1.expenses.foodValues[2] = 200;
        double totalFood = 0;
        int totalDaysFood = 0;
        for(int i = 0; i < user1.expenses.foodValues.length; i++){
            if(user1.expenses.foodValues[i] != 0.0){
                totalFood = totalFood + user1.expenses.foodValues[i];
                totalDaysFood++;
            }
        }
        
        double totalExpenses =  totalCars + totalFood;      
        double avgExpenses = totalExpenses/(totalDaysCar + totalDaysFood);
        System.out.println("Despesas Totais: " + totalExpenses);
        System.out.println("Despesas dos Carros: " + totalCars);
        System.out.println("Despesas da Comida: " + totalFood);
        System.out.println("Média de despesas: " + avgExpenses);
    }
}