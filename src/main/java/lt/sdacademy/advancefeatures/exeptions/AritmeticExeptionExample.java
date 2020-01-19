package lt.sdacademy.advancefeatures.exeptions;

public class AritmeticExeptionExample {
    public static void main(String[]args){
        try {
            int a = 30;
            int b = 0;
            int c = a/b;
            System.out.println("Result = " +c);
        } catch (ArithmeticException e){
            System.out.println("Can't divide a number bu 0");
        }finally {
            System.out.println("Executing finally block!");
        }
    }
}
