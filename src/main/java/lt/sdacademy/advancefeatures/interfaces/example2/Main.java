package lt.sdacademy.advancefeatures.interfaces.example2;

public class Main {
    public static void main (String[]args) {
        Balloon myBalloon = new Balloon(10);
        Plane myPlane = new Plane(500);

        System.out.println(myBalloon.getSpeed());
        System.out.println(myBalloon.maxSpeed());

        System.out.println(myPlane.getSpeed());
        System.out.println(myPlane.canFly("fast"));
    }
}
