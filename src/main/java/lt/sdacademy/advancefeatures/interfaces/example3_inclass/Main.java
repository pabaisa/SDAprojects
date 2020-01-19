package lt.sdacademy.advancefeatures.interfaces.example3_inclass;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

// Abstrakti klasė privalo implementuoti interfeisą, bei turėti laukus: name ir amount (edited)
//Iteruojant per inicializuotus objektus ir lyginant vieną su kitais, rasti turtingiausią.

public class Main {
    public static void main(String[] args) {
        List<Data> objectList = Arrays.asList(
                new Person("Jonas", BigDecimal.valueOf(50)),
                new Person("Petras", BigDecimal.valueOf(30000)),
                new Country("Mozambikas", BigDecimal.valueOf(5000000)),
                new Country("Lietuva", BigDecimal.valueOf(2000000))
        );

        Data richest = objectList.get(0);

        for (int i = 0; i < objectList.size() - 1; i++) {
            if (richest.findRicher(objectList.get(i + 1).amount)) {
                richest = objectList.get(i + 1);
            }
        }
        System.out.println("Richest is: " + richest.name + " with amount " + richest.amount);
    }
}
