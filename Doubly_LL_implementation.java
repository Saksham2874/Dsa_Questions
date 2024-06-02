public class Doubly_LL_implementation {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static void display(Node head){ // using head node
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayrev(Node tail){ // using tail node
        Node temp = tail;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void display2(Node random){ // using any node in the LL we'll print the LL in correct way
        Node temp = random;
        // moving this temp back to head
        while(temp.prev != null){
            temp = temp.prev;
        }
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static Node insert_at_head1(Node head , int val){
        Node n = new Node(val);
        n.next = head;
        head.prev = n;
        head = n;
        return head;
    }
    public static Node insert_at_head2(Node tail , int val){
        Node n = new Node(val);
        Node temp = tail;
        while(temp.prev != null) temp = temp.prev;
        n.next = temp;
        temp.prev = n;
        return n;
    }
    public static Node insert_at_tail2(Node head , int val){
        Node n = new Node(val);
        Node temp = head;
        while(temp.next != null) temp = temp.next;
        temp.next = n;
        n.prev = temp;
        return head;
    }
    public static Node insert_at_tail1(Node tail , int val){
        Node n = new Node(val);
        tail.next = n;
        n.prev = tail;
        tail = n;
        Node temp = tail;
        while(temp.prev != null) temp = temp.prev;
        return temp;
    }
    public static Node insert_at_any_index(Node head , int index , int val){
        Node n = new Node(val);
        Node temp = head;
        for(int i = 1 ; i < index-1 ; i++){
            temp = temp.next;
        }
        Node temp2 = temp.next;
        temp.next = n;
        n.prev = temp;
        n.next = temp2;
        temp2.prev = n;
        return head;
    }
    public static Node delete_at_head(Node head){
        head = head.next;
        head.prev = null;
        return head;
    }
    public static int size(Node head){
        Node temp = head;
        int count = 0;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.prev = null; // this line just for understanding (by default null)
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null; // this line just for understanding

        display(a); // normal display of created LL using head
//        displayrev(e); // reverse display of LL using tail
//        display2(e); // display the LL using any random node
//        Node f = insert_at_head1(a,6); // Insertion of a node at start using head node
//        display(f);
//        Node g = insert_at_tail1(e,7); // Insertion of a node at end using tail node
//        display(g);
//        Node h = insert_at_tail2(f,8); // Insertion of a node at end using head node
//        display(h);
//        Node i = insert_at_head2(h,9); // Insertion of a node at start using tail node
//        display(i);
        insert_at_any_index(a,3,6);
        display(a);
        delete_at_head(a);
        display(b);
    }
}
