package lt.sdacademy.advancefeaturescoding.streams;

import lt.sdacademy.advancefeatures.streams.examples.MatchExample;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
1. Su esamu vardų sąrašu atlikite užduotis:
        Palikite tuos, kurie trumpesni, nei 6 simbolių;
        Palikite tuos, kurie savyje turi raidę e;
        Atspausdinti esamus vardus didžiosiomis raidėmis;
        Jei yra keli variantai, iš surūšiuoto sąrašo pasirinkite paskutinį vardą. [Romualdas, Agnė, Elena, Angelė, Laurynas, Karolis, Bronius, Ignė, Meda]
*/


public class Names {
    private static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Romualdas", "Agnė", "Elena", "Angelė", "Laurynas", "Karolis", "Bronius", "Ignė", "Meda", "Zekas");

        String UpdateName = names.stream()
                .filter(name -> name.length() < 6)
                .filter(name -> name.contains("e"))
                .map(name -> name.toUpperCase())
                .sorted(Collections.reverseOrder())
                .findFirst().orElse("ERROR!");

        System.out.println(UpdateName);
    }
}
