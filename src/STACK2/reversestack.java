package STACK2;

import java.util.Stack;

public class reversestack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while (st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> gt=new Stack<>();
        while (rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
