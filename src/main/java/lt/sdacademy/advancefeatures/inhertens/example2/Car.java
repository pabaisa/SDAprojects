package lt.sdacademy.advancefeatures.inhertens.example2;

public class Car extends Vehicle {
    private String name;

    public Car(int maxSpeed) {
        super(maxSpeed);
    }
    public int isParentHiddenField() {
        return maxSpeed;
    }
}
