/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enums;

/**
 *
 * @author guiba
 */
public enum TipoContrato {
    PARCIAL, INTEGRAL;
    
    public static String TipoContratoTypeToString(TipoContrato e) {
        switch (e) {
            case PARCIAL:
                return "o tipo de contrato é PARCIAL.";
            case INTEGRAL:
                return "o tipo de contrato é INTEGRAL.";
            default:
                return "Eriro";
        }
    }
}
