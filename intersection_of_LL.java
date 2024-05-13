public class intersection_of_LL {
    public class Node{
        int data;
        Node next;
        Node (int data){
            this.data = data;
        }
    }

    public class Solution {
        public Node getIntersectionNode(Node headA, Node headB) {
            int n = size(headA);
            int m = size(headB);
            Node temp1 = headA;
            Node temp2 = headB;

            if(n>m){
                for(int i = 1; i<= n-m ; i++){
                    temp1 = temp1.next;
                }
            }
            else if(m>n){
                for(int i = 1; i<= m-n ; i++){
                    temp2 = temp2.next;
                }
            }
            while(temp1!=temp2){
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
            return temp1;

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
