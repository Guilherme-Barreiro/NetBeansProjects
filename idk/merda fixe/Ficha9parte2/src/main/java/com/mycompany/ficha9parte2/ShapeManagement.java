/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ficha9parte2;

public class ShapeManagement {
    private Shape[] shapes;
    private int n_shapes;
    private final int initial_size = 20;
    
    public ShapeManagement(){
        this.n_shapes = 0;
        this.shapes = new Shape[initial_size];
    }
    public boolean existShape(Shape shape){
        boolean check = false;
        for(int i = 0; i < shapes.length; i++){
            if(shapes[i] == null) continue;
            if(shapes[i].isFilled() == shape.isFilled()) {
                if(shape.getColor().equals(shapes[i].getColor())){
                    if(checkInstance(shape) == checkInstance(shapes[i])){
                        check = true;
                        break;
                    }
                }
            }
        }
        return check;
    }
    
    public int checkInstance(Shape shape){
        int instance = -1;
        if(shape instanceof Square) instance = 0;
        if(shape instanceof Circle) instance = 1;
        if(shape instanceof Rectangle) instance = 2;
        return instance;
    }
    
    public boolean adicionar(Shape shape){
        boolean shapeValidado = true;
        if(existShape(shape)){
            shapeValidado = false;
        }else{
            shapes[n_shapes++] = shape;
        }
        return shapeValidado;
    }
    
    public boolean remover(Shape shape){
        boolean podeRemover = existShape(shape);
        if(podeRemover){
            for(int i = 0; i < shapes.length; i++){
                if(shapes[i] == null) continue;
                if(shapes[i] == shape){
                    for(int j = i; j < shapes.length-1; j++){
                        shapes[j] = shapes[j + 1];
                    }
                }
            }
            shapes[--n_shapes] = null;
        }
        return podeRemover;
    }
    
    public String toString(){
        String s = "";
        for(int i = 0; i < shapes.length; i++){
            if(shapes[i] == null) continue;
            s += shapes[i].toString();
        }
        return s;
    }
}


Method Summary
Modifier and Type - Method - Description
boolean	- addAidBox​(AidBox aidBox)	- Adds a new Aid Box to the Institution
boolean	- addMeasurement​(Measurement measurement, Container container)	- Adds a new measurement to the Institution considering the Aid Box and container
boolean	- addPickingMap​(PickingMap pickingMap)	- Adds a new picking map to the institution
boolean	- addVehicle​(Vehicle vehicle) - Adds a new vehicle to the institution
void - disableVehicle​(Vehicle vehicle)	- Disables a vehicle in the institution
void - enableVehicle​(Vehicle vehicle) - Enables a vehicle in the institution
AidBox[] - getAidBoxes() - Return a copy of a existing Aid Boxes
Container - getContainer​(AidBox aidBox, ContainerType containerType) - Return a copy of an existing container from a Aid Boxes and container type	
PickingMap - getCurrentPickingMap()	- Getter for the current (most recent) picking map in the institution
double - getDistance​(AidBox aidBox) - Getter for Distance between the instituition and parameter Aid Box.
java.lang.String - getName() - Getter for Institution name
PickingMap[] - getPickingMaps() - Getter for the picking maps in the institution
PickingMap[] - getPickingMaps​(java.time.LocalDateTime from, java.time.LocalDateTime to) - Getter for the picking maps in the institution
Vehicle[] - getVehicles() - Getter for a (deep) copy of the vehicles in the institution






////////////__________________________------------------------------------------------------


}