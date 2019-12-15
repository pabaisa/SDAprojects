package lt.sdacademy.fundamentalstesting.temperatureCelciusConverter;

public class FahrenheitCelsiusConverter {

    public int toCelcius(int fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public int toFahrenheit(int celcius){
        return celcius * 9 / 5 + 32;
    }
}
