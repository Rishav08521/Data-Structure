package stack;

public class stackimpplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
        public static class LLStack {
            Node head=null;
            int size=0;
            void push(int x){
                Node temp= new Node(x);
                temp.next=head;
                head=temp;
                size++;

            }


        }

    }
    public static void main(String[] args) {
       // LLStack st=new LLStack();

       // st.add(34);
//        st.push();
//
//        st.add(45);
//        st.push();
//        st.pop();
//        st.display();
//        System.out.println(st) ;


    }
}
