package stack;

import java.util.Scanner;
import java.util.Stack;

public class copyofstackinsameorder {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
       // int n;
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        System.out.println(st);
        Stack<Integer> str=new Stack<>();
        while(st.size()>0){
            int x=st.peek();
            str.push(x);
            st.pop();
           // str.push(st.pop()); another method
        }
        //System.out.println(str);
        Stack<Integer> gt=new Stack<>();
        while(str.size()>0){
            int y=str.peek();
            gt.push(y);
            str.pop();
        }
        System.out.println(gt);

//        System.out.println("enter the numbr of elements");
//         n=sc.nextInt();
//        System.out.println("enter the elements:");
//        for (int i=0;i<n;i++){
//            int x=sc.nextInt();
//            st.push(x);

     //   }
//        System.out.println(st);
    }
}
