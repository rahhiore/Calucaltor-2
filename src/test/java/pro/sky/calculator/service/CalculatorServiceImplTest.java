package pro.sky.calculator.service;

import org.junit.jupiter.api.Test;
import pro.sky.calculator.exceptions.NullDivideException;
import pro.sky.calculator.service.CalculatorServiceImpl;
import pro.sky.calculator.CalculatorTestConstants.*;

import static org.junit.jupiter.api.Assertions.*;
import static pro.sky.calculator.CalculatorTestConstants.*;

class CalculatorServiceImplTest {

    private final CalculatorServiceImpl service = new CalculatorServiceImpl();


    @Test
    void plus() {
        assertEquals(ONE + TWO, service.plus(ONE, TWO));
        assertEquals(THREE + THREE, service.plus(THREE, THREE));
    }

    @Test
    void minus() {
        assertEquals(ONE - TWO, service.minus(ONE, TWO));
        assertEquals(THREE - TWO, service.minus(THREE, TWO));
    }

    @Test
    void multiply() {
        assertEquals(ONE * TWO, service.multiply(ONE, TWO));
        assertEquals(THREE * THREE, service.multiply(THREE, THREE));
    }

    @Test
    void divide() {
        assertEquals(ONE / TWO, service.divide(ONE, TWO));
        assertEquals(THREE / ONE, service.divide(THREE, ONE));
        assertThrows(NullDivideException.class, () -> service.divide(ONE, 0));
    }
}