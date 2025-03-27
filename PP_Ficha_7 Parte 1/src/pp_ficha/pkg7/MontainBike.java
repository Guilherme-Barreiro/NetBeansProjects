package pp_ficha.pkg7;

import Enum.BT_Type;
import Enum.Brakes_Type;
import Enum.Material;
import Enum.Suspension_Type;

public class MontainBike extends Bike {

    private String numberOfLigths;
    private Suspension_Type suspension;
    private BT_Type[] bikeTools;

    public MontainBike(String numberOfLigths, Suspension_Type suspension, BT_Type[] bikeTools, int numberOfGears,
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
    public BT_Type[] getBikeTools() {
        return bikeTools;
    }
    public void setBikeTools(BT_Type[] bikeTools) {
        this.bikeTools = bikeTools;
    }
    
    @Override
    public String toString() {
        String bikeToolsStr = "\n\t\t";
        if (bikeTools != null) {
            for (int i = 0; i < bikeTools.length; i++) {
                bikeToolsStr += bikeTools[i];
                if (i < bikeTools.length - 1) {
                    bikeToolsStr += "\n\t\t";
                }
            }
        }

        return "\nMontainBike{"
                + "\n\tnumberOfLigths=" + numberOfLigths
                + "\n\tsuspension=" + suspension
                + "\n\tbikeTools=[" + bikeToolsStr + "]"
                + "\n\t" + super.toString()
                + '}';
    }
}
