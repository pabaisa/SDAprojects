package lt.sdacademy.fundamentalscoding.practicalexercises.reversetxt;

import java.util.Scanner;

public class StringBuilderMain {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite teksta");
        stringBuilder.append(scanner.nextLine());

        //String reverseText = stringBuilder.reverse().toString();

        System.out.println(stringBuilder.reverse());
    }
}
