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
            Node temp = head; // making a Node temp pointing to head
            while (temp!= null){  // it will check if the temp(head) is pointing to null or not
                System.out.print( temp.data + " ");  // if not then print the value of node
                temp = temp.next; // assigning temp to the next node
            }
            System.out.println(); // for next line
        }
        int size(){
            Node temp = head; // making a Node temp pointing to head
            int count = 0;
            while(temp!=null){ // it will check if the temp(head) is pointing to null or not
               count++; // if temp!=null then make count = count + 1
               temp = temp.next; // assigning temp to the next node
            }
            return count; // returning the count
        }
        void insert_at_end(int val){
            Node temp = new Node(val); // making a temp node equal to the value og the given Node to be added in the LL
            if(head == null){ // for checking that the LL is empty or not (if LL is empty then both head and tail will point to null )
                head = temp; // making head point to null
                tail = temp; // making tail point to null
            }
            else{ // if LL is present
                tail.next = temp; // present tail node will point to the new node
                tail = temp; // the tail will get to the temp
            }
        }
        void insert_at_beginning(int val){
            Node temp = new Node(val); // making a temp node equal to the value og the given Node to be added in the LL
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        void insert_at_any_index(int index , int val){
            Node temp = head; // creating a temp node pointing to head
            if(index == size()){ // if we want to add a node at the end of LL using this method
                insert_at_end(val);
                return;
            }
            if(index == 0){ // if we want to add a node at the starting of LL
                insert_at_beginning(val);
                return;
            }
            if(index>size() || index<0){
                System.out.println("Wrong index");
                return;
            }
            if(temp == null){ // if the LL is empty
                insert_at_beginning(val);
                return;
            }
            for(int i = 1; i <= index -1 ; i++){ //  loop for moving temp to the index-1
                temp = temp.next;
            }
            Node a = new Node(val); // creating the node that we need to enter
            a.next = temp.next; // making the new node point to the next Node through temp.next
            temp.next = a; // making temp node point to the new node
        }
        int getElement(int index){
            if(index>size() || index<0){
                System.out.println("Wrong index");
                return -1;
            }
            Node temp = head;
            for(int i = 1; i <= index  ; i++){ //  loop for moving temp to the index-1
                temp = temp.next;
            }
            return temp.data;
        }
        void delete_at_index(int index){
            Node temp = head;
            if(index==0){
                head = head.next;
            }
            for (int i = 0; i < index -1; i++) {
               temp = temp.next;
            }
            temp.next = temp.next.next;
            if(index == size()){
                tail = temp;  // if we are deleting last elem
            }
        }

    }


    public static void main(String[] args) {
       linkedlist a = new linkedlist();
        a.insert_at_end(5);
        //a.display();
        a.insert_at_end(4);
        //a.display();
        a.insert_at_end(13);
        //a.display();
        a.insert_at_end(3);
        //a.display();
        a.insert_at_beginning(8);
        //a.display();
        a.insert_at_any_index(3,10);
        //a.display();
        a.insert_at_any_index(0,15);
        a.display();
        //System.out.println(a.getElement(4));
        a.delete_at_index(0);
        a.display();
        System.out.println(a.head.data);
        System.out.println(a.tail.data);






    }
}
