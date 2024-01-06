package loopproblem;

import java.util.Scanner;

public class smallestnumi {
    public static void main(String[] args) {
        System.out.println("enter the three num");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println(smallest(a,b,c));
    }
    public static int smallest(int a,int b,int c){
        return Math.min(a,Math.min(b,c));
    }
}
