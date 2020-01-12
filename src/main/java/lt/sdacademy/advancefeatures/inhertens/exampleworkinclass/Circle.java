package lt.sdacademy.advancefeatures.inhertens.exampleworkinclass;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, String shape) {
        super(shape);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
