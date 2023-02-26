package battleship;

import java.io.IOException;

public class AbstractClass {

    static Fog fogField1 = new Fog();
    static Field field1 = new Field();
    static char[][] fA1 = new char[10][10];
    static char[][] ffA1 = new char[10][10];
    static Players p1 = new Players();

    static Fog fogField2 = new Fog();
    static Field field2 = new Field();
    static char[][] fA2 = new char[10][10];
    static char[][] ffA2 = new char[10][10];
    static Players p2 = new Players();


    public static void pressEnterKey() {
        System.out.print("Press Enter and pass the move to another player");
        try {
            System.in.read();
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
