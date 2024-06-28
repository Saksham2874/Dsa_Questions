import java.util.Scanner;

class BinaryTree {
    static Node root;
    public BinaryTree(){
        // constructor
    }
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val = val;
        }
    }
    public static void populate(Scanner sc){
        System.out.println("Enter the root node: ");
        int val = sc.nextInt();
        root = new Node(val);
        populate(sc , root);
    }
    public static void populate(Scanner sc , Node node){
        System.out.println("Do you want to add to the left of Node " + node.val);
        boolean left = sc.nextBoolean();
        if (left){
            System.out.println("Enter the left node value of " + node.val);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc,node.left);
        }

        System.out.println("Do you want to add to the right of Node " + node.val);
        boolean right = sc.nextBoolean();
        if(right){
            System.out.println("Enter the right node value of " + node.val);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc,node.right);
        }
    }
    public static void display(){
         display(root,"");
    }
    public static void display(Node node , String indent){ // indent for only the blank spaces
        if(node == null) return; // if tree is empty
        System.out.println(indent + node.val); // root node display
        display(node.left , indent + "\t");
        display(node.right , indent + "\t");
        // in this function the numbers on the same level re in vertical pos
    }
    public static void prettydisplay(){
       prettydisplay(root , 0);
    }
    public static void prettydisplay(Node node , int level){
        if(node == null) return;
        prettydisplay(node.right,level+1);
        if(level != 0){
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|------>" + node.val);
        }
        else{
            System.out.println(node.val);
        }
        prettydisplay(node.left,level+1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        tree.populate(sc);
        tree.display();
        tree.prettydisplay();

    }
}
