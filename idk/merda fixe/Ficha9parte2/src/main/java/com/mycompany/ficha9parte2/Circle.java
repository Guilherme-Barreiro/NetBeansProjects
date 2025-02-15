/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ficha9parte2;

/**
 *
 * @author guiba
 */
public class Circle extends Shape{
    private double radius = 1.0;
    
    public Circle(boolean filled) {
        super(filled);
    }
    
    public Circle(boolean filled, String color) {
        super(filled, color);
    }
    
    public Circle(boolean filled, double radius) {
        super(filled);
        this.radius = radius;
    }
    
    public Circle(boolean filled, String color, double radius) {
        super(filled, color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    
    @Override
    double getArea() {
        return 3.1415 * this.radius * this.radius;
    }

    @Override
    double getPerimeter() {
        return 3.1415 * this.radius + this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }
    
    
    
}
