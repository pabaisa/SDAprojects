package lt.sdacademy.advancefeatures.inhertens.exampleworkinclass;

public abstract class RightAngleRectangle extends Shape {
    private double width;
    private double hight;

    public RightAngleRectangle(double width, double hight, String shapeDescription) {
        super(shapeDescription);
        this.width = width;
        this.hight = hight;
    }

    public double getWidth() {
        return width;
    }

    public double getHight() {
        return hight;
    }
}
