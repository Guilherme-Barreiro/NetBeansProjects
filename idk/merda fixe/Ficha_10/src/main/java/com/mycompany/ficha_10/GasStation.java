package com.mycompany.ficha_10;
public class GasStation extends Company implements iGasService{
    private double price;

    public GasStation(double price, String nome, int vatNumber) {
        super(nome, vatNumber);
        this.price = price;
    }

    
    public double getGasPrice() {
        return price;
    }

    public void setGasPrice(double p) {
        if(p < 0){
            this.price = p;
        }
    }
    
    public double getGasTotal(double liters) {
        return liters;
    }

    @Override
    public String toString() {
        return "GasStation{" + 
               "price=" + price + 
               ", nome=" + getNome() + 
               ", vatNumber=" + getVatNumber() + 
               '}';
    }
    
}
