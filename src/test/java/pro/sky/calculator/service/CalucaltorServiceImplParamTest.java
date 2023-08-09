package pro.sky.calculator.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static pro.sky.calculator.CalculatorTestConstants.*;

public class CalucaltorServiceImplParamTest {
    private final CalculatorServiceImpl service = new CalculatorServiceImpl();

    @MethodSource("provideParams")
    @ParameterizedTest
    void plus(int num1, int num2) {
        assertEquals(num1 + num2, service.plus(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void minus(int num1, int num2) {
        assertEquals(num1 - num2, service.minus(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void multiply(int num1, int num2) {
        assertEquals(num1 * num2, service.multiply(num1, num2));
    }

    @MethodSource("provideParams")
    @ParameterizedTest
    void divide(int num1, int num2) {
        assertEquals(num1 / num2, service.divide(num1, num2));
    }

    private static Stream<Arguments> provideParams() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(THREE, TWO),
                Arguments.of(ONE, THREE),
                Arguments.of(THREE, ONE),
                Arguments.of(THREE, THREE)
        );
    }

}
