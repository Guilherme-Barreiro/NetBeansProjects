package pp_ficha_6;

import Enums.Tamanho;

public class Pizza {

    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private Tamanho tamanho;
    private int nIngredientes;
    private Ingrediente[] ingredientes; // (no máximo 5);
    private static int nextId = 1;

    public Pizza(String nome, String descricao, double preco, Tamanho tamanho, Ingrediente[] ingredientes) {
        this.id = nextId++;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.tamanho = tamanho;
        this.ingredientes = new Ingrediente[5];

        int count = 0;
        for (int i = 0; i < ingredientes.length && i < 5; i++) {
            if (ingredientes[i] != null) {
                this.ingredientes[count++] = ingredientes[i];
            }
        }

        this.nIngredientes = count;
    }

    public void addIngrediente(Ingrediente ingr) {
        
        
        ingredientes[nIngredientes++] = ingr;
    }

    public void removeIngrediente(Ingrediente ingr) {
        for (int i = 0; i < nIngredientes; i++) {
            if (ingredientes[i].equals(ingr)) {
                for (int j = i; j < nIngredientes-1; j++) {
                    ingredientes[j] = ingredientes[j+1];
                }
                nIngredientes--;
                break;
            }
        }
    }

    public void searchIngredienteDetails(Ingrediente ingr){
        for (int i = 0; i < nIngredientes; i++) {
            if (ingredientes[i].equals(ingr)) {
                System.out.println(ingredientes[i]);
            }
        }    
    }
    
    public int getCaloriasPizza() {
        int totalCal = 0;
        for (int i = 0; i < nIngredientes; i++) {
            totalCal += ingredientes[i].getnCalorias();
        }
        return totalCal;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public int getnIngredientes() {
        return nIngredientes;
    }

    public void setnIngredientes(int nIngredientes) {
        this.nIngredientes = nIngredientes;
    }

    public Ingrediente[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Ingrediente[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        String ingredientesStr = "";
        for (int i = 0; i < nIngredientes; i++) {
            ingredientesStr += ingredientes[i];
//            if (i < nIngredientes - 1) {
//                ingredientesStr += "\n ";
//            }
        }

        return "\n\tPizza{"
                + "\n\t\tid=" + id
                + "\n\t\tnome=" + nome
                + "\n\t\tdescricao=" + descricao
                + "\n\t\tpreco=" + preco
                + "\n\t\ttamanho=" + tamanho
                + "\n\t\tnIngredientes=" + nIngredientes
                + "\n\t\tingredientes=[" + ingredientesStr + "]"
                + '}';
    }

}
