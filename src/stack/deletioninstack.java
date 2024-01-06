package stack;

import java.util.Stack;

public class deletioninstack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(23);
        st.push(34);
        st.push(45);
        st.push(56);
        System.out.println(st);
        Stack<Integer>dt=new Stack<>();
        int idx=3;
        while(st.size()>idx+1){
            dt.push(st.pop());
        }
        st.pop();
        while(dt.size()>0){
            st.push(dt.pop());
        }
        System.out.println(st);
    }
}
