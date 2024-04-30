public class maze_with_obstacles {
    public static void main(String[] args) {
        boolean[][] board = {
                {true, true, true},
                {true,true,false},
                {true,true,true}
        };
        count_paths_with_obstacles("",board,0,0);

    }
    static void count_paths_with_obstacles(String p, boolean[][] maze ,int r , int c){
        if (r == maze.length - 1 && c == maze[0].length -1) {
            System.out.println(p);
            return;
        }
        if (!maze[r][c]) {
            return;
        }
        if(r < maze.length - 1){
            count_paths_with_obstacles(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length -1){
            count_paths_with_obstacles(p+'R',maze,r,c+1);
        }
    }

}
