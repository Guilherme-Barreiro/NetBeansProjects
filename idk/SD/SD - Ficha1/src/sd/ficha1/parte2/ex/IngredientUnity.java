/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package sd.ficha1.parte2.ex;

/**
 *
 * @author guiba
 */
public enum IngredientUnity {
    GRAMS, LITERS, UNITY;

    public static String IngredientToString(IngredientUnity unity) {
        switch (unity){
            case GRAMS:
                return "A unidade è GRAMS";
            case LITERS:
                return "A unidade è LITERS";
            case UNITY:
                return "A unidade è UNITY";
            default:
                return "nigger";

        }
    }
}
