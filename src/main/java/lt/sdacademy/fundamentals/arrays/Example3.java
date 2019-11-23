package lt.sdacademy.fundamentals.arrays;


import java.util.List;
import java.util.Arrays;

public class Example3 {
    public static void main(String[] args) {
        int[] arrayOfInts = {10, 15, 20, 25, 30};
        System.out.println(arrayOfInts[0]); // prints 10
        System.out.println(arrayOfInts[2]); // prints 20
        System.out.println(arrayOfInts[4]); // prints 30

        //isspausdins 10 15 20 25 30       "length" - nusako masyvo ilgis
        for (int i = 0; i < arrayOfInts.length; i++) {
            System.out.println(arrayOfInts[i] + " ");
        }
        System.out.println(); // spausdinama tuscia eilute

        // isspausdins 10 15 20 25 30
        for (int i : arrayOfInts) {
            System.out.print(i + " ");
        }

        System.out.println();
        List<Integer> integerList = Arrays.asList(10, 15, 20, 25, 30, 35, 40);
        integerList.forEach(number -> System.out.print(number + " "));

    }


}
