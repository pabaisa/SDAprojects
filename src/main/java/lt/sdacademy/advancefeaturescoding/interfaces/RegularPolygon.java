package lt.sdacademy.advancefeaturescoding.interfaces;

public interface RegularPolygon {

    int getNumSides();

    int getSideLength();

    default int getPerimeter (){
       return (getNumSides()*getSideLength());
    }
    default double getInteriorAngle(){
        return (Math.PI*(getNumSides()/2)/getNumSides());
    }

}
