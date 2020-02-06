package lt.sdacademy.advancefeatures.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args){
        Optional<String> stringOptional1 = Optional.of("Hello");
        Optional<String> stringOptional2 = Optional.of("world!");
        Optional<String> stringOptional3 = Optional.ofNullable(null);

        System.out.println(stringOptional1.isPresent());
        stringOptional2.ifPresent(System.out::println);
        stringOptional2.ifPresent(t -> System.out.println(t));


        String value = stringOptional3.orElse("Hello world!");
        System.out.println(value);
    }
}
