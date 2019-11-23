package lt.sdacademy.fundamentals.file_read.scanner;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static lt.sdacademy.fundamentals.file_read.Util.FILE_LOCATION;

public class ScannerExampelMain {
    public static void main(String[] args) {
        // Need to close
        try {
            Scanner fileScanner = new Scanner(new File(FILE_LOCATION));
            while (fileScanner.hasNext()) { // kol faile egzistuoje tekstas
                System.out.println(fileScanner.nextLine());
            }
            fileScanner.close();
        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
        // Close atomatically
        try (Scanner fileScanner = new Scanner(new File(FILE_LOCATION))) {
            while (fileScanner.hasNext()) {
            }
        } catch (IOException e) {
            System.out.println("KLAIDA !");
        }
    }
}

