package fundamentals.basics;

import lt.sdacademy.fundamentalstesting.calculator.Calculator;
import org.junit.Test;

import java.util.Random;

public class Example4 {
    @Test(expected = ArithmeticException.class)
    public void sholdThrowExeptionWhenDividingBy0(){
        //given
        Calculator calculator = new Calculator();
        int number = new Random().nextInt();

        //when
        calculator.divide(number, 0);

        //then
        //shold throw exeption
    }
}
