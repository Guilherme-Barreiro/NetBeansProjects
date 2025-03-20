package pp_ficha.pkg7;

public class BikeManagement {
    private int nBikes;
    private static int nextnBikes = 1;
    
    private MontainBike[] montainBikes;
    private int nMontainBikes;
    private static int nextnMontainBikes = 1;

    private RoadBike[] roadBikes;
    private int nRoadBikes;
    private static int nextnRoadBikes = 1;
    
    private static final int tamanho_inicial = 20;

    public BikeManagement() {
        montainBikes = new MontainBike[tamanho_inicial];
        this.nMontainBikes = 0;
    }

    public void addMontainBike(MontainBike mb){
        //verificar se passa o tamanho maximo do array
        montainBikes[nMontainBikes] = mb;
        nMontainBikes++;
    }
    
    public boolean removeMontainBike(MontainBike mb){
        boolean sucesso = false; 
        int index = searchMontainBike(mb);
        
        if(index == -1) return sucesso;
        for(int i = index; i < nMontainBikes - 1; i++){
            montainBikes[i + 1] = montainBikes[i];
        }
        
        return sucesso;
    }
    
    public int searchMontainBike(MontainBike mb){
        for (int i = 0; i < nMontainBikes; i++){
            if (mb == montainBikes[i]){
                return i;
            }
        }
        return -1;
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
