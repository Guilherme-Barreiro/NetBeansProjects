/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pp_ficha.pkg7;

import Enum.Brakes_Type;
import Enum.Material;

/**
 *
 * @author guiba
 */
public class Bike {
    private static int nextId = 1;
    private int id;
    private int numberOfGears;
    private String mainColor;
    private double wheelSize;
    private Brakes_Type brakes;
    private Material material;
    private double price;
    private String guarantee;

    public Bike(int numberOfGears, String mainColor, double wheelSize, Brakes_Type brakes, 
            Material material, double price, String guarantee) {
        this.id = nextId++;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guarantee = guarantee;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public void setNumberOfGears(int numberOfGears) {
        this.numberOfGears = numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public void setMainColor(String mainColor) {
        this.mainColor = mainColor;
    }

    public double getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }

    public Brakes_Type getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes_Type brakes) {
        this.brakes = brakes;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGuarantee() {
        return guarantee;
    }

    public void setGuarantee(String guarantee) {
        this.guarantee = guarantee;
    }
}
