package RECURSION02;

import java.util.Scanner;

public class kmultiplenum {
    static void kmulti(int n, int k) {
        if (k == 1){
            System.out.println(n);
            return;
        }
        kmulti(n, k - 1);
        System.out.println(n*k);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        System.out.println("enter the number");
        kmulti(n,k);
    }
}
