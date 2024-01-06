package QUEUES;

public class linklistimplemenation {
    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public static class queuell{
            Node tail=null;
            Node head=null;
            int size=0;
            public void add(int x){
                Node temp=new Node(x);
                if(size==0){
                    head=tail=temp;
                }else{
                    tail.next=temp;
                    tail=temp;
                }
                size++;
            }
            public int peek(){
                if(size==0){
                    System.out.println("queue is empty");
                    return -1;
                }
                return head.val;
            }
            public int remove(){
                if (size==0){
                    System.out.println("queue is empty");
                    return -1;
                }
                int x= head.val;
                head=head.next;
                size--;
                return x;
            }
            public void display(){
                if(size==0){
                    System.out.println("queue is empty");
                    return ;
                }
                Node temp=null;
                while(temp!=null){
                    System.out.println(temp.val+" ");
                    temp=temp.next;
                }
                System.out.println();
            }
            public boolean isEmpty(){
                if(size==0) return true;
                else return false;
            }
        }
    public static void main(String[] args) {
        queuell q1=new queuell();
        q1.display();
        System.out.println(q1.isEmpty());
        q1.add(34);
        q1.add(12);
        System.out.println(q1.isEmpty());
        q1.add(34);
        q1.add(45);
        q1.display();
        q1.add(56);
        q1.add(78);
        System.out.println(q1.peek());
        q1.remove();
        q1.display();
        //System.out.println(q1.peek());



    }
}
