package stand;

import Enums.ConditionType;
import Enums.OrigemType;

public class Motociclo extends Veiculo{
    private int cubicCapacity;
    private double wheelSize;

    public Motociclo(int cubicCapacity, double wheelSize, String vin, String brand, String model, String manufacturingDate, OrigemType origin, double kms, ConditionType condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.cubicCapacity = cubicCapacity;
        this.wheelSize = wheelSize;
    }

    public int getCubicCapacity() {
        return cubicCapacity;
    }
    public void setCubicCapacity(int cubicCapacity) {
        this.cubicCapacity = cubicCapacity;
    }
    public double getWheelSize() {
        return wheelSize;
    }
    public void setWheelSize(double wheelSize) {
        this.wheelSize = wheelSize;
    }
}
