package stack;

import java.util.Scanner;
import java.util.Stack;

public class moveelementsinaanother {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        st.push(4);
        st.push(5);
        st.push(34);
        st.push(67);
        st.push(89);
        System.out.println(st);
        Stack<Integer> gt=new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        Stack<Integer> rt=new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());

        }
        System.out.println(rt);
    }
}
