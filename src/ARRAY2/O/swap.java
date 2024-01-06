package ARRAY2.O;

import java.util.Scanner;

public class

swap {
    static void swapnum(int a , int b){
       System.out.println("before swap");
        System.out.println("before swap a:"+a);
        System.out.println("before swap b:"+b);
        int temp= a;
        a=b;
        b=temp;
        System.out.println("after swap");
        System.out.println("after swap a:"+a);
        System.out.println("after swap b:"+b);
    }

    public static void main(String[] args) {
        int a=3;
        int b=8;

        swapnum(a,b);

    }
}
