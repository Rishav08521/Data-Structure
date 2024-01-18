package STACK2;

import java.util.Stack;

public class greatestnumstack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(15);
        st.push(6);
        st.push(7);
        System.out.println(st);
       // int
         Stack<Integer> st2 = new Stack<>();

        int max = Integer.MIN_VALUE;

        while(st.size()!=0){
            int a = st.pop();
            if(a>max) max = a;
            st2.push(a);

        }
        System.out.println(st);
        System.out.println(st2);
        System.out.println(max);

    }
}
