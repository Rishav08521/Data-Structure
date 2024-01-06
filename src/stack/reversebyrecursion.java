package stack;

import java.util.Stack;

public class reversebyrecursion {
    public static void pushatbottom(Stack<Integer> st, int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushatbottom(st,x);
        st.push(top);

    }
    public static void reversest(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reversest(st);
        pushatbottom(st,top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(23);
        st.push(12);
        st.push(34);
        st.push(56);
        st.push(29);
        System.out.println(st);
        reversest(st);
        System.out.println(st);
        //when stack is completely empty and try to st.pop() and st.peek() then will
        // be sh0wn exception thread;is caller underflow
        //error

        //if stack kis full i will try to st.push()
        //then it is called overflow
        //st.peek to give tipmost elements
    }
}
