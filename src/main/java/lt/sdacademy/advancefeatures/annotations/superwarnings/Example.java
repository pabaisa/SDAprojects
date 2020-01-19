package lt.sdacademy.advancefeatures.annotations.superwarnings;

import java.util.Arrays;
import java.util.List;

public class Example {
    public static void main (String []args){
        addWordIntoList(Arrays.asList());
    }
    // TODO issiaiskinti "javac" veikima-nustatymus
    // compile class to see warning
    @SuppressWarnings("unchecked")
    private static void addWordIntoList(List inputList){
        List<String> list = (List<String>) inputList;
    }
}
