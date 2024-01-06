package TREES;

public class implementation {
    public static class Node{
        int val; //0
        Node right;  //niull
        Node left;  // null
        public Node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a = new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        root.left=c;
        root.right=d;
        Node e=new Node(6);

    }
}
