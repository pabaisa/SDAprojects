package lt.sdacademy.advancefeatures.inhertens.exampleworkinclass;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Susikurti abstrakčią klasę `Shape` ir jį paveldėti:
    * `Shape` klasė privalo turėti lauką: `shapeDescription`;
    * Susikurti objektą `Circle` su lauku `radius`;
    * Susikurti  abstrakčią klasę `RightAngleRectangle` su laukais `width`, `height`;
    * Susikurti objektą `Rectangle` ir paveldėti objektą RightAngleRectangle;
    * Inicializuoti sukurtus `Circle` ir `Rectangle` objektus;
    * Apskaičiuoti apskritimo plotą ir ilgį;
    * Apskaičiuoti stataus trikampio plotą - ```(a*b)/2``` ir stačiakampio plotą;
    * Duomenys įvedami naudotojo per ekraną;
    * Gautus rezultatus įrašyti į failą naudojantis BufferedWriter objekta
 */
public class ShapeMain {
    public static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\advancefeatures\\inhertens\\exampleworkinclass\\results.txt";

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Iveskite apskritimo spinduli ");
        double radius = input.nextDouble();
        Circle circle = new Circle(radius, "kassas");

        System.out.println("Iveskite staciakampio ploti ir ilgi ");
        double width = input.nextDouble();
        double hight = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, hight);

        System.out.printf("Apskritimo plotas %.2f", getCicleArea(circle));
        System.out.println();
        System.out.printf("Apskritimo ilgis %.2f", getCicleLong(circle));
        System.out.println();
        System.out.println("Stataus trikampio plotas " + getTriangleArea(rectangle));
        System.out.println("Staciakampio plotas " + getRectangleArea(rectangle));

        writeDataToFile(getCicleArea(circle), getCicleLong(circle), getTriangleArea(rectangle), getRectangleArea(rectangle));
    }

    private static void writeDataToFile(double getCicleArea, double getCicleLong, double getTriangleArea, double getRectangleArea) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            bw.write(String.format("%.2f\n", getCicleArea));
            bw.write(String.format("%.2f\n", getCicleLong));
            bw.write(String.format("%.2f\n", getTriangleArea));
            bw.write(String.format("%.2f\n", getRectangleArea));
        } catch (FileNotFoundException e) { // jei blogs linkas, iesko kelio klaidos
            System.out.println("Failas nerastas");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomenis i failus!");
        }
    }

    public static double getCicleArea(Circle circle) {
        return Math.PI * Math.pow(circle.getRadius(), 2);
    }

    public static double getCicleLong(Circle circle) {
        return 2 * Math.PI * circle.getRadius();
    }

    public static double getTriangleArea(Rectangle rectangle) {
        return rectangle.getHight() * rectangle.getWidth() / 2;
    }

    public static double getRectangleArea(Rectangle rectangle) {
        return rectangle.getWidth() * rectangle.getHight();
    }
}
