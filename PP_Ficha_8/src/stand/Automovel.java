package stand;

import Enums.ConditionType;
import Enums.OrigemType;

public class Automovel extends Veiculo{
    private int occupantsNumber;
    private int doorsNumber;

    public Automovel(int occupantsNumber, int doorsNumber, String vin, String brand, String model, String manufacturingDate, OrigemType origin, double kms, ConditionType condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.occupantsNumber = occupantsNumber;
        this.doorsNumber = doorsNumber;
    }

    public int getOccupantsNumber() {
        return occupantsNumber;
    }
    public void setOccupantsNumber(int occupantsNumber) {
        this.occupantsNumber = occupantsNumber;
    }
    public int getDoorsNumber() {
        return doorsNumber;
    }
    public void setDoorsNumber(int doorsNumber) {
        this.doorsNumber = doorsNumber;
    }
}
