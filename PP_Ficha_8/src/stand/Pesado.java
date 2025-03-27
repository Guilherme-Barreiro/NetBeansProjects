package stand;

import Enums.ConditionType;
import Enums.OrigemType;
import Enums.TruckType;

public class Pesado extends Veiculo{
    private double length;
    private double load;
    private TruckType Tipologia;
    private String trailer;

    public Pesado(double length, double load, TruckType Tipologia, String trailer, String vin, String brand, String model, String manufacturingDate, OrigemType origin, double kms, ConditionType condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.length = length;
        this.load = load;
        this.Tipologia = Tipologia;
        this.trailer = trailer;
    }
    public Pesado(double length, double load, TruckType Tipologia, String vin, String brand, String model, String manufacturingDate, OrigemType origin, double kms, ConditionType condition, int price) {
        super(vin, brand, model, manufacturingDate, origin, kms, condition, price);
        this.length = length;
        this.load = load;
        this.Tipologia = Tipologia;
    }

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLoad() {
        return load;
    }
    public void setLoad(double load) {
        this.load = load;
    }
    public TruckType getTipologia() {
        return Tipologia;
    }
    public void setTipologia(TruckType Tipologia) {
        this.Tipologia = Tipologia;
    }
    public String getTrailer() {
        return trailer;
    }
    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
