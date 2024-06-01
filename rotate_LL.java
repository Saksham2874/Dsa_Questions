public class rotate_LL {
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
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        display(a);
        Node f = rotateRight(a,3);
        display(f);
    }

    public static Node rotateRight(Node head, int k) {
            if (head == null || head.next == null || k == 0) return head;
            int size = size(head);
            int n = k % size;
            if(n == 0 ) return head;
            Node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }
            tail.next = head;
            Node newTail = head;
            for (int i = 1; i < size - n; i++) {
                newTail = newTail.next;
            }
            Node newHead = newTail.next;
            newTail.next = null;

            return newHead;
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
    }

