package battleship;

import java.util.Scanner;

public class Shoot extends Players{

    public void setShot(int player,char[][] fogFieldArrayEnemy,char[][] fieldArrayAlly,
                        Field fieldAlly, Fog fogFieldEnemy,
                         char[][] fieldArrayEnemy) {

        fogFieldEnemy.printWithFog(fogFieldArrayEnemy);
        System.out.println("---------------------");
        fieldAlly.print(fieldArrayAlly);
        System.out.printf("Player %d, it's your turn: ",player);

        toDigitCoordinate(fogFieldArrayEnemy,fieldArrayEnemy);

    }
    public void toDigitCoordinate(char[][] fogFieldArrayEnemy,
                                   char[][] fieldArrayEnemy) {
        Scanner scanner = new Scanner(System.in);

        int[] result = new int[2];
        while (true) {
            System.out.println();
            String coordinates = scanner.nextLine();
            System.out.println();
            result[0] = coordinates.split(" ")[0].charAt(0) - 65;
            result[1] = Integer.parseInt(coordinates.split(" ")[0].substring(1)) - 1;
            if (result[0] <= 9 && result[1] <= 9) {
                checkAndDoShot(result[0], result[1], fogFieldArrayEnemy,fieldArrayEnemy);
                break;
            } else {
                System.out.println("Error! You entered the wrong coordinates! Try again\n");
            }
        }
    }

    public void checkAndDoShot(int row, int col,char[][] fogFieldArrayEnemy, char[][] fieldArrayEnemy) {


        if (fieldArrayEnemy[row][col] == 'O' || fieldArrayEnemy[row][col]=='X') {
            if (row == 0 && col == 0) {
                if (fieldArrayEnemy[row + 1][col] == 'O' || fieldArrayEnemy[row][col + 1] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship!");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");
                }
            } else if ((row < 9 && row > 0) && col == 0) {
                if (fieldArrayEnemy[row - 1][col] == 'O' || fieldArrayEnemy[row][col + 1] == 'O' || fieldArrayEnemy[row + 1][col] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship!");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");

                }

            } else if (row == 9 && col == 0) {
                if (fieldArrayEnemy[row - 1][col] == 'O' || fieldArrayEnemy[row][col + 1] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship!");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");
                }
            } else if (row == 9 && col < 9) {
                if (fieldArrayEnemy[row][col - 1] == 'O' || fieldArrayEnemy[row][col + 1] == 'O' || fieldArrayEnemy[row - 1][col] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship!");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");
                }

            } else if (row == 9 && col == 9) {
                if (fieldArrayEnemy[row][col - 1] == 'O' || fieldArrayEnemy[row - 1][col] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship!");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");
                }
            } else if ((row < 9 && row > 0) && col == 9) {
                if (fieldArrayEnemy[row - 1][col] == 'O' || fieldArrayEnemy[row][col - 1] == 'O' || fieldArrayEnemy[row + 1][col] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship!");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");
                }

            } else if (row == 0 && col == 9) {
                if (fieldArrayEnemy[row + 1][col] == 'O' || fieldArrayEnemy[row][col - 1] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship!");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");
                }
            } else if (row == 0 && (col > 0 && col < 9)) {
                if (fieldArrayEnemy[row][col - 1] == 'O' || fieldArrayEnemy[row][col + 1] == 'O' || fieldArrayEnemy[row + 1][col] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship! ");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");
                }
            } else if ((row > 0 && row < 9) && (col > 0 && col < 9)) {
                if (fieldArrayEnemy[row - 1][col] == 'O' || fieldArrayEnemy[row][col + 1] == 'O' || fieldArrayEnemy[row + 1][col] == 'O' || fieldArrayEnemy[row][col - 1] == 'O') {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You hit a ship! ");
                } else {
                    fieldArrayEnemy[row][col] = 'X';
                    fogFieldArrayEnemy[row][col] = 'X';
                    System.out.println("You sank a ship!");
                }

            } else {
                fieldArrayEnemy[row][col] = 'X';
                fogFieldArrayEnemy[row][col] = 'X';
                System.out.println("You sank a ship!");
            }
        } else{
            fieldArrayEnemy[row][col] = 'M';
            fogFieldArrayEnemy[row][col] = 'M';
            System.out.println("You missed!");
        }
    }


}
