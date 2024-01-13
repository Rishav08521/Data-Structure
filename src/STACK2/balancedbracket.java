package STACK2;

import java.util.Scanner;
import java.util.Stack;

public class balancedbracket {
    public static boolean balancebracket(String str) {
        Stack<Character> st = new Stack<>();
        int n=str.length();
        for (int i=0;i<n;i++){
            char ch=str.charAt(i);
            if (ch=='('){
               st.push(ch);
            }
            else{
                if (st.size()==0) return false;
                if (st.peek()=='(') st.pop();
            }
        }
        if (st.size()>0) return false;
        else return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
       // balancebracket(str);
        System.out.println(balancebracket(str));
    }
}
