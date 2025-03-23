package pp_ficha.pkg7;

public class BikeManagement {

    private int nBikes;

    private MontainBike[] montainBikes;
    private int nMontainBikes;

    private RoadBike[] roadBikes;
    private int nRoadBikes;

    private static int MAX_TAM_MB = 20;
    private static int MAX_TAM_RB = 20;

    public BikeManagement() {
        montainBikes = new MontainBike[MAX_TAM_MB];
        roadBikes = new RoadBike[MAX_TAM_RB];
        this.nMontainBikes = 0;
        this.nRoadBikes = 0;
    }

    public void addMontainBike(MontainBike mb) {
        if (nMontainBikes >= MAX_TAM_MB) {
            if (expandMontainBike()) {
                montainBikes[nMontainBikes] = mb;
                nMontainBikes++;
                nBikes = nextnBikes++;
            }
        } else {
            montainBikes[nMontainBikes] = mb;
            nMontainBikes++;
        }

    }
    public boolean expandMontainBike() {
        MontainBike[] arrayy = new MontainBike[montainBikes.length * 2];
        for (int i = 0; i < montainBikes.length; i++) {
            arrayy[i] = montainBikes[i];
        }
        this.montainBikes = arrayy;
        return true;
    }
    public boolean removeMontainBike(MontainBike mb) {
        boolean sucesso = false;
        int index = searchMontainBike(mb);

        if (index == -1) return sucesso;
        
        for (int i = index; i < nMontainBikes - 1; i++) 
            montainBikes[i + 1] = montainBikes[i];

        return sucesso;
    }
    public int searchMontainBike(MontainBike mb) {
        for (int i = 0; i < nMontainBikes; i++) {
            if (mb == montainBikes[i]) {
                return i;
            }
        }
        return -1;
    }
    public boolean updateMontainBike(MontainBike mb, MontainBike newValue){
        boolean sucesso = false;
        int index = searchMontainBike(mb);

        if (index == -1) return sucesso;
        
        montainBikes[index] = newValue;

        return sucesso;
    }
    public void listAllMontainBike(){
        for (int i = 0; i < nMontainBikes; i++) {
            System.out.println(montainBikes[i]);
        }
    }
    
    public void addRoadBike(RoadBike mb) {
        if (nRoadBikes >= MAX_TAM_MB) {
            if (expandRoadBike()) {
                roadBikes[nRoadBikes] = mb;
                nRoadBikes++;
            }
        } else {
            roadBikes[nRoadBikes] = mb;
            nRoadBikes++;
        }

    }
    public boolean expandRoadBike() {
        RoadBike[] arrayy = new RoadBike[roadBikes.length * 2];
        for (int i = 0; i < roadBikes.length; i++) {
            arrayy[i] = roadBikes[i];
        }
        this.roadBikes = arrayy;
        return true;
    }
    public boolean removeRoadBike(RoadBike mb) {
        boolean sucesso = false;
        int index = searchRoadBike(mb);

        if (index == -1) return sucesso;
        
        for (int i = index; i < nRoadBikes - 1; i++) 
            roadBikes[i + 1] = roadBikes[i];

        return sucesso;
    }
    public int searchRoadBike(RoadBike mb) {
        for (int i = 0; i < nRoadBikes; i++) {
            if (mb == roadBikes[i]) {
                return i;
            }
        }
        return -1;
    }
    public boolean updateRoadBike(RoadBike mb, RoadBike newValue){
        boolean sucesso = false;
        int index = searchRoadBike(mb);

        if (index == -1) return sucesso;
        
        roadBikes[index] = newValue;

        return sucesso;
    }
    public void listAllRoadBike(){
        for (int i = 0; i < nRoadBikes; i++) {
            System.out.println(roadBikes[i]);
        }
    }
    
    public RoadBike[] getRoadBikes() {
        return roadBikes;
    }
    public void setRoadBikes(RoadBike[] roadBikes) {
        this.roadBikes = roadBikes;
    }
    public int getnRoadBikes() {
        return nRoadBikes;
    }
    public void setnRoadBikes(int nRoadBikes) {
        this.nRoadBikes = nRoadBikes;
    }
    public MontainBike[] getMontainBikes() {
        return montainBikes;
    }
    public void setMontainBikes(MontainBike[] montainBikes) {
        this.montainBikes = montainBikes;
    }
    public int getnMontainBikes() {
        return nMontainBikes;
    }
    public void setnMontainBikes(int nMontainBikes) {
        this.nMontainBikes = nMontainBikes;
    }
    public int getnBikes() {
        return nBikes;
    }
    public void setnBikes(int nBikes) {
        this.nBikes = nBikes;
    }

}
