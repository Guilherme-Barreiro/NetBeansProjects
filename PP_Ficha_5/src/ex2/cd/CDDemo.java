/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2.cd;

import ex2.Artist;
import ex2.Track;

/**
 *
 * @author guiba
 */
public class CDDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Artist a1 = new Artist("Anselmo Ralf", "10/28/2009", "Preto");
        Artist a2 = new Artist("baterista do anselmo", "86/04/2009", "Preto");
        Artist a3 = new Artist("guitarrista do anselmo", "15/82/2009", "Preto");
        Artist a4 = new Artist("pianista do anselmo", "99/18/2009", "Preto");
        Artist[] artists = { a1, a2, a3, a4 };
        
        Track t1 = new Track(1, "Mãos no volante", 216, artists);
        Track t2 = new Track(2, "Mundo nos chama loucos", 271, artists);
        
        CD cd = new CD("Nlack Biggers", "Nosso primeiro CD", 487, 2007, "editora Braba");

        System.out.println(cd);
    }
    
}
