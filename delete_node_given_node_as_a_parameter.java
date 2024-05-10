class Solution {
    public static class Node{  //Node creation
        int data;
        customLL.Node next;
        Node(int data){
            this.data = data;
        }
    }
    public void deleteNode(Node a) {
        a.data = a.next.data;
        a.next = a.next.next;
    }

}