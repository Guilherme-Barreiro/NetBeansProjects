/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;
import ex2.Artist;
import ex2.Track;
import ex2.cd.CD;

/**
 *
 * @author Utilizador
 */
public class StoreDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Artist a1 = new Artist("Artista 1", "German", "1977-03-04");
        
        Artist[] artists = {a1};
        
        Track t1 = new Track(1, "Ho Hey", 90, "Lumineers");
        Track t2 = new Track(2, "Stubborn Love", 105, "Wesley Schltz");
        
        CD cd1 = new CD("The Lumineers", "The Lumineers", 195, 2012, "Dualtone Records", artists, 25.99f);
        
        cd1.musicas[0] = t1;
        cd1.musicas[14] = t2;
        
        
//        System.out.println("Nome do cd: " + cd1.nomeCD);
//        System.out.println("Ano de lançamento: " + cd1.anoLancamento);
//        System.out.println("Editora: " + cd1.editora);
//        int nTracks = cd1.musicas.length;
//        
//        for (int i = 0; i < nTracks; i++) {
//            if (cd1.musicas[i] != null) {
//                Track t = cd1.musicas[i];
//                System.out.println("Música número: " + t.numFaixa + " com título: " + t.nomeFaixa);
//                System.out.println("Duração (em segundos): " + t.duracao);
//                System.out.println("Autor da música: " + t.nomeArtist);
//            }
//        }
        
        CD cd2 = new CD("AAAAAAAAAAAA", "VVVVVVVVVVV", 200, 2015, "NNNNNNN", artists, 29.99f);
        
        CD[] cds = {cd1, cd2};

        User u1 = new User("antonio", "20", "tono@magro.com");
        float total_price = 0.0f;
        for(CD cdd : cds){
            total_price = total_price + cdd.price;
        }
        Sale s1 = new Sale("04/10/1212", cds, total_price);
        
        System.out.println(s1);
    }
}
