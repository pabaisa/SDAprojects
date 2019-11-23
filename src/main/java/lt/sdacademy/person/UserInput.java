package lt.sdacademy.person;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("jusu vardas?");
        String name = input.nextLine();

        System.out.println("jusu amzius");
        int age = input.nextInt();

        System.out.println("jusu ugis");
        double tall = input.nextDouble();


        System.out.println("Vardas: " + name);

        System.out.println("Amzius " + age);

        System.out.println("Ugis: " + tall);

        Person personA = new Person (name, age, tall);

    }
}
