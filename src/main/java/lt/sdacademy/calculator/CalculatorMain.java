package lt.sdacademy.calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner actionScanner = new Scanner(System.in);

// kol kintamasis tures reiksme true, skaiciuok
        boolean calculate = true;
        double result = 0;

        while (calculate) {

            double firstNumb = getNum("Ivesk pirma skaiciu");
            double secondNumb = getNum("Ivesk antra skaiciu");

            System.out.println("Koki veiksma norite atlikti: + - / *");
            String action = actionScanner.nextLine();


           /* switch (action) {
                case ("+"): {
                    System.out.println(firstNumb + secondNumb);
                    break;
                }
                case ("-"): {
                    System.out.println(firstNumb - secondNumb);
                    break;
                }

                case ("*"): {
                    System.out.println(firstNumb * secondNumb);
                    break;
                }

                case ("/"): {
                    System.out.println(firstNumb / secondNumb);
                    break;
                }

                default: {
                    System.out.println("Veiksmas nerastas");
                    break;
                }*/

        /*if (action.equals("+")) {
            System.out.println("Atsakymas " + (firstNumb + secondNumb));
        } else if (action.equals("-")) {
            System.out.println("Atsakymas " + (firstNumb - secondNumb));
        } else if (action.equals("*")) {
            System.out.println("Atsakymas "+ (firstNumb * secondNumb));
        } else if (action.equals("/")) {
            System.out.println("Atsakymas "+ (firstNumb / secondNumb));
        } else {
            System.out.println("Nezinomas veiksmas");*/

            result = getResult(action, firstNumb, secondNumb);
            System.out.println("gautas rezultatas: " + result);
            System.out.println("Ar noirite sakiciuoti toliau? TAIP : NE");
            String answer = actionScanner.nextLine();
            // "||" - arba
            // answer.toLowerCase().equals("ne") - ivesta ataskyma pavercia mazosiomis raidemis
            if (answer.equals("NE") || answer.toLowerCase().equals("ne")) {
                calculate = false;
            }
        }
    }

    private static double getNum(String message) {
        Scanner numberScanner = new Scanner(System.in);
        System.out.println(message);
        double number = numberScanner.nextDouble();
        return number;
    }


    private static double getResult(String action, double num1, double num2) {
        switch (action) {
            case ("+"): {
                return num1 + num2;

            }
            case ("-"): {
                return num1 - num2;

            }

            case ("*"): {
                return num1 * num2;

            }

            case ("/"): {
                return num1 / num2;

            }

            default: {
                System.out.println("Veiksmas nerastas");
                return 0;
            }

        }

    }
}
