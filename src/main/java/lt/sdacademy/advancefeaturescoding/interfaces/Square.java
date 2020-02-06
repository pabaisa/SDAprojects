package lt.sdacademy.advancefeaturescoding.interfaces;

public class Square implements RegularPolygon{
    private int lenght;

    public Square(int lenght) {
        this.lenght = lenght;
    }

    @Override
    public int getNumSides() {
        return 4;
    }

    @Override
    public int getSideLength() {
        return lenght;
    }
}
