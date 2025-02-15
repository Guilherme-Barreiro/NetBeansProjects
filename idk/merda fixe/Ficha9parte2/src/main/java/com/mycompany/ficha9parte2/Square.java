/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ficha9parte2;

public class Square extends Shape{
    private double width= 1.0;
    
    public Square(boolean filled){
        super(filled);
    }

    public Square(boolean filled, String color){
        super(filled, color);
    }
    
    public Square(boolean filled, String color, double width){
        super(filled, color);
        this.width = width;
    }
    
    public Square(boolean filled, double width){
        super(filled);
        this.width = width;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public void setWidth(double width){
        this.width = width;
    }
    
    @Override
    double getArea() {
        return this.width * this.width;
    }

    @Override
    double getPerimeter() {
        return this.width + this.width + this.width + this.width;
    }
    
    public String toString(){
        String s = "";
        s += super.toString();
        s += "width: " + this.width;
        return s;
    }
    
    
    
    
    
    
}
