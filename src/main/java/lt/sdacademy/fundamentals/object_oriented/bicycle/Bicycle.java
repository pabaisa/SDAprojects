package lt.sdacademy.fundamentals.object_oriented.bicycle;

public class Bicycle {
    static int count = 0;// nusako keik kartu buvo sukortas objektas
    private int model;
    private int gear;
    private int speed;

    public Bicycle(int model, int gear, int speed) {
        this.model = model;
        this.gear = gear;
        this.speed = speed;
        this.count++;
    }

    public static int getCount(){
    return count;}

    public int getModel() {
        return model;
    }

}

