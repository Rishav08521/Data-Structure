package stack;

import java.util.Stack;

public class recusrivemethodtpprint {
    public static void recusrsivepri(Stack<Integer> gt){
        if(gt.size()==0) return;
        int top=gt.pop();
        System.out.print(top+" ");
        recusrsivepri(gt);
        gt.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(33);
        st.push(34);
        st.push(89);
        st.push(23);
        st.push(12);
        st.push(90);
        //System.out.println(st);
        recusrsivepri(st);
    }
}
