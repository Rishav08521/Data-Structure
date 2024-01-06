package stack;

import java.util.Stack;

public class stackimplementinrecursive {
    public static void recursive(Stack<Integer> gt){
        gt.push(45);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(9);
        st.push(89);
        st.push(20);
        st.push(23);
        System.out.println(st);
        recursive(st);
        System.out.println(st);
    }
}
