public class finding_nth_node_from_last {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static Node nthnode1(Node head , int n){ // good way (only one traversal)
        Node slow = head;
        Node fast = head;
        for(int i = 1 ; i<=n ; i++){
            fast = fast.next;
        }
        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static Node nthnode2(Node head, int n) {
        int size = 0;
        Node temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        int m = size - n ;
        for(int i = 0 ; i<=m;i++){
            temp = temp.next;
        }

        return temp;
    }
    public static void main(String[] args) {
        Node a = new Node(100);
        Node b = new Node(13);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(12);
        Node f = new Node(10);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        Node ans = nthnode1(a,2);
        System.out.println(ans.data);
    }
}
