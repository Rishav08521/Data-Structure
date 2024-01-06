package stack;

import java.util.Scanner;
import java.util.Stack;

public class copyansmovestack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Scanner sc =new Scanner(System.in);
        int n;
        System.out.println("enter the elements you want to print");
        n=sc.nextInt();
        System.out.println("enter the elements");
        for (int i=1;i<=n;i++){
            int x=sc.nextInt();
            st.push(x);
        }
        System.out.println(st);

    }
}
