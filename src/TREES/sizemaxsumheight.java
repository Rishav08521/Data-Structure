package TREES;

import static TREES.implement1.display;

public class sizemaxsumheight {
    //static int size=0;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }
    }
//    public static void display(Node root){
//        if (root==null) return;
//        System.out.print(root.val+"->");
//        if(root.left!=null ) System.out.print(root.left.val+" ");
//        if(root.right!=null ) System.out.println(root.right.val);
//        System.out.println();
//        display(root.left);
//        display(root.right);
//    }
//    public static void preorder(Node root){
//        if (root==null) return;
//        //System.out.print(root.val+"->");
//       // size++;
//        preorder(root.left);
//        preorder(root.right);
//    }
    public static int size(Node root){
     if (root==null) return 0;
     return 1+ size(root.left)+size(root.right);
    }
    public static int sum(Node root){
        if (root==null) return 0;
        return root.val + sum(root.left)+sum(root.left);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        b.right=e;
        Node f=new Node(7);
        b.left=e;
        //display(root);
       // preorder(root);
       // System.out.println(size);
        System.out.println(size(root));
        System.out.println(sum(root));

    }
}
