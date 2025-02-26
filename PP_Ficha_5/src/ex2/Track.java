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

    protected int id;
    protected int numFaixa;
    protected String nomeFaixa;
    protected int duracao;
    protected String nomeArtist;
    protected static int nextId = 1;

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
