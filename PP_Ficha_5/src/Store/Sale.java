/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Store;

import ex2.cd.CD;

/**
 *
 * @author Utilizador
 */
public class Sale {
    public int id_venda;
    public String data_compra;
    public static int nextId = 1;
    public CD[] cds;
    public float final_price;

    public Sale(String data_compra, CD[] cds, float final_price) {
        this.data_compra = data_compra;
        this.cds = cds;
        this.final_price = final_price;
        id_venda = nextId++;
    }

    @Override
    public String toString() {
        String result = "data_compra: " + data_compra + "\n";

        boolean hasElements = false;
        for (CD ele : cds) {
            if (ele != null) {
                result += "  - " + ele + "\n";
            }
        }
        result += "final_price: " + final_price + "\n\n";
        
        return result;
    }

}
