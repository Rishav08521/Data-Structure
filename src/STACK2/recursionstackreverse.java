package STACK2;

import java.util.Stack;

public class recursionstackreverse {
    public static void pushbottom(Stack<Integer> st, int x){
        if (st.size()==0) {
            st.push(x);
            return;
        }
        int top=st.pop();
        pushbottom(st,x);
        st.push(top);
    }
    public static void revrse(Stack<Integer> st){
        if (st.size()==1){
            int top=st.pop();
            revrse(st);
            pushbottom(st,top);
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        revrse(st);
        System.out.println(st);

    }
}
