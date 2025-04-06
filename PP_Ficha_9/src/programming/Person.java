package programming;

import java.time.LocalDate;

public class Person {

    private static int nextId = 1;
    private int id;

    private String name;
    private LocalDate birthDate;
    private String address;
    private String cc;
    private String nif;
    private double baseSalary;

    public Person(int id, String name, LocalDate birthDate, String address, String cc, String nif, double baseSalary) {
        this.id = nextId++;
        this.name = name;
        this.birthDate = birthDate;
        this.address = address;
        this.cc = cc;
        this.nif = nif;
        this.baseSalary = baseSalary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateInitialSalary() {
        return this.baseSalary;
    }
}
