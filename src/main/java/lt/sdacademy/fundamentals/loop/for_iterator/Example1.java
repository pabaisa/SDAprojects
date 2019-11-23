package lt.sdacademy.fundamentals.loop.for_iterator;

public class Example1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int x = 0; x < 10; x++) {
            System.out.println("x is " + x);
            sum = sum + x;
        }

//        x = 0 sum = 0
//        x = 1 sum = 1
//        x = 2 sum = 3
//        x =  3 sum =  6


    }
}
