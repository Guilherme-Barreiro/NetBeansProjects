package com.mycompany.ficha_10;
public class Company {
    private String nome;
    private int vatNumber;

    public Company(String nome, int vatNumber) {
        this.nome = nome;
        this.vatNumber = vatNumber;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }
}
