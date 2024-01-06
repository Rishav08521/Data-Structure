package stack;

import java.util.Stack;

public class reversestack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(223);
        st.push(22);
        st.push(43);
        st.push(456);
        st.push(678);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        System.out.println(rt);
        Stack<Integer> gt=new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        System.out.println(gt);
       // Stack<Integer>qt=new Stack<>();
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
