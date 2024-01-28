package TREES1;

public class trees1 {
    public  static class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val=val;
        }
    }
    public static void preorder(Node root){
        if (root==null) return;
        System.out.println(root.val);
        preorder(root.left);
        //System.out.println(root.right);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(12);
        Node b=new Node(5);
        root.left=a;
        root.right=b;
        Node c=new Node(1);
        Node d=new Node(2);
        a.left=c;
        a.right=d;
        Node e=new Node(13);
        b.right=e;

       // System.out.println(root.val);
        preorder(root);


    }
}
