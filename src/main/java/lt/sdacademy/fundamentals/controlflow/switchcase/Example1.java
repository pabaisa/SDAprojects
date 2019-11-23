package lt.sdacademy.fundamentals.controlflow.switchcase;

public class Example1 {
    public static void main(String[] args) {

        // char - simbolis
        char direction = 'w';

        switch (direction) {
            case 'n':
                System.out.println("Kelaiujame siaures kryptimi!");
                break;
            case 's':
                System.out.println("Kelaiujame pietu kryptimi!");
                break;
            case 'e':
                System.out.println("Kelaiujame rytu kryptimi!");
                break;
            case 'w':
                System.out.println("Kelaiujame vakaru kryptimi!");
                break;
            default:
                System.out.println("Kelaiujame nezinoma kryptimi!");


        }
    }
}
