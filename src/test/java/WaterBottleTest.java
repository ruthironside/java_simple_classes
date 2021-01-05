import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void setUp() {
        waterBottle = new WaterBottle(50);
    }

    @Test
    public void hasVolume() {
        assertEquals(50, waterBottle.getVolume(), 0.01);
    }

    @Test
    public void startsAt100() {
        assertEquals(100, waterBottle.startingValue(), 0.01);
    }

}
