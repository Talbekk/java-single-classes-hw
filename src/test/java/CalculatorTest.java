import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }
    @Test
    public void addSum(){
        assertEquals(4.00, calculator.add(2.00, 2.00), 0.01);
    }
//
//    @Test
//    public void subtractSum(){
//        assertEquals(1.00, calculator.subtract(5.00, 4.00), 0.01);
//    }
//
//    @Test
//    public void multiplySum(){
//        assertEquals(100.00, calculator.multiply(5.00, 20.00), 0.01);
//    }
//
//    @Test
//    public void divideSum(){
//        assertEquals(17.69, calculator.divide(568.86, 32.14), 0.01);
//    }
}
