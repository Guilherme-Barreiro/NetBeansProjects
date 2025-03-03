/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2;

/**
 *
 * @author guiba
 */
public class Track {

    public int id;
    public int numFaixa;
    public String nomeFaixa;
    public int duracao;
    public String nomeArtist;
    public static int nextId = 1;

    public Track(int tnumFaixa, String tnomeFaixa, int tduracao, String tnomeArtist) {
        numFaixa = tnumFaixa;
        nomeFaixa = tnomeFaixa;
        duracao = tduracao;
        nomeArtist = tnomeArtist;
        id = nextId++;
    }

    @Override
    public String toString() {
        String result = "Numero da Faixa: " + numFaixa + "\n"
                + "Nome da Faixa: " + nomeFaixa + "\n"
                + "duracao: " + duracao + "\n"
                + "Nome do Autor: " + nomeArtist + "\n";

        return result;
    }

}
