package recursion;

import java.util.Scanner;

public class factorialnum0333 {
    static int factnum(int n){
        if (n==0){
           // System.out.println(1);
            return 1;
        }
        int smallfact=factnum(n-1);
        int fact=n*smallfact;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(factnum(n));

    }
}
