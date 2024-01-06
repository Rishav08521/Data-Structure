package recursion;

import java.util.Scanner;

public class factorial022 {
    static int fact(int n){
        if (n==0){
            return 1;
        }
        int smallfact=fact(n-1);
        int factorial=n*smallfact;
        return factorial;
    }
    public static void main(String[] args) {
        Scanner  sc =new Scanner(System.in);
        int n =sc .nextInt();
        System.out.println(fact(n));

    }
}
