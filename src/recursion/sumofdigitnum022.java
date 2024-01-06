package recursion;

import java.util.Scanner;

public class sumofdigitnum022 {
    static int sumofdigit(int n){
        if (n>=0&&n<=1){
            return n;
        }
        int smalldigit=sumofdigit(n/10);
        int digitsum=smalldigit+n%10;
        return digitsum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumofdigit(n));

    }
}
