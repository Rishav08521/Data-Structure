package linkedlist;

public class implementation {

    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        node head=null;
        node tail=null;
        int size=0;
        void insertedend(int val){
            node temp=new node(val);
            if (head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
            size++;

        }
        void insertedhead(int val){
            node temp=new node(val);
            if (head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;

        }
        void insertedat(int index,int val){
            node t=new node(val);
            node temp=head;
            if (index==size){
                insertedend(val);
                return;
            } else if (index==0) {
                insertedhead(val);
                return;
            } else if (index<0||index>size) {
                System.out.print("wrong");
                return;
            }
            for (int i=0;i<index-1;i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
            size++;
        }
        int getat(int index){
            node temp=head;
            for (int i=0;i<index;i++){
                temp=temp.next;

            }
            return temp.data;
        }
        void delete(int index){
            node temp=head;
            for (int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;

        }
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp =temp.next;
            }
            System.out.println();
        }
//        int size(){
//            node temp=head;
//            int count =0;
//            while (temp != null) {
//                count++;
//
//                System.out.print(temp.data+" ");
//                temp=temp.next;
//            }
//            return count;
//        }

    }
    public static void main(String[] args) {
        linkedlist a=new linkedlist();
        a.insertedhead(10);
        a.insertedend(4);
       // a.display();  //4
        a.insertedend(23);
        //a.display();  //4->23
        a.insertedend(6);
       // a.display();  // 4->23->6
        a.insertedend(25);
       // a.display();  // 4->23->6->25
        a.insertedat(5,55);
       // a.display();
        a.insertedat(0,100);
        a.display();
        System.out.println(a.getat(3));
        a.delete(3);
        a.display();

        //System.out.println(a.size());


    }
}
