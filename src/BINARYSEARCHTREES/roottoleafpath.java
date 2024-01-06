package BINARYSEARCHTREES;

import java.util.ArrayList;

public class roottoleafpath {
    static class Node{
        int data;
        Node right;
        Node left;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root, int val){
        if (root==null){
            root=new Node(val);
            return root;
        }
        if (root.data>val){
            root.left=insert(root.left,val);
        } else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void printpath(ArrayList<Integer> path){
        for (int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println();
    }
    public static void printroottoleaf(Node root, ArrayList<Integer> path){
        if (root==null){
            return;
        }

     path.add(root.data);
        if (root.left==null && root.right==null){
            printpath(path);
        }else{ //none lead node
            printroottoleaf(root.left,path);
            printroottoleaf(root.right,path);
        }

     path.remove(path.size()-1);
    }
    public static void inorder(Node root){
        if (root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void main(String[] args) {
        int values[]={8,5,3,1,4,6,10,11,14};
        Node root=null;
        for (int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        printroottoleaf(root,new ArrayList<>());

    }
}
