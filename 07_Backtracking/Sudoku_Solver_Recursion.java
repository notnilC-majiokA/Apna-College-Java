public class Sudoku_Solver_Recursion{
    public static boolean isSafe(char[][] board, int row, int col, int number){
        for(int i=0; i<board.length; i++){
            if(board[i][col] == (char)(number + '0')){
                return false;
            }
            if(board[row][i] == (char)(number + '0')){
                return false;
            }
        }
        //grid
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(board[i][j] == (char)(number + '0')){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean helper(char[][] board, int row, int col){
        if(row == board.length){
            return true;
        }

        int nrow = 0;
        int ncol = 0;

        if(col != board.length - 1){
            nrow = row;
            ncol = col + 1;
        }else{
            nrow = row + 1;
            ncol = 0;
        }

        if(board[row][col] != '_'){
            return helper(board, nrow, ncol);
        }else{
            for(int i=1; i<10; i++){
                if(isSafe(board, row, col, i)){
                    board[row][col] = (char)(i + '0');
                    if(helper(board, nrow, ncol)){
                        return true;
                    }else{
                        board[row][col] = '_';
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        char[][] board = {{'5', '3', '_', '_', '7', '_', '_', '_', '_'},
            {'6', '_', '_', '1', '9', '5', '_', '_', '_'},
            {'_', '9', '8', '_', '_', '_', '_', '6', '_'},
            {'8', '_', '_', '_', '6', '_', '_', '_', '3'},
            {'4', '_', '_', '8', '_', '3', '_', '_', '1'},
            {'7', '_', '_', '_', '2', '_', '_', '_', '6'},
            {'_', '6', '_', '_', '_', '_', '2', '8', '_'},
            {'_', '_', '_', '4', '1', '9', '_', '_', '5'},
            {'_', '_', '_', '_', '8', '_', '_', '7', '9'}
        };
        if(helper(board,0,0)){
            System.out.println("Sudoku solved succesfully");
            printBoard(board);
        }else{
            System.out.println("No solution exists for the given Sudoku Puzzle");
        }
    }
    public static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("---------------------"); // Block row divider
            }
            for (int j = 0; j < board[i].length; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("| "); // Block column divider
                }
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
