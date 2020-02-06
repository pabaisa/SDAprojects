package lt.sdacademy.advancefeaturescoding.interfaces;

public class EquilateralTriangle implements RegularPolygon {

    private int lenght;

    public EquilateralTriangle(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int getNumSides() {
        return 3;
    }

    @Override
    public int getSideLength() {
        return lenght;
    }
}
