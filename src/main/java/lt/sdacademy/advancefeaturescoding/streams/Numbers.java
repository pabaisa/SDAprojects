package lt.sdacademy.advancefeaturescoding.streams;

/*3. Skaičiai:
        Prieš atliekant užduotis susigeneruokite ilgą atsitiktinių skaičių masyvą, sudarytą tik iš 0 ir 1;
        Apskaičiuokite viso masyvo skaitmenų sumą ir ištraukite šaknį.*/

import lt.sdacademy.advancefeatures.streams.examples.MatchExample;
import org.apache.log4j.Logger;

import java.util.Random;

public class Numbers {
    private static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {
        Random random = new Random();

        double result = Math.sqrt(random.ints(20, 0, 2).sum());

        logger.info(result);
    }
}

