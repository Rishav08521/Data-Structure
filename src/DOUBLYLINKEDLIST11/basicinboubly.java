package DOUBLYLINKEDLIST11;

public class basicinboubly {
    public static class node {
        int data;
        node prev;
        node next;

        node(int data) {
            this.data = data;
        }
    }
//    public static void display(node head){
//        if (head!=null) return;
//        System.out.println(head.data);
//        display(head.next);
//    }
    public static void dis(node head){
        node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void disrev(node tail){
        node temp=tail;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        node a=new node(2);
        node b=new node(3);
        node c=new node(4);
        node d=new node(5);
        node e=new node(6);
        a.prev=null;
        a.next=b;
        b.prev=a;
        b.next=c;
        c.prev=b;
        c.next=d;
        d.prev=c;
        d.next=e;
        e.prev=d;
        e.next=null;
       // a.prev=b;
       // display(a);
        dis(a);
        disrev(e);





    }
}
