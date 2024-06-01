public class add_2_no_in_LL {
        public static class Node{
            int val;
            Node next;
            Node(int val){
                this.val = val;
            }
        }
        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.val);
                temp = temp.next;
            }
            System.out.println();
        }

    public static void main(String[] args) {
        Node a1 = new Node(1);
        Node b1 = new Node(2);
        Node c1 = new Node(3);
        Node d1 = new Node(4);
        Node e1 = new Node(5);
        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;

        Node a2 = new Node(5);
        Node b2 = new Node(4);
        Node c2 = new Node(3);
        Node d2 = new Node(2);
        Node e2 = new Node(1);
        a2.next = b2;
        b2.next = c2;
        c2.next = d2;
        d2.next = e2;

        display(a1);
        display(a2);

        Node f = addTwoNumbers(a1,a2);
        display(f);
    }
        public static Node addTwoNumbers(Node l1, Node l2) {
            Node ptr1 = l1;
            Node ptr2 = l2;
            Node temp = new Node(0);
            Node curr = temp;
            int carry = 0;
            while(ptr1 != null || ptr2 != null){
                int sum = carry;
                if(ptr1 != null) sum = sum + ptr1.val;
                if(ptr2 != null) sum = sum + ptr2.val;
                Node nextnode = new Node(sum % 10);
                carry = sum/10;
                curr.next = nextnode;
                curr = curr.next;
                if(ptr1 != null) ptr1 = ptr1.next;
                if(ptr2 != null) ptr2 = ptr2.next;
            }
            if(carry != 0){
                Node nextnode = new Node(carry);
                curr.next = nextnode;
            }
            return temp.next;
        }
    }

