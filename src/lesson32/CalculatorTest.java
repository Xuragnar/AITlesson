package lesson32;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach // этот метод будет выполняться перед каждым тестовым методом
    public void setUp() {
        calculator = new Calculator();
    }
@Test
@DisplayName("Simple multiplication 4 * 5 = 20 should be correct ")
    void testMultiply(){
assertEquals(20,calculator.multiply(4,5));
    }

    @Test
    @DisplayName("Check correct handling of zero")
    void testMultiplyZero(){
        assertEquals(0,calculator.multiply(0,5));
        assertEquals(0,calculator.multiply(5,0));
    }
}
