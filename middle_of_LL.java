public class middle_of_LL {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    class Solution {
        public Node middleNode(Node head) {
            int n = size(head);
            Node temp = head;
            for(int i = 0 ;i<(n/2);i++){
                temp = temp.next;
            }
            head = temp;
            return head;
        }
        public int size(Node head){
            Node temp = head;
            int count = 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }
    }
}
