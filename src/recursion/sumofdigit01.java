package recursion;

import java.util.Scanner;

public class sumofdigit01 {
    static int sumnum(int n){
        if (n>=0 && n<=9){
            return n;
        }
        int lowerdigit=sumnum(n/10);
        int digit=lowerdigit+n%10;
        return digit;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(sumnum(n));

    }
}
