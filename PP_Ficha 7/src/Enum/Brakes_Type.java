/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enum;

/**
 *
 * @author guiba
 */
public enum Brakes_Type {
    PINÇAS, HIDRAULICOS;
    public static String Brakes_TypeToString(Brakes_Type e) {
        switch (e) {
            case PINÇAS:
                return "Os travões são do tipo PINÇAS.";
            case HIDRAULICOS:
                return "Os travões são do tipo HIDRAULICOS.";
            default:
                return "Eriro";
        }
    }
}
