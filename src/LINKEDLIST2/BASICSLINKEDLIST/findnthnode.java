package LINKEDLIST2.BASICSLINKEDLIST;

public class findnthnode {
    public static node nthnode(node head, int n){
        node temp=head;
        int size=0;
        while(temp!=null){

            size++;
            temp=temp.next;

        }
        int m=size-n+1;
        temp=head;
        for (int i=1;i<m-1;i++){
            temp=temp.next;
        }
        return temp;
    }
     public static class node{
         int data;
         node next;
         node(int data){
             this.data=data;
         }
     }

    public static void main(String[] args) {
         node a =new node(2);
        node b =new node(3);
        node c =new node(4);
        node d =new node(5);
        node e =new node(6);
        node f =new node(7);
        node g =new node(8);
        a.next =b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=g;
        node t=nthnode(a,2);
        System.out.println(t.data);


    }
}
