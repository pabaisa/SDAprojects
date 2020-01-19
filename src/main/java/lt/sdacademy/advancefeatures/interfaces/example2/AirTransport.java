package lt.sdacademy.advancefeatures.interfaces.example2;

public abstract class AirTransport {
    protected int speed;

    public AirTransport(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}
