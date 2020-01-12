package lt.sdacademy.advancefeatures.inhertens.example2;

public class ExampleMain {
    public static void main(String[] args) {
        Car myCar = new Car(310);
        System.out.println(myCar.toString());

        Vehicle myCarVehicle = new Car(210);

        Vehicle vehicle = new Vehicle(85);
        System.out.println(vehicle.toString());
    }
}
