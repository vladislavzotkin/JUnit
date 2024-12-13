import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.Callable;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTests {


    Calculator calculator = new Calculator();

    @Test
    public void sumTest() {
       int result = calculator.sum(1,2);
       assertEquals(3, result);
    }

    @Test
    public void subTest() {
        int result = calculator.sub(1,2);
        assertEquals(-1,result);
    }

    @Test
    public void mulTest() {
        int result = calculator.mul(1,2);
        assertEquals(2, result);
    }



}
