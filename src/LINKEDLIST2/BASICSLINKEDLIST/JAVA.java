package LINKEDLIST2.BASICSLINKEDLIST;

public class JAVA {
    public static void displayurr(Node head){
        if (head==null) return;
            System.out.print(head.data+" ");
            displayurr(head.next);
    }
    public static int lengthll(Node head){
        int count=0;
        while(head!= null){
            count++;
            head=head.next;

        }
        return count;

    }
    public static void reversedisplay(Node head){
        if (head==null) return;
        reversedisplay(head.next);
        System.out.print(head.data+" ");
    }
    public static void display(Node head){
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data + " ");
            temp=temp.next;
        }

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        Node temp=a;
//        for (int i=1;i<=5;i++)
//        System.out.print(temp.data+" ");
//        temp=temp.next;
//        while (temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
        display(a);
        System.out.println();
        displayurr(a);
        System.out.println();
        reversedisplay(a);
        System.out.println();
        System.out.println(lengthll(a));

    }
}
