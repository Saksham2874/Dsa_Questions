import java.util.*;
public class minstack {
    static class MinStack {
        // APPROACH 2 (without extra stack)
        Stack<Long> st = new Stack<>();
        long min = -1;

        public MinStack() {
            // constructor
        }

        public void push(int val) {
            long x = (long) val;
            if (st.size() == 0) {
                st.push(x);
                min = x;
            } else if (x >= min) {
                st.push(x);
            } else {
                st.push(2 * x - min);
                min = x;
            }
        }

        public void pop() {
            if (st.size() == 0) return;
            long t = st.peek();
            if (t >= min) st.pop();
            else { // fake value padi hai peek pe
                long oldmin = 2 * min - t;
                min = oldmin;
                st.pop();
            }
        }

        public int top() {
            if (st.size() == 0) return -1;
            long q = st.peek();
            if (q >= min) return (int) q;
            if (q < min) {
                return (int) min;
            }
            return 0;
        }

        public int getMin() {
            if (st.size() == 0) return -1;
            return (int) min;
        }

        // APPROACH 1
        // Stack<Integer> st = new Stack<>();
        // Stack<Integer> min = new Stack<>(); // EXTRA STACK USED


        // public void push(int val) {
        //     if(st.size()==0){
        //         st.push(val);
        //         min.push(val);
        //     }
        //     else{
        //         st.push(val);
        //         if(min.peek() < val) {
        //             min.push(min.peek());
        //         }
        //         else min.push(val);
        //     }
        // }

        // public void pop() {
        //     st.pop();
        //     min.pop();
        // }

        // public int top() {
        //     return st.peek();
        // }

        // public int getMin() {
        //     return min.peek();
        // }
    }
}
