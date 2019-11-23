package lt.sdacademy.fundamentals.object_oriented.room;

import java.util.Scanner;

public class RoomMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("prasome ivesti kambario ilgi");
        int lenght = scanner.nextInt();

        System.out.println("prasome ivesti kambario ploti");
        int widht = scanner.nextInt();

        //System.out.println("kambario plotas yra " + widht * lenght);

        Room room = new Room(widht, lenght);

        int squareOfRoom = getSquareOfRoom(room.getLenght(), room.getWidth()); //???

        System.out.println("Kambario plotas: " + squareOfRoom);
    }

    private static int getSquareOfRoom(int lenght, int width) {
        return lenght * width;
    }
}
