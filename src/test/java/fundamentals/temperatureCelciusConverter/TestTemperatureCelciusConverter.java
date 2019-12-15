package fundamentals.temperatureCelciusConverter;

import lt.sdacademy.fundamentalstesting.temperatureCelciusConverter.FahrenheitCelsiusConverter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestTemperatureCelciusConverter {
    @Test
    public void testFahrenheit() {
        //given
        FahrenheitCelsiusConverter fahrenheitCelsiusConverter = new FahrenheitCelsiusConverter();

        //when
        int resultCelcius = fahrenheitCelsiusConverter.toCelcius(41);

        //then
        assertEquals(resultCelcius, 5);
    }

    @Test
    public void testCelcius() {
        //given
        FahrenheitCelsiusConverter fahrenheitCelsiusConverter = new FahrenheitCelsiusConverter();

        //when
        int resultFahrenheit = fahrenheitCelsiusConverter.toFahrenheit(5);

        //then
        assertEquals(resultFahrenheit, 41);
    }
}
