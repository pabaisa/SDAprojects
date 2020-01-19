package lt.sdacademy.advancefeatures.generics.genericinterface;

public class Main {

    public static void main (String[]args){
        Car car1 = new Car (200);
        Car car2 = new Car (60);

        if (car1.compareTo(car2)>0){
            System.out.println("car1 is faster!");
        }
    }
}
