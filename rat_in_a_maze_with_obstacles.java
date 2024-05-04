public class rat_in_a_maze_with_obstacles {
    public static void main(String[] args) {
        int no_of_rows = 3;
        int no_of_cols = 4;
        int[][] arr = {
                {1,0,1,1,1,1},
                {1,1,1,1,0,1},
                {0,1,1,1,1,1},
                {0,0,1,0,1,1}
        };
        boolean[][] isVisited = new boolean[no_of_rows][no_of_cols];
        //print_maze_obstacles1(0,0,no_of_rows-1,no_of_cols-1,"",arr);
        print_maze_obstacles2(0,0,no_of_rows-1,no_of_cols-1,"",arr,isVisited);

    }
    //for leftward and downward only
    private static void print_maze_obstacles1(int sr, int sc, int er, int ec,String p,int[][] arr) {
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(p);
            return;
        }
        if(arr[sr][sc] == 0) return;

        print_maze_obstacles1(sr+1,sc,er,ec,p+"D",arr);
        print_maze_obstacles1(sr,sc+1,er,ec,p+"R",arr);

    }
     static void print_maze_obstacles2(int sr, int sc, int er, int ec,String p,int[][] arr, boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(p);
            return;
        }
        if(arr[sr][sc] == 0) return;
        if(isVisited[sr][sc] == true) return;
        isVisited[sr][sc] = true;//check
        print_maze_obstacles2(sr+1,sc,er,ec,p+"D",arr,isVisited);
        print_maze_obstacles2(sr,sc+1,er,ec,p+"R",arr,isVisited);
        print_maze_obstacles2(sr-1,sc,er,ec,p+"U",arr,isVisited);
        print_maze_obstacles2(sr,sc-1,er,ec,p+"L",arr,isVisited);
        isVisited[sr][sc] = false; //backtracking

    }
}
