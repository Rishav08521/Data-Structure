package recursion;

import java.util.Scanner;

public class sumoferies2 {
    static int sumseries(int n){
        if (n==0){
            return n;
        }
        if (n%2==0){
            return sumseries(n-1 )- n;
        }else{
            return sumseries(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumseries(n));

    }
}
