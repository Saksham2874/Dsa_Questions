public class count_paths {
    public static void main(String[] args) {
        System.out.println(countPath(4,4));
    }
    static int countPath(int r , int c){
        if(r==1 || c==1){
            return 1;
        }
        int left = countPath(r-1,c);
        int right = countPath(r,c-1);
        return left + right;
    }
}
