package lt.sdacademy.fundamentalscoding.practicalexercises.maxvalue;

import java.util.Scanner;

public class MaxValueMain {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Ivesk skaiciu seka");
        String numbersInText = inputScanner.nextLine();   // kad vartotojui ivesti skaicius-teksta
        String[] numberArr = numbersInText.split(","); // isskiriam skaicius atskirtus kableliais

        int max = Integer.parseInt(numberArr[0]); // priskiriams skaiciu max verte ir nurodom jo eile sekoje
        for (int i = 0; i < numberArr.length; i++){ // ciklas (pradedam nuo 0; 0 <
            int number = Integer.parseInt(numberArr[i]); // teksta pavercia skaiciumi
            if (number > max){
                max=number;

            }
        }
         System.out.println("Maksimali reiksme is sekos yra " + max);

    }
}
