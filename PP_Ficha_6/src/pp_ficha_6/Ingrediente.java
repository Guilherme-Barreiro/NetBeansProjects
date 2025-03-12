package pp_ficha_6;

import Enums.Origem;

public class Ingrediente {
    private int id;
    private String nome;
    private Origem origem;
    private int nCalorias;
    private static int nextId = 1;

    public Ingrediente(String nome, Origem origem, int nCalorias) {
        this.nome = nome;
        this.origem = origem;
        this.nCalorias = nCalorias;
        this.id = nextId++;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public int getnCalorias() {
        return nCalorias;
    }

    public void setnCalorias(int nCalorias) {
        this.nCalorias = nCalorias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\n\t\tIngrediente{\n\t\t\t" + "id=" + id + "\n\t\t\tnome=" + nome + "\n\t\t\torigem=" + origem + "\n\t\t\tnCalorias=" + nCalorias + '}';
    }
    
    

}
