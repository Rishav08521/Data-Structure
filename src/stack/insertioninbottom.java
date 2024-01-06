package stack;

import java.util.Stack;

public class insertioninbottom {
    public static void main(String[] args) {
        Stack<Integer>st=new Stack<>();
        st.push(2);
        st.push(4);
        st.push(6);
        st.push(8);
        st.push(10);
        st.push(12);
        System.out.println(st);
        int idx=2;
        int x=7;
        Stack<Integer> gt=new Stack<>();
        while(st.size()>idx){
           // int x=st.peek();
            gt.push(st.pop());
        }
        gt.push(x);
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
