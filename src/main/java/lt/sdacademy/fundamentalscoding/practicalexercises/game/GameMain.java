package lt.sdacademy.fundamentalscoding.practicalexercises.game;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class GameMain {
    public static final String FILE_LOCATION = "C:\\Users\\Modestas\\IdeaProjects\\bandymas\\src\\main\\java\\lt\\sdacademy\\fundamentalscoding\\practicalexercises\\game\\word.txt";

    public static void main(String[] args) {
        Scanner textScanner = new Scanner(System.in);
        System.out.println("nuskaitytas zodis is failo - " + word());
        char[] wordToChar = word().toCharArray();
        System.out.println("zodis isskaidytas i atskirus simbolius - " + String.valueOf(wordToChar));
        System.out.println("zodis pakeistas i '_' - " + String.valueOf(replaceLetterToUndrescore(wordToChar)));
        System.out.println("---------------------------------------------------------------------------");

        System.out.println("zodis kuri reikia atspeti - " + String.valueOf(replaceLetterToUndrescore(wordToChar)));

        System.out.println("Iveskite raide arba zodi ");
        String input = textScanner.nextLine();
        if (input.equals(word())) {
        System.out.println("Jus atspejote zodi - " + word());}
        }
      //  else if ()




    private static String word() {
        String line = "xxxx";
        try (BufferedReader br = new BufferedReader(new FileReader(FILE_LOCATION))) {
            line = br.readLine();

        } catch (IOException e) {
            System.out.println("Klaida!");
        }
        return line;
    }

    private static char[] replaceLetterToUndrescore(char[] wordToChar) {
        char[] underscoreArray = new char[wordToChar.length];
        for (int i = 0; i < wordToChar.length; i++) {
            underscoreArray[i] = '_';
        }
        return underscoreArray;
    }

}
