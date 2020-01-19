package lt.sdacademy.advancefeatures.exeptions.exercises;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please write number");

        String text = scanner.nextLine();
        try {
            int number = Integer.parseInt(text);
            System.out.println("int number = " + number);
        } catch (NumberFormatException e) {
            try {
                double number2 = Double.parseDouble(text);
                System.out.println("double number = " + number2);
            } catch (NumberFormatException ex) {
                System.out.println("Bad input");
            }
        }

    }
}
