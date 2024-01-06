package stack;

import java.util.Stack;

public class stackbasic {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        System.out.println("size:"+st.size());
        System.out.println(st);
        st.push(2);
        st.push(1);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(89);
        //System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size:"+ st.size());
        while(st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        // stack working on LIFO==>> Last In First Out
        //FILO===>> Fisrt in Last out
    }
}
