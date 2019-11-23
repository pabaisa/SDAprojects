package lt.sdacademy.fundamentalscoding.practicalexercises.triangles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrianglesMain {
    private static final String INPUT_FILE_LOCATION = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\triangles\\trianglesData.txt";
    private static final String OUTPUT_FILE_LOCATION = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\triangles\\result.txt";

    public static void main(String[] args) {

        List<Triangle> triangleList = getTrianglesFromFile();

        calculateTrainglesPerimeter(triangleList);
        writeToFile(triangleList);
    }

    private static List<Triangle> getTrianglesFromFile() {
        List<Triangle> triangles = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))) {
            String line = br.readLine();

            while (line != null) {
                triangles.add(mapDataObject(line.split(",")));
                line=br.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas!");
        } catch (IOException e) {
            System.out.println("Ivyko klaida!");
        }
        return triangles;
    }

    public static Triangle mapDataObject(String[] trianglesData) {
        return new Triangle(Integer.parseInt(trianglesData[0]), Integer.parseInt(trianglesData[1]), Integer.parseInt(trianglesData[2]), TriangleType.valueOf(trianglesData[3]));
    }

    private static void calculateTrainglesPerimeter(List<Triangle> triangles) {
        for (Triangle t : triangles) {
            int sum = t.getA() + t.getB() + t.getC();
            t.setPerimeter(sum);
        }
    }

    private static void writeToFile(List<Triangle> triangleList) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))) {
            for (Triangle t : triangleList) {
                bw.write("Trikampio tipas: " + t.getTriangleType().getTriangleDescription() + " perimetras " + t.getPerimeter() + "\n");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Failas nerastas!");
        } catch (IOException e) {
            System.out.println("Ivyko klaida rasant duomienis i faila!");
        }
    }
}



