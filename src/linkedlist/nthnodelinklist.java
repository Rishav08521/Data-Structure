package linkedlist;

public class nthnodelinklist {
    public static node nthnode(node head,int n){
        int size=0;
        node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size - n+1;
        temp=head;
        for (int i=1;i<=m-1;i++){
            temp=temp.next;

        }
        return temp;
    }
    public static node nthnode2(node head , int n){
        node slow=head;
        node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        while(fast!=null){
            slow =slow.next;
            fast=fast.next;
        }
        return slow;
    }
    public static node deletenthfromEnd(node head,int n){
        node slow=head;
        node fast=head;
        for (int i=1;i<=n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
         slow.next=slow.next.next;
        return head;
    }
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        node a=new node(1);
        node a1=new node(2);
        node a2=new node(3);
        node  a3=new node(4);
        node a4=new node(5);
        node a5=new node(6);
        a.next=a1;
        a1.next=a2;
        a2.next=a3;
        a3.next=a4;
        a4.next=a5;
        //1 2 3 4 5 6
        node w=nthnode2(a,3);
        System.out.println(w.data);
        display(a);
        a=deletenthfromEnd(a,6);
        display(a );

    }
}
