package TREES1;

import java.util.LinkedList;
import java.util.Queue;

public class trees1 {
    public  static class Node{
        int val;
        Node right;
        Node left;
        public Node(int val){
            this.val=val;
        }
    }
    public static int max(Node root){
        if (root!=null) return Integer.MIN_VALUE;
        int a=root.val;
        int b=max(root.right);
        int c=max(root.left);
        return Math.max(a,Math.max(b,c));
    }
    public static int  heigth(Node root){
        if (root==null ||(root.left==null&&root.right==null)) return 0;
        return Math.max(heigth(root.left) ,heigth(root.left));
    }
    public static int  sum(Node root){
        if (root==null) return 0;
        return root.val + sum(root.left) + sum(root.right);
    }
    public static void nthlevel(Node root, int n){
        if (root==null) return;
        if (n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthlevel(root.left,n-1);
        nthlevel(root.right,n-1);
    }
    public static void nthlevl2(Node root, int n){
        if (root==null) return;
        if (n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthlevl2(root.right,n-1);
        nthlevl2(root.left,n-1);
    }
    public static int size(Node root){
        if (root==null) return 0;
        return 1 + size(root.left)+size(root.right);
    }
    public static void bfs(Node root){
        Queue<Node> q=new LinkedList<>();
        if (root!=null) q.add(root);
        while(q.size()>0){
            Node temp=q.peek();
            if (temp.left!=null) q.add(temp.left);
            if (temp.right!=null) q.add(temp.right);
            System.out.print(temp.val+" ");
            q.remove();
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
        int level=heigth(root) +1;
        for (int i=1;i<=level;i++){
            nthlevl2(root,i);
           // nthlevel(root,i);
            System.out.println();
        }

//        preorder(root);
//        System.out.println();
       // sum(root);
       // System.out.println(sum(root));
       // bfs(root);

    }
}
