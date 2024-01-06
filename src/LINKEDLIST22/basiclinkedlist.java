package LINKEDLIST22;

public class basiclinkedlist {
    public static void display1(Node head){
        if (head== null) return;
        System.out.print(head.data+" ");
        display1(head.next);
    }
    public static void display(Node head){
       // Node temp=head;// recursively
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
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
        Node a=new Node(5);
        Node b=new Node(2);
        Node c=new Node(9);
        Node d=new Node(8);
        Node e=new Node(7);
        Node f=new Node(6);
        Node g=new Node(4);
        a.next=b;  //5->2
        b.next=c; //5->2->9
        c.next=d;  //5->2->9->8
        d.next=e;
        e.next=f;
        f.next=g;
       // System.out.println(a.next.next.next.next.data);
        Node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");  /// display the linkedlist
            temp=temp.next;
        }
        System.out.println();
        display(a);
        System.out.println();
        display1(a);




    }
}
