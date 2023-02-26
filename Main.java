package battleship;

public class Main extends AbstractClass{

    public static void main(String[] args) {

        p1.playerField(1,field1,fA1,fogField1,ffA1);
        pressEnterKey();
        p2.playerField(2,field2,fA2,fogField2,ffA2);
        pressEnterKey();
        p1.player1ShootingFrom(1,ffA2,fA1,fA2,field1,fogField2);
    }
}