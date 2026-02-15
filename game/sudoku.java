package game;
public class sudoku {

    public boolean isSafe(char[][] board, int row, int col, int number) {
        char ch = (char) (number + '0');

        // Row and Column check
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == ch)
                return false;

            if (board[row][i] == ch)
                return false;
        }

        // 3x3 Box check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;

        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == ch)
                    return false;
            }
        }

        return true;
    }

    public boolean helper(char[][] board, int row, int col) {

        if (row == board.length) {
            return true;
        }

        int nrow, ncol;

        if (col != board.length - 1) {
            nrow = row;
            ncol = col + 1;
        } else {
            nrow = row + 1;
            ncol = 0;
        }

        if (board[row][col] != '.') {
            return helper(board, nrow, ncol);
        } else {

            for (int i = 1; i <= 9; i++) {

                if (isSafe(board, row, col, i)) {
                    board[row][col] = (char) (i + '0');

                    if (helper(board, nrow, ncol))
                        return true;
                    else
                        board[row][col] = '.';
                }
            }
        }

        return false;
    }

    // Print Board
    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {

        sudoku obj = new sudoku();

        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },

                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },

                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        System.out.println("Sudoku Before Solving:");
        printBoard(board);

        obj.helper(board, 0, 0);

        System.out.println("\nSudoku After Solving:");
        printBoard(board);
    }
}
