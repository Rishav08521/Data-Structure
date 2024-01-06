package stack;

import java.util.Stack;

public class removefrombottominstack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(23);
        st.push(24);
        st.push(26);
        st.push(28);
        st.push(30);
        System.out.println(st);
        Stack<Integer> gt=new Stack<>();
        while(st.size()>23){ //and size>1; depend upon question
            gt.push(st.pop());
        }
        st.pop();
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}
