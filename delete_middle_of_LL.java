public class delete_middle_of_LL {
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    class Solution {
        public Node deleteMiddle(Node head) {
            if(head.next == null){
                return null;
            }

            Node slow = head;
            Node fast = head;


            while(fast.next.next!=null && fast.next.next.next!=null ){
                slow = slow.next;
                fast = fast.next.next;
            }
            slow.next = slow.next.next;
            return head;


        }

    }
}
