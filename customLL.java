public class customLL {
    public static class Node{  //Node creation
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void display(){
            Node temp = head;
            while (temp!= null){
                System.out.print( temp.data + " ");
                temp = temp.next;
            }
        }
        int size(){
            int count = 0;
            while(head!=null){
               count++;
               head = head.next;
            }
            return count;
        }
        void insert_at_end(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                tail.next = temp;
                tail = temp;
            }
        }

    }


    public static void main(String[] args) {
       linkedlist a = new linkedlist();
        a.insert_at_end(5);
        a.insert_at_end(4);
        a.insert_at_end(13);
        a.insert_at_end(3);
        a.display();
        System.out.println();
        System.out.println(a.size());




    }
}
