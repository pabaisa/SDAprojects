package lt.sdacademy.fundamentals.object_oriented.room;

public class Room {
    private int width;
    private int lenght;

    // sukuriu objektus
    public Room(int width, int lenght) {
        this.width = width;
        this.lenght = lenght;
    }
// padarau, kad jie butu pasiekiami is kitu klasiu
    public int getWidth() {
        return width;
    }

    public int getLenght() {
        return lenght;
    }
}