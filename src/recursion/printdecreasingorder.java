package recursion;

import java.util.Scanner;

public class printdecreasingorder {
    static void printdercreas(int n){
        if (n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printdercreas(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printdercreas(n);
    }
}
