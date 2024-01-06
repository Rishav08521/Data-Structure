package recursion;

import java.util.Scanner;

public class fact022 {
    static int factnum(int n){
        if (n==0) return 1;
        int smallfact=factnum(n-1);
        int fact=n*smallfact;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        //System.out.println(factnum(5));
        System.out.println(factnum(n));

    }
}
