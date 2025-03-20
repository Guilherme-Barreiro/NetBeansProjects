package pp_ficha.pkg7;

import Enum.Brakes_Type;
import Enum.Material;

public class RoadBike extends Bike {
    private String handlebelt;
    private String frameSize;
    private String observations;

    public RoadBike(String handlebelt, String frameSize, String observations, int id, int numberOfGears, String mainColor, 
            double wheelSize, Brakes_Type brakes, Material material, String price, String guarantee) {
        super(id, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observations = observations;
    }

    
    
    public String getHandlebelt() {
        return handlebelt;
    }

    public void setHandlebelt(String handlebelt) {
        this.handlebelt = handlebelt;
    }

    public String getFrameSize() {
        return frameSize;
    }

    public void setFrameSize(String frameSize) {
        this.frameSize = frameSize;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }
    
    
}
