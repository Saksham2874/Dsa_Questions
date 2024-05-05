public class Nqueens_better {
    public static void main(String[] args) {
        int n=4 ;
        char[][] board = new char[n][n];
        // pure board me X bhardo
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                board[i][j] = 'X';
            }
        }
        nqueen(board,0);
    }

    private static void nqueen(char[][] board, int row) {
        int n = board.length;
        //base condition
        if(row==n){
            for (int i = 0; i < n ; i++) {
                for (int j = 0; j < n ; j++) {
                    System.out.print(board[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for (int j = 0; j < n ; j++) {
            if(isSafe(board,row,j)){
                board[row][j] = 'Q'; //assigning queen
                nqueen(board,row+1); //going to next row
                board[row][j] = 'X'; //backtracking
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        //check row
        for (int j = 0; j < n; j++) {
            if(board[row][j] == 'Q') return false;
        }
        //check col
        for (int i = 0; i < n; i++) {
            if(board[i][col] == 'Q') return false;
        }
        //check for north west
        int i = row;
        int j = col;
        while(i>=0 && j>=0){
            if(board[i][j] == 'Q') return false;
            i--;
            j--;
        }
        //check for north east
         i = row;
         j = col;
        while(i>=0 && j<n){
            if(board[i][j] == 'Q') return false;
            i--;
            j++;
        }
        //check for south east
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j] == 'Q') return false;
            i++;
            j++;
        }
        //check for south west
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j] == 'Q') return false;
            i++;
            j--;
        }

        return true;
    }
}
