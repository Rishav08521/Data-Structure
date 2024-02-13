package TREES;

import java.util.ArrayList;
import java.util.List;

public class generictree {
    public static class Node{
        int val;
        Node left;
        Node right;
       List<Node> child;
       Node(int val){
           this.val=val;
           child=new ArrayList<>();
       }
    }
    public static void formedTRee(Node root){
        root.child.add(new Node(5));
        root.child.add(new Node(11));
        root.child.add(new Node(63));
        //root.child.add(new Node(30));
        root.child.get(0).child.add(new Node(1));
        root.child.get(0).child.add(new Node(4));
        root.child.get(0).child.add(new Node(8));
        root.child.get(1).child.add(new Node(6));
        root.child.get(1).child.add(new Node(7));
        root.child.get(1).child.add(new Node(15));
        root.child.get(2).child.add(new Node(55));
        root.child.get(2).child.add(new Node(65));
        root.child.get(2).child.add(new Node(2));
    }
    public static void preorder(Node root){
        if (root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(30);
       formedTRee(root);
       // root.child.get(0).child.add(new Node(2));
        preorder(root);
    }
}
