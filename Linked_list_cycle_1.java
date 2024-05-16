public class Linked_list_cycle_1 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public class Solution {
        public boolean hasCycle(Node head) {
            if(head == null) return false;
            if(head.next == null) return false;
            Node slow = head;
            Node fast = head;
            while(fast!=null){
                slow = slow.next;
                if(fast.next == null) return false;
                fast = fast.next.next;
                if(fast==slow) return true;
            }
            return false;

        }
    }
}
