package lt.sdacademy.advancefeatures.lambdaexpression.example1;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionInterfaceExample2 {
    public static void main (String[] args){
        Function <String, Integer> stringLenght = s-> s.length();
        System.out.println(stringLenght.apply("ABCDE"));

        Function<String, String> replaceCommasWithDots = s -> s.replaceAll(",", ".");
        System.out.println(replaceCommasWithDots.apply("A, B, C, D, E, F, G"));
        System.out.println(replaceAll("A, B, C, D, E, F, G"));
    }
    private static String replaceAll (String word){
        return word.replaceAll(",", ".");
    }
}
