package lt.sdacademy.advancefeatures.interfaces.example1;

public interface Shape {
    double getArea();
    double getPerimeter ();

    default void print(){
        System.out.println("Shape: " + this);
        //System.out.println("perimeter: " + getPerimeter());
        //System.out.println("area " + getArea());
    }
}
