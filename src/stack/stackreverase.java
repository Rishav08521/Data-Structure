package stack;

import java.util.Scanner;
import java.util.Stack;

public class stackreverase {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        System.out.println("enter the elelments");
        st.push(2);
        st.push(4);
        st.push(1);
        st.push(6);
        st.push(9);
        System.out.println(st);
        Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            //st.peek();
            rt.push(x);
            st.pop();
           // rt.push(st.pop());
        }
        System.out.println(rt);


    }
}
