/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_ficha_5;

/**
 *
 * @author guiba
 */
public class User {

    protected final int EXPENSES_SIZE = 31;
    protected int id;
    protected String nome;
    protected String email;
    protected String birthDate;
    protected Expense[] expenses;
    protected static int nextId = 0;

    public User(String tempNome, String tempEmail, String tempBirthDate) {
        expenses = new Expense[EXPENSES_SIZE];
        id = nextId++;
        nome = tempNome;
        email = tempEmail;
        birthDate = tempBirthDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append("\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Email: ").append(email).append("\n");
        sb.append("Data de Nascimento: ").append(birthDate).append("\n");
        sb.append("Despesas:\n");

        for (Expense exp : expenses) {
            if (exp != null) {
                sb.append("  - ").append(exp).append("\n");
            }
        }

        return sb.toString();
    }

}
