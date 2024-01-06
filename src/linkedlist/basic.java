package linkedlist;

public class basic {
    public static void insertedatend(node head,int val){
        node temp=new node(val);
        node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;

    }
    public static void recusriondisplay(node head){
        if (head==null) return;
        System.out.print(head.data +" ");// accoding question
        recusriondisplay(head.next);
       // System.out.println(head.data);// reverse
    }
    public static void reversedisplayrecursion(node head){
        if (head==null) return;
        reversedisplayrecursion(head.next);
        System.out.println(head.data+" ");
    }
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static class node{
        int data;
        node next;
        node(int data){

            this.data=data;
        }
    }
    public static void main(String[] args) {
        node x=new node(5);
        //System.out.println(x.next);
        node x1=new node(3);
        node x2=new node(4);
        node x3=new node(8);
        node x4=new node(10);
        node x5=new node(111);
  //      x.next=x1;
//        System.out.println(x.next.next.data);
        //System.out.println(x.next);
//        System.out.println(x1);
//        x2.next=x3;
//        System.out.println(x2.data);
//        System.out.println(x2.next.next.next.data);
//        x1.next=x2;
//        x3.next=x4;
//        System.out.println(x3.next.next.next.data);
        x.next=x1;
        x1.next=x2;
        x2.next=x3;
        x3.next=x4;
        x4.next=x5;
        display(x);
        recusriondisplay(x);
        reversedisplayrecursion(x);
        insertedatend(x,208);
        display(x);
//        System.out.println(x.data);
//        System.out.println(x.next.data);
//        System.out.println(x.next.next.data);
//        System.out.println(x.next.next.next.data);
//        System.out.println(x.next.next.next.next.data);
//        node temp=x;
//        while(temp!=null){
//            System.out.println(temp.data + " ");
//            temp=temp.next;
//        }
//        for (int i=1;i<=5;i++){
//            System.out.println(temp.data + " ");
//            temp=temp.next;
//        }

    }
}
