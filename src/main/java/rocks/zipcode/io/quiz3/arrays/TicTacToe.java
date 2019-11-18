package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
        private String [][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
       board = new String[0][0];

    }

    public String[] getRow(Integer value) {

        return board[value];
    }

    public String[] getColumn(Integer value) {

        return new String[]{board[0][value],board[1][value],board[2][value]};}

    public Boolean isRowHomogenous(Integer rowIndex) {
        String[] row = getRow(rowIndex);
        return homoArray(row);
    }

    private Boolean homoArray(String [] array) {
        boolean homoArray = true;
        for ( int i=1 ; i<array.length; i++){
            if ( !array[i].equals(array[i-1]))
                return false;
        }
        return homoArray ;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        return true;
    }

    public String getWinner() {
        String winner = "no winner";
        for (int i = 0; i < board.length; i++) {
            if (isRowHomogenous(i)) {
                winner = board[i][0];
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (isColumnHomogeneous(i)) {
                winner = board[0][i];
            }
        }

        return winner;


    }

}
