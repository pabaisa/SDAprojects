package lt.sdacademy.fundamentalscoding.practicalexercises.factorial;

import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in); // sistemai nurodom, kad bus ivedamas skaicius input
        int result = 1;

        System.out.println("Ivesk skaiciu");
        int input = inputScanner.nextInt();

        for (int i = 1; i <=input; i++) {

            result *= i; // rezult = result * i

            System.out.println(result);
            //System.out.println(i);
        }
        System.out.println("Faktorialo: " + input + " rezultatas yra " + result);

    }
}
