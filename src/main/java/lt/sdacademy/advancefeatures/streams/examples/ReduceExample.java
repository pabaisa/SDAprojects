package lt.sdacademy.advancefeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
    private static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Tom", "Brandon", "Michael");

        String namesConcatenation = names.stream()
                .reduce("",
                        (currentValue, elemant) -> (currentValue.isEmpty() ? "" : currentValue + ", ") + elemant);
        logger.info(namesConcatenation);

        int num = names.stream()
                .map(String::length)
                .reduce(0,
                        (sum, currentNum) -> (currentNum > 3 ? 1 : 0) + sum);
        logger.info(num);
    }
}

