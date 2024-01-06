package TREES;

import java.util.LinkedList;
import java.util.Queue;

public class preinpost {
    public static void preinpost(int n){
        if (n==0) return;
       // preinpost(n-1);
        System.out.println("pre" +n);
        preinpost(n-1);
        System.out.println("in"+n);
        preinpost(n-1);
        System.out.println("post"+n);

    }
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
//            this.left=left;
//            this.right=right;
        }
    }
    public static void preoder(Node root){
        if (root==null) return;
        System.out.print(root.val);
        preoder(root.left);
        preoder(root.right);
    }
    public static void inorder(Node root){
        if (root== null) return;
        inorder(root.left);
        System.out.print(root.val);
        inorder(root.right);

    }
    public static void postorder(Node root){
        if (root ==null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val);
    }
    public static void nthlevel(Node root, int n){
        if (root==null) return;
        if (n==1)System.out.print(root.val+" ");
        nthlevel(root.left,n-1);
        nthlevel(root.right,n-1);
    }
    public static int height(Node root){
       if (root==null) return 0;
       return 1 + Math.max(height(root.left) , height(root.right));
    }
    public static void bsf(Node root){
        Queue<Node> q=new LinkedList<>();
        if (root!=null) q.add(root);
        while(q.size()>0){
            int n = q.size();
            for(int i=0; i<n; i++){
                Node temp=q.remove();
                System.out.print(temp.val+" ");
                if(temp.left!=null) q.add(temp.left);
                if(temp.right!=null) q.add(temp.right);
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        //preinpost(2);
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        Node f=new Node(7);
        a.left=c;
        a.right=d;
        b.right=f;
        b.left=e;
//        preoder(root);
//        System.out.println();
//        inorder(root);
//        System.out.println();
//        postorder(root);
       // nthlevel(root,3);
        int level=height(root) + 1;
//        for (int i=0;i<level;i++){
//            nthlevel(root,i);
//            System.out.println();
//        }
//
        bsf(root);

    }
}
