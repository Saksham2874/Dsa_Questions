import java.util.Arrays;
import java.util.Stack;

public class remove_consecutive_subsequence {
    public static int[] remove(int[] arr){
        int m = arr.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < m ; i++) {
            if(st.size() == 0 || st.peek() != arr[i]) st.push(arr[i]);
            else if(i + 1 < m && st.peek() == arr[i]){
                if(arr[i] != arr[i+1]){
                    st.pop();
                }
            }
        }
        int n = st.size();
        int[] res = new int[n];
        for(int i = n-1 ; i >= 0 ; i--){
            res[i] = st.pop();
        }
        return res;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,10,10,10,4,4,4,5,7,7,2};
        int[] ans = remove(arr);
        System.out.println(Arrays.toString(ans));
    }
}
