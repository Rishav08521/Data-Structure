package STACK2;

import stack.arrayimplementationinstack;

import java.util.Stack;

public class copyofelemnts {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0){
//            int x=st.peek();
//            rt.push(x);
//            st.pop();
            rt.push(st.pop());

        }
        System.out.println(rt);
    }
}
