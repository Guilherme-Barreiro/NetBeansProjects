/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ficha9parte2;

/**
 *
 * @author guiba
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape c = new Circle(true);
        Shape s = new Square(true);
        Shape r = new Rectangle(true);
        
        ShapeManagement sm = new ShapeManagement();
        
        sm.adicionar(c);        
        sm.adicionar(s);        
        sm.adicionar(r);
        System.out.println(sm.toString());
    }
    
}
