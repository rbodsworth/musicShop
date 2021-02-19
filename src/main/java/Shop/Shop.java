package Shop;

import Interfaces.ISell;

import java.util.ArrayList;

public class Shop {

    private String shopName;
    private ArrayList<ISell> stock;

    public Shop(String shopName ){
        this.shopName = shopName;
        this.stock = new ArrayList<ISell>();
    }

    public String getShopName() {
        return shopName;
    }

    public int getStock(){
        return stock.size();
    }

    public void addToStock(ISell accessories){
        this.stock.add(accessories);
    }

    public void removeFromStock(ISell accessories){
        this.stock.remove(accessories); 
    }
}
