package lt.sdacademy.advancefeatures.inhertens.example2;

public class Vehicle {
    protected int maxSpeed;
    public Vehicle (int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    @Override
    public String toString(){
        return "Fields values: maxSpeed = " + maxSpeed;
    }
}
