public class LL_node_creation {
    public static class Node{ //Node creation
        int data;//value
        Node next;//address
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(14);
        // LL creation
        a.next = b; // 5 -> 3 9 8 14
        b.next = c; // 5 -> 3 -> 9 8 14
        c.next = d; // 5 -> 3 -> 9 -> 8 14
        d.next = e; // 5 -> 3 -> 9 -> 8 -> 14

        //Displaying the LL
        display(a);

        System.out.println();

        //Displaying the LL (recursively)
        display_recursively(a);

    }
    public static void display(Node head){
        Node temp = head;
        while (temp != null){
            System.out.print( temp.data + " ");
            temp = temp.next;
        }
    }
    public static void display_recursively(Node head){
       if(head == null) return;
       //display_recursively(head.next); ( for reverse LL display
       System.out.print(head.data + " ");
       display_recursively(head.next);
    }
}
