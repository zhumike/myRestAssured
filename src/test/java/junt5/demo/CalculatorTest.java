package junt5.demo;

/**
 * @Author ZhenZhong Zhu
 * @Date 2025/6/5 15:49
 * @Version 1.0
 * @Description ：
 */
import junt.test.service.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "5 - 3 should equal 2");
    }
}

