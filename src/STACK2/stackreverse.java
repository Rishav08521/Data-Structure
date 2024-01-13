package STACK2;

import java.util.Stack;

public class stackreverse {
    public static void displayreverse(Stack<Integer> rt){
        if (rt.size()==0)return;
        int top=rt.pop();
        System.out.print(top+" ");
        displayreverse(rt);
        rt.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        displayreverse(st);
        //System.out.println(st);
    }
}
