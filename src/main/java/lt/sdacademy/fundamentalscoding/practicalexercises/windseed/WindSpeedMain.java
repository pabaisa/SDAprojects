package lt.sdacademy.fundamentalscoding.practicalexercises.windseed;

import java.util.Scanner;

public class WindSpeedMain {
    // static sisikurs viena karta
    // final - nekeiciamas
    private static final double NAUTIC_MILE = 1.852;
    private static final double BEAUFRT_CONSTANT = 3.01;

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Iveskite vejo greiti km/h");
        int windspeed = inputScanner.nextInt();

        System.out.printf("vejo greitis mazgais: %.1f", windspeed * NAUTIC_MILE);

        System.out.println();
        System.out.println("vejo greitis Beofordo skaleje " + getBeauford(windspeed)); // Math.pov - keliam laipsniu
        System.out.print("Vejo stiprumas: " + getWindSttrenght(windspeed));
        //return windspeed <= 20 ? "ramus" : "stiprus";
        /*if (windspeed > 20) {
            System.out.println("stiprus");
        } else {
            System.out.println("silpnas");
        }*/
    }

    private static double getBeauford(double windspeed) {
        int beaufort = (int) Math.pow(windspeed / BEAUFRT_CONSTANT, 1.5);
        return Math.min(beaufort, 12);

    }
    private static String getWindSttrenght (int windspeed) {
        return windspeed <= 20 ? "ramus" : "stiprus";


    }
}


