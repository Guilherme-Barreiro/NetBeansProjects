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

    public int id;
    public String nomeArtista;
    public String nacionalidade;
    public String birthDate;
    public static int nextId = 1;

    public Artist(String tnomeArtista, String tnacionalidade, String tbirthDate) {
        id = nextId++;
        
        nomeArtista = tnomeArtista;
        nacionalidade = tnacionalidade;
        birthDate = tbirthDate;
    }

    @Override
    public String toString() {
        String result = "Nome do Artista: " + nomeArtista + "\n"
                + "Nacionalidade: " + nacionalidade + "\n"
                + "Birth Date: " + birthDate + "\n";

        return result;
    }

}
