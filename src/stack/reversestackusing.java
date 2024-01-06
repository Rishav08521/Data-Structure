package stack;

import java.util.Stack;

public class reversestackusing {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(3);
        st.push(22);
        st.push(12);
        st.push(89);
        st.push(90);
        System.out.println(st);
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println(gt);
        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
        Stack<Integer>wt=new Stack<>();
        while(rt.size()>0){
            wt.push(rt.pop());
        }
        System.out.println(wt);

    }
}
