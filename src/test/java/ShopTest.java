import Shop.Shop;
import Shop.Accessories;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

    Shop shop;
    Accessories accessories;


    @Before
    public void before(){
        shop = new Shop("Ray's Music Exchange");
        accessories = new Accessories("Guitar strings", 01.00, 03.00);
}

    @Test
    public void ableToAddAccessoryToStock(){
        shop.addToStock(accessories);
        assertEquals(1, shop.getStock());
    }

    @Test
    public void ableToRemoveAccessoryToStock(){
        shop.addToStock(accessories);
        shop.addToStock(accessories);
        shop.addToStock(accessories);
        shop.removeFromStock(accessories);
        assertEquals(2, shop.getStock());
    }

}
