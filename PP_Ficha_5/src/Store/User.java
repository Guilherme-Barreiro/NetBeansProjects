/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

/**
 *
 * @author Utilizador
 */
public class User {
    public int id;
    public String nome;
    public String idade;
    public String email;
    public static int nextId = 1;

    public User(String nome, String idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
        id = nextId++;
    }
    
    
}
