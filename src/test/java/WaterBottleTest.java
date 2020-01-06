import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle  waterBottle;

    @Before
    public void before(){
        waterBottle = new WaterBottle(100.00, 100.00);
    }

    @Test
    public void hasVolume(){
        assertEquals(100, waterBottle.getVolume(),0.01);
    }

    @Test
    public void decreasesVolumeWhenDrinkIsAdded(){
        waterBottle.drink(10.00);
        assertEquals(90, waterBottle.getVolume(),0.01);
    }

    @Test
    public void emptyWaterBottle(){
        waterBottle.empty();
        assertEquals(0.00,waterBottle.getVolume(),0.01);
    }

    @Test
    public void fillWaterBottle(){
        waterBottle.fill();
        assertEquals(100.00, waterBottle.getVolume(), 0.01);
    }


}
