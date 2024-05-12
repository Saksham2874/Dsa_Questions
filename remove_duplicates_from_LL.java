public class remove_duplicates_from_LL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    class Solution {
        public Node deleteDuplicates(Node head) {
            Node temp = head;
            while(temp!=null  && temp.next!=null){
                if(temp.next.val == temp.val){
                    temp.next = temp.next.next;
                }else{
                    temp = temp.next;
                }
                if(temp.next == null){
                    return head;
                }
            }
            return head;
        }
    }
}
