package arrayproblem.java;

import java.util.Scanner;

public class suffix {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void suffixsum(int[] arr){
        int n=arr.length;
       // int r=0;
        for (int i=n-2;i>=0;i--){
            arr[i]=arr[i+1]+arr[i];
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("eneter the arry");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter " +n+ " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("enetr array");
        printarray(arr);
        suffixsum(arr);

    }
}
