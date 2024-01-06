package stack;

import java.util.Stack;

public class insertioninstack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(12);
        st.push(23);
        st.push(34);
        st.push(45);
        System.out.println(st);
        Stack<Integer> dt=new Stack<>();
        int idx=2;
        int num=56;
        while(st.size()>idx){
            dt.push(st.pop());
        }
        st.push(num);
        while(dt.size()>0){
            st.push(dt.pop());
        }
        System.out.println(st);

    }
}
