package lt.sdacademy.advancefeatures.inhertens.example1;

public class ExampleMain {
    public static void main (String[]args){
        Car myCar = new Car (30, false);
        Vehicle myCarVehicle = new Car(210, true);

        Vehicle vehicle = new Vehicle(85);
        System.out.println(vehicle.toString());
        System.out.println(myCar.toString());
    }
}