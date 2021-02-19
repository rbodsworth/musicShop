package Shop;

import Interfaces.ISell;

public class Accessories implements ISell {

    private String description;
    private double boughtPrice;
    private double sellPrice;

    public Accessories(String description, double boughtPrice, double sellPrice){
        this.description = description;
        this.boughtPrice = boughtPrice;
        this.sellPrice = sellPrice;
    }

    public String accessoryHasDescription(){
        return description;
    }

    public double getBoughtPrice() {
        return boughtPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public double markUp() {
        return 0;
    }
}
