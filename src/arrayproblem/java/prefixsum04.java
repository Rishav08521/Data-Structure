package arrayproblem.java;

import java.util.Scanner;

public class prefixsum04 {
    static void printarray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    static int[] prefixsumof(int [] arr){
        int n=arr.length;
        int[] prefix=new int[n];
        prefix[0]=arr[0];
        for (int i=1;i<n;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("enter "+n + " elements");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the array");
        printarray(arr);
        int[] prefix1=prefixsumof(arr);
        printarray(prefix1);

    }
}
