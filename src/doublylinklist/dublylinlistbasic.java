package doublylinklist;

public class dublylinlistbasic {
    public static class node{
        int val;
        node next;
        node prev;
        node(int val){
            this.val=val;
        }
    }
    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
            //System.out.print(temp.val+" ");
        }
        System.out.println();
    }
    public static void display2(node tail){
        node temp=tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.prev;
        }

    }
    public static void displayrandom(node random){
        node temp=random;
        while(temp.prev!=null){
            temp=temp.prev;

        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static node insertionathead(node head,int x){
        node b =new node(x);
        b.next=head;
        head.prev=b;
        head=b;
        return head;
    }
    public static void insertionatail(node tail,int x){
        node temp=tail;
        while(temp.next!=null){
            temp=temp.next;
        }
        node t=new node(x);
        temp.next=t;
        t.prev=temp;
    }
    public static void inserteionindex(node head,int index,int x ){
        node s=head;
        for (int i=1;i<index;i++){
            s=s.next;
        }
        node r=s.next;
        node t=new node(x);
        s.next=t;
        t.prev=s;
        t.next=r;
        r.prev=t;

    }
    public static void main(String[] args) {
        node a=new node(2);
        node a1=new node(3);
        node a2=new node(4);
        node a3=new node(5);
        node a4=new node(6);
        node a5=new node(7);
        a.prev=null;
        a.next=a1;
        a1.prev=a;
        a1.next=a2;
        a2.prev=a1;
        a2.next=a3;
        a3.prev=a2;
        a3.next=a4;
        a4.prev=a3;
        a4.next=a5;
        a5.prev=a4;
        a5.next=null;
       // display(a);
      //  display2(a5);
       // displayrandom(a5);
       // node newhead=insertionathead(a,40);
     //   display(newhead);
        display(a);
        insertionatail(a,47);
        display(a);
        inserteionindex(a,3,59);
        display(a);

    }

}
