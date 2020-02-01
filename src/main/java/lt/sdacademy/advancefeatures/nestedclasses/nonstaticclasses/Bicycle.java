package lt.sdacademy.advancefeatures.nestedclasses.nonstaticclasses;

public class Bicycle {
    private int maxSpeed;

    public Bicycle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public class Wheel {
        public void demage(){
            maxSpeed *=0.5;
        }
    }
}
