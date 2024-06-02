public class palindrome_DLL {
    public static class Node{
        int val;
        Node next;
        Node prev;
        Node(int val){
            this.val = val;
        }
    }
    public static boolean isPalindrome(Node head) {
        Node temp1 = head;
        Node temp2 = head;
        while (temp2.next != null) {
            temp2 = temp2.next;
        }
        while (temp1 != temp2) {
            if (temp1.val != temp2.val) return false;
            temp1 = temp1.next;
            temp2 = temp2.prev;
        }
        return true;
    }
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(1);
        a.prev = null;
        a.next = b;
        b.prev = a;
        b.next = c;
        c.prev = b;
        c.next = d;
        d.prev = c;
        d.next = e;
        e.prev = d;
        e.next = null;
        System.out.println(isPalindrome(a));
    }
}
