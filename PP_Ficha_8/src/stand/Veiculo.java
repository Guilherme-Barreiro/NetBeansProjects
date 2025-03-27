package stand;

import Enums.ConditionType;
import Enums.OrigemType;

public class Veiculo {
    private static int nextId = 1;
    private int id;

    private String vin;
    private String brand;
    private String model;
    private String manufacturingDate;
    private OrigemType origin;
    private double kms;
    private ConditionType condition;
    private int price;

    public Veiculo(String vin, String brand, String model, String manufacturingDate, OrigemType origin, double kms, ConditionType condition, int price) {
        this.id = nextId++;
        this.vin = vin;
        this.brand = brand;
        this.model = model;
        this.manufacturingDate = manufacturingDate;
        this.origin = origin;
        this.kms = kms;
        this.condition = condition;
        this.price = price;
    }

    public static int getNextId() {
        return nextId;
    }
    public static void setNextId(int nextId) {
        Veiculo.nextId = nextId;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getVin() {
        return vin;
    }
    public void setVin(String vin) {
        this.vin = vin;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getManufacturingDate() {
        return manufacturingDate;
    }
    public void setManufacturingDate(String manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }
    public OrigemType getOrigin() {
        return origin;
    }
    public void setOrigin(OrigemType origin) {
        this.origin = origin;
    }
    public double getKms() {
        return kms;
    }
    public void setKms(double kms) {
        this.kms = kms;
    }
    public ConditionType getCondition() {
        return condition;
    }
    public void setCondition(ConditionType condition) {
        this.condition = condition;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }   
}
