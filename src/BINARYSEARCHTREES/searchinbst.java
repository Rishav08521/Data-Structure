package BINARYSEARCHTREES;

public class searchinbst {
    static class Node {
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    static Node insert(Node root, int val){
        if (root==null){
            root=new Node(val);
            return root;
        }
        if (root.data>val){
           root.left=insert(root.left,val);
        }else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);

    }
    public static boolean search(Node root,int key){ //0(h)
        if (root==null){
            return false;
        }
        if (root.data>key){
            return search(root.left,key);
        }
        else if (root.data==key){
            return true;
        }
        else{
            return search(root.right,key);
            }
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        if (search(root,8)){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }

    }
}
