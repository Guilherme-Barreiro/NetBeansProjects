/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ficha.pkg9;
import Enums.Enums.*;

/**
 *
 * @author guiba
 */
abstract public class Pessoa {    
    private String name;
    private String birthDate;
    private String address;
    private int citizenCard;
    private int vatNumber;
    private float baseSalary;

    public Pessoa(String name, String birthDate, String address, int citizenCard, int vatNumber, float baseSalary) {
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.citizenCard = citizenCard;
        this.vatNumber = vatNumber;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCitizenCard() {
        return citizenCard;
    }

    public void setCitizenCard(int citizenCard) {
        this.citizenCard = citizenCard;
    }

    public int getVatNumber() {
        return vatNumber;
    }

    public void setVatNumber(int vatNumber) {
        this.vatNumber = vatNumber;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "name=" + name + ", birthDate=" + birthDate + ", address=" + address + ", citizenCard=" + citizenCard + ", vatNumber=" + vatNumber + ", baseSalary=" + baseSalary + '}';
    }
    
    
    
}
