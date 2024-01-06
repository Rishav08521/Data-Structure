package linkedlist;

public class reverselinklist {
    public static class node{
        int val;
        node next;
        node(int val){
            this.val=val;
        }
    }
    public static node reverse(node head){
        if (head.next==null) return head;
        node headrev=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return headrev;


    }
    public static void display(node head){
        if (head==null) {
            System.out.println();
            return;
        }
        // strait
        System.out.print(head.val+" ");
        display(head.next);
       // System.out.println();
       // System.out.println();
        //System.out.print(head.val+" "); // reverse
    }
    public static void main(String[] args) {
        node a = new node(1);
        node a1=new node(2);
        node a2=new node(3);
        node a3=new node(4);
        node a4=new node(5);
        a.next=a1;
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
       // System.out.println(a.next);
        //System.out.println(a.val);
        display(a);
        node r=reverse(a);
        display(r);


    }
}
