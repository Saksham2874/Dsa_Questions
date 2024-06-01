public class oddevenLL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

        public static void display(Node head){
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data);
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
            Node f = oddEvenList(a);
            display(f);
        }
        public static Node oddEvenList(Node head) {
            Node odd = new Node(0);
            Node even = new Node(0);
            Node temp = head;
            Node temp_o = odd;
            Node temp_e = even;
            while(temp != null){
                temp_o.next = temp;
                temp = temp.next;
                temp_o = temp_o.next;

                temp_e.next = temp;
                if(temp == null) break;
                temp = temp.next;
                temp_e = temp_e.next;
            }
            odd = odd.next;
            even = even.next;
            temp_o.next = even;
            return odd;
        }
    }

