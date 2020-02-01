package lt.sdacademy.advancefeatures.nestedclasses.nonstaticclasses;

public class NestedNonStaticExample {
    public static void main (String[] args){
        Bicycle bicycle = new Bicycle(24);
        System.out.println(bicycle.getMaxSpeed());

        Bicycle.Wheel wheel = bicycle.new Wheel();
        wheel.demage();
        System.out.println(bicycle.getMaxSpeed());
    }
}
