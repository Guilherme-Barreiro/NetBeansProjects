package Ficha_4;

public class ex1 {

    static User user1, user2;

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

    }
}