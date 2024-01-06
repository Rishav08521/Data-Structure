package recursion;

import java.util.Scanner;

public class printnnaturalnum {
    static void printincreaing(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        printincreaing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        printincreaing(n);
    }
}
