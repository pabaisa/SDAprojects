package lt.sdacademy.advancefeatures.generics.exercises2;

import java.util.Arrays;
import java.util.List;
        /*---
        Susikurti klasę, kuri turi vieną Generic statinį metodą, kurio pagalba
        yra gražinama paskutinė, į ją paduoto sąrašo reikšmė.
        Išmėginti tiek su String tipo, tiek su Integer tipo sąrašais.
        ---*/

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c");
        List<Integer> integers = Arrays.asList(2, 99, 9954);

        System.out.println(GenericClass.lastEntry(integers));
        System.out.println(GenericClass.lastEntry(strings));
    }
}
