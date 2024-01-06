package linkedlist;

public class findlength {
    public static int length(node a){
        int count =0;
        while(a!=null){
            count++;
            a=a.next;
        }
        return count;

    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node a=new node(3);
        node b=new node(2);
        node c=new node(1);
        node d=new node(5);
        node e=new node(4);
        node f=new node(99);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        length(a);
        System.out.println(length(a));

    }
}
