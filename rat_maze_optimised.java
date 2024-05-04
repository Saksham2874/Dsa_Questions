public class rat_maze_optimised {
    public static void main(String[] args) {
        int no_of_rows = 3;
        int no_of_cols = 4;
        int[][] arr = {
                {1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}
        };
        print_maze_(0,0,no_of_rows-1,no_of_cols-1,"",arr);
    }

    private static void print_maze_(int sr, int sc, int er, int ec, String s, int[][] arr) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(arr[sr][sc] == 0) return;
        if(arr[sr][sc] == -1) return;
        arr[sr][sc] = -1;//check
        print_maze_(sr+1,sc,er,ec,s+"D",arr);
        print_maze_(sr,sc+1,er,ec,s+"R",arr);
        print_maze_(sr-1,sc,er,ec,s+"U",arr);
        print_maze_(sr,sc-1,er,ec,s+"L",arr);
        arr[sr][sc] = 1; //backtracking



    }
}
