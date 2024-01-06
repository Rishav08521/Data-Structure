package recursion;

import java.util.Scanner;

public class printnaturalnum01 {
    static void printnum(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printnum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc .nextInt();
        //System.out.println(printnum(n));
        //System.out.println(printnum(n););
        printnum(n);

    }
}
