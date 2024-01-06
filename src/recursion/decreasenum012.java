package recursion;

import java.util.Scanner;

public class decreasenum012 {
    static void decreasenum(int n){
        if (n==0){
            System.out.println(n);
            return;
        }
        decreasenum(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        decreasenum(n);

    }
}
