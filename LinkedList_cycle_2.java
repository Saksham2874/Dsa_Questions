public class LinkedList_cycle_2 {
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public Node LLcycle2(Node head){
        if(head == null) return null;
        if(head.next == null) return null;
        Node slow = head ;
        Node fast = head ;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) break;
        }
        if(fast==null || fast.next==null) return null;
        Node temp = head;
        while(temp!=slow){
            if(slow.next == null) return slow;
            slow = slow.next;
            temp = temp.next;
        }
        return slow;
    }
}
