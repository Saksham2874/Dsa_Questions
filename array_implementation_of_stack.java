public class array_implementation_of_stack {
    public static class stack {
        int[] arr = new int[10];
        int idx = 0;

        void push(int x) {
            if(isFull()){
                System.out.println("Stack is Full");
                return;
            }
            arr[idx] = x;
            idx++;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return -1;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0; // as by default all the elements in an array are 0
            idx--;
            return top;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Stack is Empty");
                return -1;
            }
            return arr[idx - 1];
        }

        void display() {
            for (int i = 0; i <= idx - 1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(idx == 0) return true;
            else return false;
        }

        boolean isFull(){
             if(idx == arr.length) return true;
             else return false;
        }


        public static void main(String[] args) {
            stack st = new stack();
            st.push(1);
            st.push(2);
            st.push(3);
            st.push(4);
            System.out.println(st.peek());
            st.display();
            st.pop();
            st.display();
            System.out.println(st.size());

        }

    }
}
