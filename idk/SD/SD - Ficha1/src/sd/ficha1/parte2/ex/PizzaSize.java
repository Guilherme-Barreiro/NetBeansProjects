/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package sd.ficha1.parte2.ex;

/**
 *
 * @author guiba
 */
public enum PizzaSize {
    SMALL, MEDIUM, BIG;

    public static String PizzaSizeToString(PizzaSize size) {
        switch (size){
            case SMALL:
                return "A pizza é pequena";
            case MEDIUM:
                return "A pizza é pequena";
            case BIG:
                return "A pizza é pequena";
            default:
                return "nigger";

        }
    }
}