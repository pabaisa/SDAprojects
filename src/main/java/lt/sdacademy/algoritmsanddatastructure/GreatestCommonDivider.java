package lt.sdacademy.algoritmsanddatastructure;

import java.util.Scanner;

public class GreatestCommonDivider {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        while (a != b) {
            if (a < b) {
                b = b - a;
            }
            else a = a-b;
        }
        System.out.println("bendras didziausias dalikslis yra" + a);
    }
}
