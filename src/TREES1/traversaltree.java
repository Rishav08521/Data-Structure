package TREES1;

import java.util.LinkedList;
import java.util.Queue;



public class traversaltree {
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val=val;
        }

    }
    public static int height(Node root){
        if(root==null || root.left==null && root.right==null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }
    public static void nthlevel(Node root, int n ){
        if (root==null) return;
        if (n==1){
            System.out.print(root.val+" ");
            return;
        }
        nthlevel(root.left,n-1);
        nthlevel(root.right,n-1);
    }
    public static Node constructBFS(String [] arr){
        int x=Integer.parseInt(arr[0]);
        int n=arr.length;
        Node root=new Node(x);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;

        while(i<n-1){
            Node temp=q.remove();
            Node left=new Node(10);
            Node right=new Node(100);
            if (arr[i].equals(" ")) left=null;
            else {
                int l=Integer.parseInt(arr[i]);
                left.val=l;
                q.add(left);
            }
            if (arr[i+1].equals(" ")) right=null;
            else{
                int r=Integer.parseInt(arr[i+1]);
                root.val=r;
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }
    public static void main(String[] args) {
        String [] arr={"10","5","15","2","8","12"};
        Node root=constructBFS(arr);
        preorder(root);

    }

    private static void preorder(Node root) {
        if (root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
}
