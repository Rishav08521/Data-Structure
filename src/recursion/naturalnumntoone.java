package recursion;

import java.util.Scanner;

public class naturalnumntoone {
    static void printnatural(int n){
        if ( n==1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printnatural(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printnatural(n);

    }
}
