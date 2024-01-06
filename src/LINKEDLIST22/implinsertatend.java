package LINKEDLIST22;

public class implinsertatend {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }

    public static class linkedlist {
        Node head = null;
        Node tail = null;

        void inserteatend(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }

        }

        void insertathead(int val){
            Node temp=new Node(val);
            if (head==null){
                head=tail=null;
            }else{
                temp.next=head;
                head=temp;
            }


        }
        int size(){  //0(n)
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;

        }
        void insertedat(int idx, int val){

            Node t= new Node(val);
            Node temp=head;
            if (idx==size()){
                 inserteatend(val);
                return;
            } else if (idx==0) {
                insertathead(val);
                return;
            } else if (idx<size()|| idx>size()) {
                System.out.println("wronhg anser");
                return;
            }
            for (int i=0;i<idx-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }
        int getat(int idx){
            if (idx<0||idx>size()){
                System.out.println("wrong answer");
                return -1;
            }
            Node temp=head;
            for (int i=1;i<=idx;i++){
                temp=temp.next;
            }
            return temp.data;
        }
        public static void insertedatend(Node head, int val){
            Node temp=new Node(val);
            Node t=head;
            while(t.next!=null){
                t=t.next;

            }
            t.next=temp;
        }
        void deleteat(int idx){
            if (idx==0) head=head.next;
            Node temp=head;
            for (int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
        }

        public static void main(String[] args) {
            linkedlist ll = new linkedlist();
            ll.inserteatend(8);
            ll.inserteatend(4);
            ll.inserteatend(88);
//            ll.inserteatend(90);
//            ll.display();
           // ll.insertathead(100);
            //
            ll.insertedat(0,786);
            ll.display();
            System.out.println();
           // System.out.println(ll.head.data);
            //ll.display();
            //System.out.println(ll.getat(2));
//            insertedatend(1,87);
//            ll.display(ll);
            ll.deleteat(1);
            ll.display();
        }
    }
}
