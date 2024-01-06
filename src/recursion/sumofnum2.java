package recursion;

import java.util.Scanner;

public class sumofnum2 {
    static void printsumnum(int n){
        if (n==1){
            System.out.println(1);
            return;
        }
        printsumnum(n-1);
        System.out.println(n);

    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        printsumnum(n);

    }
}
