import java.util.Stack;

public class copy_stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Original " + st);
        Stack<Integer> helper = new Stack<>();
        while(st.size() > 0){
            int c = st.pop();
            helper.push(c);
        }
        System.out.println("Helper " + helper);
        Stack<Integer> res = new Stack<>();
        while(helper.size() > 0){
            int c = helper.pop();
            res.push(c);
        }
        System.out.println("Result " + res);
    }
}
