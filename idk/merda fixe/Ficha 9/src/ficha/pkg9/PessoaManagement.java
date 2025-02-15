package ficha.pkg9;

import Enums.Enums.*;

public class PessoaManagement {

    private Pessoa[] pessoas;
    private int tamanho;
    private static final int tamanho_inicial = 20;

    public PessoaManagement() {
        pessoas = new Pessoa[tamanho_inicial];
        this.tamanho = 0;
    }

    public boolean adicionar(Pessoa pessoa) {
        boolean sucesso = false;
        if (tamanho < pessoas.length) {
            pessoas[tamanho] = pessoa;
            tamanho++;
            sucesso = true;
        } else {
            sucesso = expandArray();
            pessoas[tamanho] = pessoa;
            tamanho++;
        }
        return sucesso;
    }

    public boolean remover(String name) {
        boolean sucesso = false;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                continue;
            }
            if (pessoas[i].getName().equals(name)) {
                for (int j = i; j < pessoas.length - 1; j++) {
                    pessoas[j] = pessoas[j + 1];
                }
                pessoas[pessoas.length - 1] = null;
                tamanho--;
                sucesso = true;
                System.out.println("removeu");
            }
        }
        return sucesso;
    }

    public boolean expandArray() {
        Pessoa[] arrayy = new Pessoa[pessoas.length * 2];
        for (int i = 0; i < pessoas.length; i++) {
            arrayy[i] = pessoas[i];
        }
        this.pessoas = arrayy;
        return true;
    }

    public String listProjectManager() {
        String s = "";
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) {
                continue;
            }
            if (pessoas[i] instanceof ProjectManager) {
                s += pessoas.toString();
                s += "PessoaManagement{" + "pessoas=" + pessoas + ", tamanho=" + tamanho + '}';
            }
        }
        return s;
    }

}
