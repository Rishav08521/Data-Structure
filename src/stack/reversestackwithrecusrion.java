package stack;

import java.util.Stack;

public class reversestackwithrecusrion {
    public static void pushatbottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top=st.pop();
        pushatbottom(st,x);
        st.push(top);
       // reverserecu(st);
    }
    public static void reverserecu(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverserecu(st);
        pushatbottom(st,top);
        //System.out.println(top+" ");
       // st.push(top);
;    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(9);
        st.push(4);
        st.push(54);
        st.push(89);
        st.push(22);
        System.out.println(st);
        reverserecu(st);
        System.out.println(st);
    }
}
