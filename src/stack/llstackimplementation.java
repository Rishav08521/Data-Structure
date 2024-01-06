package stack;

public class llstackimplementation {
    public static class Node { // user define data type
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
        public static class LLStack{  // user define data structure
            Node head=null;
            int size=0;
            void push(int x){
                Node temp=new Node(x);
                temp.next=head;
                head=temp;
                size++;

        }
        void displsayreverse(Node h){
                if (h==null) return;
                displsayreverse(h.next);
            System.out.print(h.val+" ");


        }
        void display(){
                displsayreverse(head);
            System.out.println();

        }
        void displayrev(){
                Node temp=head;
                while (temp!=null){
                    System.out.println(temp.val+" ");
                    temp=temp.next;
                }
            System.out.println();
        }
        int size(){
                return size;
        }
        int pop(){
                if(head==null){
                    System.out.println("satck is empty");
                    return -1;
                }
                int c=head.val;
                head=head.next;
                return c;

        }
        int  peek(){
                if (head==null){
                    System.out.println("stack is empty");
                    return -1;
                }
                return head.val;

        }
    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(23);
       // System.out.println(st);
        st.displayrev();
        st.push(432);
        st.displayrev();
      //  System.out.println(st);

        st.push(12);
        st.displayrev();
       // System.out.println(st);
        st.push(38);
        st.displayrev();
        System.out.println(st.size());
        //st.display();
       // System.out.println(st);
        st.pop();
        st.displayrev();
        System.out.print(st.size());
        st.peek();
        st.displayrev();
        System.out.print(st.size());
       // st.size();
       // System.out.println(st);

    }
}
