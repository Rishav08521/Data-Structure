package arrayproblem.java;

import java.util.Scanner;

public class swapinteger {
//    static void swaparray( int a, int b) {
//        System.out.println("before swap");
//        System.out.println(a);
//        System.out.println(b);
//        int temp = a;
//        a=b;
//        b = temp;
//        System.out.println("after swap");
//        System.out.println(a);
//        System.out.println(b);

    public static void main(String[] args) {
       // System.out.println("enter teh array");
       Scanner sc =new Scanner(System.in);
//        int n= sc.nextInt();
      //  int[] arr= new int[n];
       // System.out.println(" enter "+ n + " elements ");
//        for (int i=0;i<n;i++){
           // arr[i]=sc.nextInt();

//        }
        int a=sc.nextInt();
        int b=sc.nextInt();
//        System.out.println("before swap");
//        System.out.println(a);
//        System.out.println(b);
//        int temp=a;
//        a=b;
//        b=temp;
//        System.out.println("after swap");
//        System.out.println(a);
//        System.out.println(b);
        System.out.println("before swap");
        System.out.println(a);
        System.out.println(b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("afetr swap");
        System.out.println(a);
        System.out.println(b);

    }


}
