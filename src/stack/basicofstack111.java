package stack;

import java.util.ArrayList;
import java.util.Stack;

public class basicofstack111 {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();
        Stack<Integer> sc=new Stack<>();
        sc.push(2);
        sc.push(7);
        sc.push(8);
        sc.push(4);
        sc.push(23);
        sc.push(90);
        sc.push(89);
        System.out.println(sc.pop());
        System.out.println(sc.peek());
        sc.pop();
        System.out.println(sc);
        System.out.println(sc.size());
        while(sc.size()>1){
           // System.out.println(sc);
            sc.pop();
        }
        System.out.println(sc.peek());
        System.out.println(sc);
    }
}
