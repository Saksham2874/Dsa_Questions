public class n_knight {
    public static void main(String[] args) {
        int n = 3;
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        n_knight(board,0,0,0);
    }

    private static void n_knight(char[][] board,int row , int col,int num) {
        int n = board.length;
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
        else if(isSafe(board,row,col)){
            board[row][col] = 'K';
            if(col != n-1) n_knight(board,row,col+1,num+1);
            else n_knight(board,row+1,col,num+1);
            board[row][col] = 'x';
        }
        //not safe
        if(col != n-1) n_knight(board,row,col+1,num);
        else n_knight(board,row+1,col,num);

    }
    private static boolean isSafe(char[][] board , int row , int col){
        int n = board.length;
        int i,j;
        //2 Up 1 Right
        i = row - 2;
        j = col + 1;
        if(i>=0 && j<n && board[i][j] == 'K') return false;
        //2 Up 1 Left
        i = row - 2;
        j = col - 1;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;

        //2 Down 1 Left
        i = row + 2;
        j = col - 1;
        if(i<n && j>=0 && board[i][j] == 'K') return false;
        //2 Down 1 Right
        i = row + 2;
        j = col + 1;
        if(i<n && j<n && board[i][j] == 'K') return false;

        //2 Left 1 Up
        i = row - 1;
        j = col - 2;
        if(i>=0 && j>=0 && board[i][j] == 'K') return false;
        //2 Left 1 Down
        i = row + 1;
        j = col - 2;
        if(i<n && j>=0 && board[i][j] == 'K') return false;

        //2 Right 1 Up
        i = row - 1;
        j = col + 2;
        if(i>=0 && j<n && board[i][j] == 'K') return false;
        //2 Right 1 Down
        i = row + 1;
        j = col + 2;
        if(i<n && j<n && board[i][j] == 'K') return false;

        return true;
    }
}
