import java.util.LinkedList;

public class merge_2_sorted_LL_without_extra_LL {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static Node llmerge(Node list1 , Node list2){
        Node temp1 = list1;
        Node temp2 = list2;
        Node ans = new Node(10);
        Node temp = ans;
        while(temp1!=null && temp2!=null){
            if(temp1.val < temp2.val){
                temp.next = temp1;
                temp = temp1;
                temp1 = temp1.next;
            }
            else{
                temp.next = temp2;
                temp = temp2;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
            temp.next = temp2;
        }
        if(temp2 == null){
            temp.next = temp1;
        }
        return ans.next;
    }

    

}
