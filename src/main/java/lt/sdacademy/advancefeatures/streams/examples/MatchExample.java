package lt.sdacademy.advancefeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;


public class MatchExample {

    private static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main (String [ ] args){
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

        boolean allNamesLenghtisGtThan3 = names.stream()
                .allMatch(name ->name.length()>3);
        logger.info(allNamesLenghtisGtThan3);

        boolean thereIsANameWitchLengthIsGtThan3 = names.stream()
                .anyMatch(name->name.length()>3);
        logger.info(thereIsANameWitchLengthIsGtThan3);
    }
}
