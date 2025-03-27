/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enum;

/**
 *
 * @author guiba
 */
public enum Material {
    CARBONO, ALUMINIO;
    public static String MaterialToString(Material e) {
        switch (e) {
            case CARBONO:
                return "O material pode ser CARBONO.";
            case ALUMINIO:
                return "O material pode ser ALUMINIO.";
            default:
                return "Eriro";
        }
    }
}
