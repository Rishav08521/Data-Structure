package stack;

public class stackinarrayimplementation {
    public static class Stack{
        private  int[] arr=new int[5];
        private int idx=1;
        void push(int x){
            if(isfull()){
                System.out.println("stack is full");
                return ;
            }
            arr[idx]=x;
            idx++;

        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;

            }
            return arr[idx]=-1;
        }
        int pop(){
            if(idx==0){
                System.out.println("stacl is empty");
                return -1;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }
        void display(){
            for(int i=0;i<idx-1;i++){
                System.out.println(arr[i]);
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isempty() {
            if (idx == 0) return true;
            else
                return false;
        }
        boolean isfull(){
            if(idx==arr.length) return true;
            else return false;
        }

    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(12);
        st.display();
        st.push(23);
        st.display();
        st.push(45);
        st.display();
        st.push(78);
        st.display();
        System.out.println(st.size());
        st.pop();
        System.out.println(st);
        st.peek();
        System.out.println(st);
        st.display();
        //System.out.println(st.size());
        System.out.println(st);

    }
}
