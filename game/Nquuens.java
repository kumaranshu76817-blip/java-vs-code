package game;
import java.util.ArrayList;
import java.util.List;

public class Nquuens {

     public static boolean isSafe(int row, int col, char[][] board) {

        // check row
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q')
                return false;
        }

        // check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        // upper-left diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q')
                return false;
        }

        // upper-right diagonal
        for (int r = row, c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q')
                return false;
        }

        // lower-left diagonal
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q')
                return false;
        }

        // lower-right diagonal
        for (int r = row, c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q')
                return false;
        }

        return true;
    }

    // Save board to answer list
    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q')
                    row += 'Q';
                else
                    row += '.';
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    // Backtracking
    public static void helper(char[][] board, List<List<String>> allBoards, int col) {

        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';   // backtrack
            }
        }
    }

    // Main function
    public static List<List<String>> solveQueens(int n) {

        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        helper(board, allBoards, 0);
        return allBoards;
    }

    // Testing
    public static void main(String[] args) {
        List<List<String>> result = solveQueens(4);
        System.out.println(result);
    }
}