package pp_ficha.pkg7;

import Enum.BT_Type;
import Enum.Brakes_Type;
import Enum.Material;
import Enum.Suspension_Type;

public class BikeDemo {

    public static void main(String[] args) {

        BT_Type[] bt1 = {BT_Type.ALFORGE, BT_Type.CONTA_QUILOMETROS, BT_Type.KIT, BT_Type.REPARACAO_PNEU};

        MontainBike minhaBike1 = new MontainBike("2", Suspension_Type.SEM_SUSPENSAO, bt1, 21,
                "Vermelho", 27.5, Brakes_Type.PINÇAS, Material.CARBONO, 1200.50, "2 anos");
        
        MontainBike minhaBike2 = new MontainBike("2", Suspension_Type.SEM_SUSPENSAO, bt1, 21,
                "Vermelho", 27.5, Brakes_Type.PINÇAS, Material.CARBONO, 1200.50, "2 anos");

        BikeManagement bm = new BikeManagement();

        bm.addMontainBike(minhaBike1);
        bm.addMontainBike(minhaBike2);
        bm.listAllMontainBike();

    }

}
