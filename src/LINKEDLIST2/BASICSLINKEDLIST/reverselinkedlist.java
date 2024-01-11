package LINKEDLIST2.BASICSLINKEDLIST;

public class reverselinkedlist {
    public static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }
    public static node reverse(node head){
        if (head.next!=null) return head;
        node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
//    public static void display(node head){
//        node temp=head;
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//    }
    public static void displayrev(node head) {
        if (head == null) return;

        System.out.print(head.data + " ");
        displayrev(head.next);

    }
    public static void dis(node head){
        if (head==null) {
            System.out.println();
            return;
        }
        System.out.print(head.data+" ");
        dis(head.next);
    }

    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
        node f=new node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        displayrev(a);
        System.out.println();
        a=reverse(a);
        displayrev(a);
    }
}
