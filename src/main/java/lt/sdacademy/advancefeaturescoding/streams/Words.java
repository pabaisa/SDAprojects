package lt.sdacademy.advancefeaturescoding.streams;

import lt.sdacademy.advancefeatures.streams.examples.MatchExample;
import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

/*2. Su esamu žodžių sąrašu atlikite užduotis:
        Sujunkite žodžius į vieną naudodami reduce funkciją;
        Naudodami pradinį žodžių sąrašą, paverskite juos didžiosiomis raidėmis su map funkcija ir vėl sujunkite į vieną žodį su reduce;
        Naudodami pradinį žodžių sąrašą, sujunkite į vientisą tekstą, kiekvieną žodį atskyrę ženklu , (tekstas negali prasidėti ar baigtis nurodytu ženklu);
        Naudodami pradinį žodžių sąrašą, išspausdinkite tuos, kurie turi raidę o. [Rytas, Lova, Durys, Automobilis, Katinas]*/

public class Words {
    private static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Rytas", "Lova", "Durys", "Automobilis", "Katinas");

        String wordOfAllWords = words.stream()
                .reduce("",
                        (currentValue, elemant) -> (currentValue.isEmpty() ? "" : currentValue) + elemant);
        logger.info(wordOfAllWords);

        String wordOfAllWordsUpperCases = words.stream()
                .map(word -> word.toUpperCase())
                .reduce("",
                        (currentValue, elemant) -> (currentValue.isEmpty() ? "" : currentValue) + elemant);
        logger.info(wordOfAllWordsUpperCases);

        String text = words.stream()
                .reduce("",
                        (currentValue, elemant) -> (currentValue.isEmpty() ? "" : currentValue + ", ") + elemant);
        logger.info(text);

        String wordWithO = words.stream()
                .filter(word -> word.contains("o"))
                .reduce("",
                        (currentValue, elemant) -> (currentValue.isEmpty() ? "" : currentValue + ", ") + elemant);
        logger.info(wordWithO);
    }
}