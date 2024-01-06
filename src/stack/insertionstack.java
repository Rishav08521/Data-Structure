package stack;

import java.util.Stack;

public class insertionstack {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(45);
        st.push(21);
        st.push(56);
        st.push(90);
        st.push(41);
        st.push(89);
        System.out.println(st);
        int inx=3;
        int num=33;
        Stack<Integer> dt=new Stack<>();
        while(st.size()>inx){
            dt.push(st.pop());
        }
        st.push(num);
        while(dt.size()>0){
            st.push(dt.pop());
        }
        System.out.println(st);
    }
}
