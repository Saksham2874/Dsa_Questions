import java.util.Stack;

public class insert_at_bottom_or_at_any_index {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println("Original " + st);
        int index = 1; // changing this will change the position of inserted elem
        Stack<Integer> helper = new Stack<>();
        while(st.size() >= index){
            int c = st.pop();
            helper.push(c);
        }
        st.push(1);
        while(helper.size() > 0){
            int c = helper.pop();
            st.push(c);
        }
        System.out.println("After insertion " + st);
    }
}
