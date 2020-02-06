package lt.sdacademy.advancefeatures.streams.examples;

import org.apache.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class FilterAndMapExample {
    private static final Logger logger = Logger.getLogger(MatchExample.class);

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Andrew", "Brandon", "Michael");

        // Filter
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(logger::info);

        //Map
        List<Integer> nameLenghts = names.stream()
                .map(name -> name.length())
                .collect(Collectors.toList());
        logger.info(nameLenghts);

        OptionalDouble averageNameLenghtOptional = names.stream()
                .mapToInt(name -> name.length())
                .average();
        logger.info(averageNameLenghtOptional.orElse(0));
        // Use decimal format to round number
    }
}
