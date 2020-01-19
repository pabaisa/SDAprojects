package lt.sdacademy.advancefeatures.interfaces.example1;

public class Rectangle implements Shape{
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return (a+b)*2;
    }
}
