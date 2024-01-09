package LINKEDLIST2.BASICSLINKEDLIST;

 class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}
class linkedlll{
    Node head=null;
    Node tail=null;

    void insertatanyindx(int idx, int val){
        Node t=new Node(val);
        Node temp=head;
        if (idx==size()) {
            insertatend(val);
            return;
        }
        if (idx==0) {
            insertathead(val);
            return;

        }
        for (int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        t.next=temp.next;
        temp.next=t;
    }
    void insertatend(int val){
        Node temp=new Node(val);
        if (head==null){
            head=temp;
        }
        else {
            tail.next=temp;
        }
        tail=temp;
    }
    void insertathead(int val){
        Node temp=new Node(val);
        if (head==null) {
            head = tail = temp;
        }
        else{
            temp.next=head;
            head=temp;
        }
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    int  size(){
        Node temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
     void deletelinkedlist(int idx){
        if (idx>=size()){
            System.out.println("cant delete");
            return;
        }
        if(idx==0){
            head = head.next;
            return;
        }

        Node temp=head;
        for (int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
     }
}
public class insertatanyindex{


    public static void main(String[] args) {
        linkedlll ll=new linkedlll();
       // ll.insertatanyindx(0,6);
        ll.insertatend(8);
        System.out.println(ll.size());
        ll.insertatanyindx(1,7);

        ll.insertatend(3);
        ll.insertatend(6);
        ll.insertathead(9);
        System.out.println();
        ll.display();
        System.out.println();
        ll.deletelinkedlist(8);
        ll.display();
    }
}
