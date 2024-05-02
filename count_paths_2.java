public class count_paths_2 {
    public static void main(String[] args) {
        int no_of_rows = 3;
        int no_of_cols = 3;
        int count = maze(1,1,no_of_rows,no_of_cols);
        System.out.println(count);
    }

    private static int maze(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec){
            return 0;
        }
        if(sr==er && sc==ec){
            return 1;
        }
        int downways = maze(sr+1,sc,er,ec);
        int rightways = maze(sr,sc+1,er,ec);
        int totalways = rightways + downways;
        return totalways;
    }

}
