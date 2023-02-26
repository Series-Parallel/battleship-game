package battleship;

import java.util.Arrays;

public class Fog extends AbstractClass{
    public char[][] field;
    public void setField(char[][] field) {
        this.field = field;
        //field = new char[10][10];
        for(char[] chars: field) Arrays.fill(chars, '~');
    }
    public Fog(){
         field = new char[10][10];
         for (char[] chars : field) Arrays.fill(chars, '~');
    }

    public void printWithFog(char[][] field){
        char letter = 'A';
        System.out.println("  1 2 3 4 5 6 7 8 9 10");
        for (int i = 0; i < field.length; i++) {
            System.out.print(letter++); // A, B, C and so on.
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(" " + field[i][j]);
            }
            System.out.println();
        }
    }
}
