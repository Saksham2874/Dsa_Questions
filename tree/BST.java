import java.util.Scanner;

public class BST {
    private static Node root;
    public BST() {
    }
    public static class Node{
        int val;
        Node left;
        Node right;
        int height;
        Node(int val){
            this.val = val;
        }
        int getVal() {
            return val;
        }
    }
    public static int height(Node node){
        if(node == null) return -1;
        return node.height;
    }
    public static boolean isEmpty(Node node){
        return node == null;
    }
    public static void insert(int value){
        root = insert(value,root);
    }
    private static Node insert(int value , Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value > node.val){
            node.right = insert(value,node.right);
        }
        if(value <  node.val){
            node.left = insert(value,node.left);
        }
        node.height = Math.max(height(node.left),height(node.right)) + 1;
        return node;
    }
    public void display(){
        display(root,"Root Node ");
    }
    private void display(Node node , String details){
        if(node == null) return;
        System.out.println(details + node.val);
        display(node.left , "Left node of " + node.val + ": ");
        display(node.right , "Right node of " + node.val + ": ");
    }
    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null) return true;
        return (Math.abs(height(node.left) - height(node.right)) <= 1) && balanced(node.left) && balanced(node.right);
        // && for to check if the lower tree nodes is balanced or not
    }
    // for adding numbers in a form of array
    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }
    public void populatesorted(int[] nums){
        populatedsorted(nums,0,nums.length);
    }
    private void populatedsorted(int[] nums , int s , int e){
        if(s>=e) return;
        int m = s + (e-s) /2;
        this.insert(nums[m]);
        populatedsorted(nums,s,m);
        populatedsorted(nums,m+1,e);
    }

    public void preorder(){
        preorder(root);
    }
    private void preorder(Node node){
        if(node == null) return;
        System.out.print(node.val + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void inorder(){
        inorder(root);
    }
    private void inorder(Node node){
        if(node == null) return;
        inorder(node.left);
        System.out.print(node.val + " ");
        inorder(node.right);
    }

    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        if(node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.val + " ");

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        BST bst = new BST();
//        bst.insert(15);
//        bst.insert(10);
//        bst.insert(20);
//        bst.insert(8);
//        bst.insert(22);
//        bst.insert(13);
//        bst.display();
//        System.out.println(bst.balanced()) ;
//        BST bst1 = new BST();
//        int[] nums = { 5,13,43,54,23,16,76};
//        bst1.populate(nums);
//        bst1.display();
//        System.out.println();
        // if in this array is given sorted(ascending or descending both) then it will create a skewed BST
        // which is not good as its complexity reaches O(N).
        // To solve this problem we can just take the middle elem and then divide it into two parts
        // and then make root node as middle elem of the main array and then take mid elem of the first arr as left node of
        // root node and the mid elem of second arr as right node of root node and so on.
//        BST bst2 = new BST();
//        int[] nums2 = {1,2,3,4,5,6,7,8,9};
//        bst2.populatesorted(nums2);
//        bst2.display();

//        BST bst3 = new BST();
//        int[] nums3 = {10,8,12,6,9,15};
//        bst3.populate(nums3);
//        bst3.postorder();
    }
}
