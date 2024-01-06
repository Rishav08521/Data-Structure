package loopproblem;

import java.util.Scanner;

public class comlpexnumber {
    static  void add(int a1,int b1,int a2,int b2){
        int a=a1+a2;
        int b=b1+b2;
        System.out.println("additon of these two number is"+a+"+("+b+"i)");
    }
    static void sub(int a1,int b1,int a2,int b2){
        int a=a1-a2;
        int b=b1-b2;
        System.out.println("subtraction of these two number is"+a+"+("+b+"i)");
    }
    static void multiply(int a1,int b1,int a2,int b2){
        int a=a1*a2 - b1*b2;
        int b=a1*b2 + b2*b1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a1=sc.nextInt();
        System.out.println("enter the imaginary first number:");
        int b1=sc.nextInt();

        System.out.println("enter the real part of second number:");
        int a2=sc.nextInt();
        System.out.println("enter the imaginary part of second number:");
        int b2=sc.nextInt();
        System.out.println("first number is "+b1+"i");
        System.out.println("second number is"+b2+"i");
        add(a1,b1,a2,b2);
        sub(a1,b1,a2,b2);
        multiply(a1,b1,a2,b2);

    }
}
