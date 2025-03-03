/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2.cd;

import ex2.Artist;
import ex2.Track;
import ex2.cd.CD;

/**
 *
 * @author guiba
 */
public class CDDemo {

    public static void main(String[] args) {
        Artist a1 = new Artist("Artista 1", "1977-03-04", "German");
        
        Artist[] artists = {a1};
        
        Track t1 = new Track(1, "Ho Hey", 90, "Lumineers");
        Track t2 = new Track(2, "Stubborn Love", 105, "Wesley Schltz");
        
        CD cd = new CD("The Lumineers", "The Lumineers", 195, 2012, "Dualtone Records", artists);
        
        cd.musicas[0] = t1;
        cd.musicas[14] = t2;
        
        System.out.println("Nome do cd: " + cd.nomeCD);
        System.out.println("Ano de lançamento: " + cd.anoLancamento);
        System.out.println("Editora: " + cd.editora);
        int nTracks = cd.musicas.length;
        
        for (int i = 0; i < nTracks; i++) {
            if (cd.musicas[i] != null) {
                Track t = cd.musicas[i];
                System.out.println("Música número: " + t.numFaixa + " com título: " + t.nomeFaixa);
                System.out.println("Duração (em segundos): " + t.duracao);
                System.out.println("Autor da música: " + t.nomeArtist);
            }
        }
    }

}
