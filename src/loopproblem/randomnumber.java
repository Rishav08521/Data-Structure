package loopproblem;

import java.util.Scanner;

public class randomnumber {
    static void randominteger(int a,int b,int n){
        int x=b-a;
        for(int i=0;i<n;i++){
            System.out.println(a+(int)(Math.random()*x)+" ");
        }
    }
    static void randomlong(int a,int b,int n){
        int x=b-a;
        for(int i=0;i<n;i++){
            System.out.println(a+(int)(Math.random()*x)+" ");
        }
    }
    static void randomfloat(int a,int b,int n){
        int x=b-a;
        for(int i=0;i<n;i++){
            System.out.println(a+(Math.random()*x)+" ");
        }
    }
    static void randomdouble(int a,int b,int n){
        int x=b-a;
        for(int i=0;i<n;i++){
            System.out.println(a+(Math.random()*x)+" ");
        }
    }
    public static void main(String[] args) {
         Scanner  sc=new Scanner(System.in);
        System.out.println("enetr the range of number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("how many want to print");
        int n=sc.nextInt();
        System.out.println("random integer number between"+a+" to"+b);
        randominteger(a,b,n);
        System.out.println();
        System.out.println();

        System.out.println("random long number between"+a+"to"+b);
        randomlong(a,b,n);
        System.out.println();
        System.out.println();
        System.out.println("random float number between"+a+"to"+b);
        randomfloat(a,b,n);
        System.out.println();
        System.out.println();
        System.out.println("random double number between "+a+"to"+b);
        randomdouble(a,b,n);
        System.out.println();
        System.out.println();


    }
}
