public class copy_LL_with_random_pointer {
    public static class Node{
        int val;
        Node next;
        Node random;
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
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;

        a.random = null;
        b.random = a;
        c.random = e;
        d.random = c;
        e.random = a;
        display(a);

        Node f = copyRandomList(a);
        display(f);

    }
        public static Node copyRandomList(Node head) {

            // Making deap copy of LL
            Node dummy = new Node(0);
            Node temp1 = dummy;
            Node temp2 = head;
            while(temp2 != null){
                Node n = new Node(temp2.val);
                temp1.next = n;
                temp1 = n;
                temp2 = temp2.next;
            }
            temp1 = dummy.next;
            temp2 = head;


            // Arranging alternate nodes of original and deep copy of LL
            Node arrange = new Node(0);
            Node t = arrange;
            Node temp3 = temp1;
            while(temp3 != null){
                t.next = temp2;
                temp2 = temp2.next;
                t = t.next;

                t.next = temp3;
                temp3 = temp3.next;
                t = t.next;
            }
            temp2 = head;
            temp3 = temp1;

            // assigning random pointer
            while(temp3 != null  ){
                if(temp2.random == null) {
                    temp3.random = null;
                }else{
                    temp3.random = temp2.random.next;
                }
                temp2 = temp3.next;
                if(temp2 == null) break;
                temp3 = temp2.next;
            }
            temp2 = head;
            temp3 = temp1;

            // Seperating the both LL and joining there nodes
            while(temp3 != null){
                temp2.next = temp3.next;
                temp2 = temp2.next;
                if(temp2 == null) break;
                temp3.next = temp2.next;
                if(temp3.next == null) break;
                temp3 = temp3.next;
            }
            return temp1;
        }
    }

