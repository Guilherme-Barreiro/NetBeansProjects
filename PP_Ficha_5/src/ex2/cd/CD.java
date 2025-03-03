/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2.cd;

import ex2.Artist;
import ex2.Track;

/**
 *
 * @author guiba
 */
public class CD {

    protected final int ELEMENTOS_SIZE = 50;
    protected final int MUSICAS_SIZE = 50;
    protected int id;
    protected String nomeBanda;
    protected String nomeCD;
    protected int tempoTotal;
    protected int anoLancamento;
    protected String editora;
    protected Artist[] elementosBanda;
    protected Track[] musicas;
    protected static int nextId = 1;

    public CD(String nomeBanda, String nomeCD, int tempoTotal, int anoLancamento, String editora, Artist[] elementosBanda) {
        this.nomeBanda = nomeBanda;
        this.nomeCD = nomeCD;
        this.tempoTotal = tempoTotal;
        this.anoLancamento = anoLancamento;
        this.editora = editora;
        this.elementosBanda = elementosBanda;
        musicas = new Track[MUSICAS_SIZE];
        id = nextId++;
    }

    @Override
    public String toString() {
        String result = "ID: " + id + "\n"
                + "Nome da Banda: " + nomeBanda + "\n"
                + "Nome do CD: " + nomeCD + "\n"
                + "Tempo Total: " + tempoTotal + " segundos\n"
                + "Ano de Lançamento: " + anoLancamento + "\n"
                + "Editora: " + editora + "\n\n";

        result += "Elementos da Banda:\n";
        boolean hasElements = false;
        for (Artist ele : elementosBanda) {
            if (ele != null) {
                result += "  - " + ele + "\n";
                hasElements = true;
            }
        }
        if (!hasElements) {
            result += "  Nenhum elemento registado\n";
        }

        // Adicionar músicas se existirem
        result += "\nMúsicas:\n";
        boolean hasTracks = false;
        for (Track mus : musicas) {
            if (mus != null) {
                result += "  - " + mus + "\n";
                hasTracks = true;
            }
        }
        if (!hasTracks) {
            result += "  Nenhuma música registada\n";
        }

        return result;
    }

}
