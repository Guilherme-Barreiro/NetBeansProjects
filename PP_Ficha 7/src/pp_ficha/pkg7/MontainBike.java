package pp_ficha.pkg7;

import Enum.BikeTools_Type;
import Enum.Brakes_Type;
import Enum.Material;
import Enum.Suspension_Type;

public class MontainBike extends Bike {
    private String numberOfLigths;
    private Suspension_Type suspension;
    private BikeTools_Type bikeTools;

    public MontainBike(String numberOfLigths, Suspension_Type suspension, BikeTools_Type bikeTools, int numberOfGears, 
            String mainColor, double wheelSize, Brakes_Type brakes, Material material, double price, String guarantee) {
        super(numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.numberOfLigths = numberOfLigths;
        this.suspension = suspension;
        this.bikeTools = bikeTools;
    }
    
    public String getNumberOfLigths() {
        return numberOfLigths;
    }

    public void setNumberOfLigths(String numberOfLigths) {
        this.numberOfLigths = numberOfLigths;
    }

    public Suspension_Type getSuspension() {
        return suspension;
    }

    public void setSuspension(Suspension_Type suspension) {
        this.suspension = suspension;
    }

    public BikeTools_Type getBikeTools() {
        return bikeTools;
    }

    public void setBikeTools(BikeTools_Type bikeTools) {
        this.bikeTools = bikeTools;
    }
    
    
}
