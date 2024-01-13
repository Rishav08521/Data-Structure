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
    public static void randomdis(node random){
        node temp=random;
        while(temp.prev!=null){
          //  System.out.print(temp.prev+" ");
            temp=temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void insertatail(node head, int x){
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        node t=new node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void inseratanyindex(node head, int idx, int x){
        node s=head;
        for (int i=1;i<=idx-1;i++){
            s=s.next;
        }
        node r=s.next;
        node t=new node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;

    }
    public static node insertathead(node head, int val){
        node t=new node(9);
        t.next=head;
        head.prev=t;
        head=t;
        return head;
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
//        dis(a);
//        disrev(e);
       // randomdis(d);
        dis(a);
//        node newhead=insertathead(a,89);
//        dis(newhead);
        insertatail(a,88);
        dis(a);





    }
}
