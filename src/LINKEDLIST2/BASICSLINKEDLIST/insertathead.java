package LINKEDLIST2.BASICSLINKEDLIST;

public class insertathead {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist1{
        Node head=null;
        Node tail=null;
        void insertathead(int val){
            Node temp=new Node(val);
            if (head==null){
                head=tail=temp;
            }
            else {
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
        int getel(int idx){
            Node temp=head;
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;

            }
            return count;
        }
    }
    public static void main(String[] args) {
        linkedlist1 ll=new linkedlist1();
        ll.insertathead(2);
        ll.insertathead(3);
        ll.insertathead(4);
        ll.insertathead(5);
        ll.insertathead(6);
        ll.display();
        System.out.println();
        System.out.println(ll.size());
        System.out.println(ll.getel(1));


    }
}
