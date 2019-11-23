package lt.sdacademy.fundamentalscoding.practicalexercises.circle;

import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite apskritimo spinduli");
        int radius = input.nextInt();
        //String color = "green";

        Circle circle = new Circle(radius, "green");// nusiunti duomenis i objekta
        double plotas = getPlotas(circle); // gauni reiksmes is objekto
        double ilgis = getIlgis(circle);

        System.out.printf("Apskritimo plotas: %.2f", plotas);
        System.out.println();
        System.out.printf("Apskritimo ilgis:  %.2f " , ilgis);
    }

    private static double getPlotas(Circle circle) {
        return Math.pow(circle.getRadius(), 2) + Math.PI;
    }

    private static double getIlgis(Circle circle) {
        return 2 * circle.getRadius() * Math.PI;
    }
}
