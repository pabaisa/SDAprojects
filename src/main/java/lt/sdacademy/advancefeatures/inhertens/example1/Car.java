package lt.sdacademy.advancefeatures.inhertens.example1;

public class Car extends Vehicle {
    private boolean convertible;

    public Car(int maxSpeed, boolean convertible) {
        super(maxSpeed);
        this.convertible = convertible;
    }

    public boolean isConvertible() {
        return convertible;
    }
}
