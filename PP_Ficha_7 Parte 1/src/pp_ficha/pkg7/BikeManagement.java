package pp_ficha.pkg7;

public class BikeManagement {

    private Bike[] bikes;
    private int nBikes;

    private static int MAX_TAM_B = 20;

    public BikeManagement() {
        bikes = new Bike[MAX_TAM_B];
        this.nBikes = 0;
    }

    public void addBike(Bike b) {
        if (nBikes == MAX_TAM_B) {
            expandBike();
        }

        bikes[nBikes++] = b;

    }

    private void expandBike() {
        Bike[] arrayy = new Bike[bikes.length * 2];
        for (int i = 0; i < bikes.length; i++) {
            arrayy[i] = bikes[i];
        }
        this.bikes = arrayy;
    }

    public boolean removeBike(Bike b) {
        int index = searchBike(b);

        if (index == -1) {
            return false;
        }

        for (int i = index; i < nBikes - 1; i++) {
            bikes[i] = bikes[i + 1];
        }

        bikes[--nBikes] = null;

        return true;
    }

    public int searchBike(Bike b) {
        for (int i = 0; i < nBikes; i++) {
            if (b == bikes[i]) {
                return i;
            }
        }
        return -1;
    }

    public boolean updateBike(Bike b, Bike newValue) {
        boolean sucesso = false;
        int index = searchBike(b);

        if (index == -1) {
            return sucesso;
        }

        bikes[index] = newValue;

        return sucesso;
    }

    public void listAllBike() {
        for (int i = 0; i < nBikes; i++) {
            System.out.println(bikes[i]);
        }
    }

    

}
