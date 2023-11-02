package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator=new Calculator();
    }


    @Test
    void sum() {
        assertEquals(4,calculator.sum(2,2));
    }

    @Test
    void subtraction() {
        assertEquals(3,calculator.subtraction(5,2));
    }

    @Test
    void multiply() {
        assertEquals(28,calculator.multiply(4,7));
    }

    @Test
    void divide() {
        assertEquals(1,calculator.divide(2,2));
    }

    @Test
    void modulo() {
        assertEquals(0,calculator.modulo(2,2));
    }
}