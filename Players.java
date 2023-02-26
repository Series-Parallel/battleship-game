package battleship;

public class Players extends AbstractClass {
    boolean charFound = false;
    boolean charFoundInEnemy = false;
    char character ='O';
    public void playerField(int player, Field fieldAlly, char[][] fieldArrayAlly, Fog fogFieldAlly,
                            char[][] fogFieldArrayAlly) {
        fieldAlly.setFieldArray(fieldArrayAlly);
        fogFieldAlly.setField(fogFieldArrayAlly);
        System.out.printf("Player %d place your field:", player);
        System.out.println();
        fieldAlly.print(fieldArrayAlly);
        for (Ship ship : Ship.values()) {
            fieldAlly.setShip(ship, fieldArrayAlly);
            fieldAlly.print(fieldArrayAlly);
        }
    }

    public void player1ShootingFrom(int player, char[][] fogFieldArrayEnemy, char[][] fieldArrayAlly,
                                    char[][] fieldArrayEnemy,
                                    Field fieldAlly, Fog fogFieldEnemy) {
        fieldAlly.setShot(player, fogFieldArrayEnemy, fieldArrayAlly, fieldAlly, fogFieldEnemy, fieldArrayEnemy);
        OuterLoop:
        for(int i=0; i<fieldArrayEnemy.length; i++){
            for(int j=0; j<fieldArrayEnemy[i].length; j++){
                if(fieldArrayEnemy[i][j]==character){
                    charFound=true;
                    break OuterLoop;
                }
                else charFound=false;
            }
        }
        if (charFound){
            InnerLoop:
            for(int i=0; i<fieldArrayAlly.length; i++){
                for (int j=0; j<fieldArrayAlly[i].length; j++){
                    if(fieldArrayAlly[i][j]==character){
                        charFoundInEnemy=true;
                        break InnerLoop;
                    }
                    else
                        charFoundInEnemy=false;
                }
            }if (charFoundInEnemy) {
                pressEnterKey();
                player2ShootingFrom(2, ffA1, fA2, fA1, field2, fogField1);
            }else {
                System.out.println("Player 2 won the game. Congratulations!");
            }
        }else {
            System.out.println("Player 1 won the game. Congratulations!");
        }




    }

    private void player2ShootingFrom(int player, char[][] fogFieldArrayEnemy, char[][] fieldArrayAlly,
                                     char[][] fieldArrayEnemy,
                                     Field fieldAlly, Fog fogFieldEnemy) {
        fieldAlly.setShot(player, fogFieldArrayEnemy, fieldArrayAlly, fieldAlly, fogFieldEnemy, fieldArrayEnemy);
        OuterLoop:
        for(int i=0; i<fieldArrayEnemy.length; i++){
            for(int j=0; j<fieldArrayEnemy[i].length; j++){
                if(fieldArrayEnemy[i][j]==character){
                    charFound=true;
                    break OuterLoop;
                }else
                    charFound=false;
            }
        }
        if (charFound){
            InnerLoop:
            for(int i=0; i<fieldArrayAlly.length; i++){
                for (int j=0; j<fieldArrayAlly[i].length; j++){
                    if(fieldArrayAlly[i][j]==character){
                        charFoundInEnemy=true;
                        break InnerLoop;
                    }else
                        charFoundInEnemy=false;
                }
            }if (charFoundInEnemy) {
                pressEnterKey();
                player1ShootingFrom(1,ffA2,fA1,fA2,field1,fogField2);
            }else {
                System.out.println("Player 1 won the game. Congratulations!");
            }
        }else{
            System.out.println("Player 2 won the game. Congratulations!");
        }


    }
}
