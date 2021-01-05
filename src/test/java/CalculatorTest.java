import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void add() {
        int x = 5;
        int y = 5;
        assertEquals(10, calculator.canAdd(x,y));
    }

    @Test
    public void subtract() {
        int x = 10;
        int y = 5;
        assertEquals(5, calculator.canSubtract(x,y));
    }

    @Test
    public void multiply() {
        int x = 2;
        int y = 4;
        assertEquals(8, calculator.canMultiply(x,y));
    }

    @Test
    public void divide() {
        double x = 10;
        double y = 2;
        assertEquals(5, calculator.canDivide(x,y),0.01);
    }

}
