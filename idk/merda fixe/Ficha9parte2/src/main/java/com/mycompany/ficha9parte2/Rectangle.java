/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ficha9parte2;

/**
 *
 * @author guiba
 */
public class Rectangle extends Square{
    private double height = 1.0;

    public Rectangle(boolean filled){
        super(filled);
    }
    
    public Rectangle(boolean filled, String color){
        super(filled, color);
    }  
    
    public Rectangle(boolean filled, double height){
        super(filled);
        this.height = height;
    }
    
    public Rectangle(boolean filled, String color, double height){
        super(filled, color);
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }
    
    @Override
    public double getArea(){
        return this.getWidth() * this.height;
    }
    
    @Override
    public double getPerimeter(){
        return this.getWidth() + this.getWidth() + this.height + this.height;
    }
    
    public String toString(){
        String s = "";
        s += super.toString();
        s += "Height: " + this.height;
        return s;
    }
}
