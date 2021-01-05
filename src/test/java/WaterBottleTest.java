import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    WaterBottle waterBottle;

    @Before
    public void setUp() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume(), 0.01);
    }

    @Test
    public void drink() {
        assertEquals(90, waterBottle.minusTen(), 0.01);
    }

    @Test
    public void empty() {
        assertEquals(0, waterBottle.emptyBottle(), 0.01);
    }

    @Test
    public void fill() {
        assertEquals(100, waterBottle.fullBottle(), 0.01);
    }

}
