package stack;

import java.util.Stack;

public class displaaystack2 {
    public static void displayrec(Stack<Integer> st){
       // st.push(5);
        if(st.size()==0) return;
        int top=st.pop();
        // displayrec(st);
        System.out.print(top+" ");
        displayrec(st);
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(3);
        st.push(33);
        st.push(67);
        st.push(89);
        st.push(22);
        displayrec(st);
       // System.out.println(st);
      //  displayrec(st);
       // System.out.println(st);
        //displayrec(st);
        //System.out.println(st);
//        Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        while(rt.size()>0){
//            int  x=rt.pop();
//            System.out.println(x+" ");
//           // rt.push();
//            st.push(x);
////        }
//        int n=st.size();
//        int[] arr=new int[n];
//        for (int i=n-1;i>=0;i--){
//            arr[i]=st.pop();
//        }
//        for (int i=0;i<n;i++){
//            System.out.println(st.size());
//            st.push(arr[i]);
//            //st.push(n);
//        }
    }
}
