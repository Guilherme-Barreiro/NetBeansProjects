/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author guiba
 */
public class Artist {

    protected int id;
    protected String nomeArtista;
    protected String nacionalidade;
    protected String birthDate;
    protected static int nextId = 1;

    public Artist(String tnomeArtista, String tnacionalidade, String tbirthDate) {
        nomeArtista = tnomeArtista;
        nacionalidade = tnacionalidade;
        birthDate = tbirthDate;
        id = nextId++;

    }

    @Override
    public String toString() {
        String result = "Nome do Artista: " + nomeArtista + "\n"
                + "Nacionalidade: " + nacionalidade + "\n"
                + "Birth Date: " + birthDate + "\n";

        return result;
    }

}
