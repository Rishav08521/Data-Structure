package recursion2;

import java.util.Scanner;

public class sumofnnumindiffersign {
    static int sumoferies(int n){
        if (n==0){
            return 0;
        }
        return sumoferies(n-1)+n;


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumoferies(n));



    }
}
