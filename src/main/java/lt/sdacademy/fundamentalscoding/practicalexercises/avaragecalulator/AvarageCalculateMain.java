package lt.sdacademy.fundamentalscoding.practicalexercises.avaragecalulator;

import java.util.Arrays;
import java.util.List;

public class AvarageCalculateMain {
    public static void main(String[] args) {
        // sarasas<tipas> pavadinimas
        List<Integer> integers = Arrays.asList(1, 2, 48, 88, 5, 1, 287, 475);
        // reiksmes pridejimas - "integers.add(123)";
        // reiksmes istrynimas - "integers.remove(123)";
        int sum = 0;
        // double average = 0;

        for (Integer number : integers) {
            sum += number;
        }
        System.out.println(sum);
        double average = (double) sum / integers.size();
        //avarege = sum / integers.size();
        // printf - eilute su parametru
        System.out.printf("Vidurkis: %.4f ", average);

    }
}


