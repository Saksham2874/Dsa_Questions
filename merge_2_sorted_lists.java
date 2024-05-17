public class merge_2_sorted_lists {
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public Node mergeTwoLists(Node list1, Node list2) {
        Node temp1 = list1;
        Node temp2 = list2;
        Node ans = new Node(10);
        Node temp = ans;
        while(temp1!= null && temp2 != null){
            if(temp1.val < temp2.val){
                Node a = new Node(temp1.val);
                temp.next = a;
                temp =a;
                temp1 = temp1.next;
            }
            else{
                Node a = new Node(temp2.val);
                temp.next = a;
                temp =a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null ){
            temp.next = temp2;
        }
        if(temp2 == null){
            temp.next = temp1;
        }
        return ans.next;
    }
}
