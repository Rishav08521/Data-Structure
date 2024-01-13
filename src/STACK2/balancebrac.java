package STACK2;

import java.util.Scanner;
import java.util.Stack;

public class balancebrac {
    public static boolean blanacedallbrak(String str){
        Stack<Character> s=new Stack<>();
        int n=str.length();
        for (int i=0;i<n;i++){
            char ch=str.charAt(i);
            if (ch=='('+'{'+'['){
                s.push(ch);
            }
            else{
                if (s.size()==0) return false;
                if (s.peek()=='('+'{'+'[') s.pop();
            }
        }
        if (s.size()>0) return false;
        else return true;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(blanacedallbrak(str));
    }
}
