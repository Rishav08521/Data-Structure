package stack;

import java.util.Stack;

public class movestackinanothersameorder {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st);
        Stack<Integer>gt=new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            gt.push(st.pop());
        }
        Stack<Integer>rt=new Stack<>();
        while(gt.size()>0){
            int y=gt.peek();
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}
