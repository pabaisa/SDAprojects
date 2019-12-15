package fundamentals.basics;

import lt.sdacademy.fundamentalstesting.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Example2 {
    @Test
    public void test() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = (int) calculator.add(3, 5);

        //then
        //      assert result==8;
        assertEquals(result, 8);
    }

    @Test
    public void testDivison() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.divide(8, 2);

        //then
        assertEquals(result, 4);
    }

    @Test
    public void testMultiply() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.multiply(8, 2);

        //then
        assertEquals(result, 16);
    }

    @Test
    public void testMinus() {
        //given
        Calculator calculator = new Calculator();

        //when
        int result = calculator.minus(8, 2);

        //then
        assertEquals(result, 6);
    }
}
