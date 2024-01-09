package LINKEDLIST2.BASICSLINKEDLIST;

public class nthnodeinonetreaversal {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static node nthnode(node head, int idx){
        //node temp=head;
        //int size=0;
        node slow=head;
        node fast=head;
        for (int i=1;i<=idx;i++){
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static void nthnodedelete(node head, int idx){
        node slow=head;
        node fast=head;
        for (int i=1;i<=idx;i++){
            fast=fast.next;
        }
        while (fast!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;

    }
    public static void display(node head){
        node temp=head;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
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
        display(a);
        System.out.println();
        nthnodedelete(a,3);
        display(a);
        //node t=nthnode(a,4);
        //System.out.println(t.data);

    }
}
